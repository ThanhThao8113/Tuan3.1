package com.example.test.tuan31;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test.R;

import java.util.ArrayList;

public class t31Adapter extends BaseAdapter {
    private ArrayList<T31Contact> ls;
    private Context context;

    public t31Adapter(ArrayList<T31Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    //lay ve so lương item
    @Override
    public int getCount() {
        return ls.size();
    }

    //lay ve item
    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    //lay ve id
    @Override
    public long getItemId(int position) {
        return position;
    }
    //tao View và gan du lieu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //b1 tao View
        ViewAX vax;
        //neu chua co view thi ta tao view moi
        if(convertView==null){
            vax=new ViewAX();//tao view moi
            //anh xa layout
            convertView = LayoutInflater.from(context).inflate(R.layout.tuan31_listview_item, null);
            //anh xa tung thanh phan trong layout
            vax.img_hinh=convertView.findViewById(R.id.t31ItemHinh);
            vax.tv_ten=convertView.findViewById(R.id.t31ItemTen);
            vax.tv_tuoi=convertView.findViewById(R.id.t31ItemTuoi);
            //tao template de lan sau su dung
            convertView.setTag(vax);
        }
        //neu da co view thi su dung view cu
        else {
            vax=(ViewAX) convertView.getTag(); //lay view cu
        }
        //gan du lieu cho layout
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView; //tra ve ket  qua
    }
    //dinh nghia view
    class ViewAX{
        ImageView img_hinh;
        TextView tv_ten, tv_tuoi;
    }
}
