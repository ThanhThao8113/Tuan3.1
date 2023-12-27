package com.example.test.tuan31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.test.R;

import java.util.ArrayList;

public class Tuan31MainActivity extends AppCompatActivity {
    ListView lv;
    t31Adapter adapter;
    ArrayList<T31Contact> ls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan31_main);
        lv=findViewById(R.id.tuan31Lv);
        //tao nguon du lieu
        ls.add(new T31Contact("Nguyen Van A", "18", R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Van B", "19", R.drawable.ic_launcher_foreground));
        ls.add(new T31Contact("Nguyen Van C", "25", R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Van D", "16", R.drawable.ic_launcher_foreground));
        ls.add(new T31Contact("Nguyen Van E", "63", R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Van F", "20", R.drawable.ic_launcher_foreground));
        //tao adapter
        adapter=new t31Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}