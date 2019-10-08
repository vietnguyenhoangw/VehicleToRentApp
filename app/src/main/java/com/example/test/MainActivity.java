package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gr;
    ArrayList<Xe> arrayList;
    XeAdapter xeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gr = findViewById(R.id.gr);
        arrayList = new ArrayList<>();
        xeAdapter = new XeAdapter(this, R.layout.item, arrayList);

        arrayList.add(new Xe(R.drawable.hinh1,"Honda", 3, 17));
        arrayList.add(new Xe(R.drawable.hinh2,"Suzuki", 5, 29));
        arrayList.add(new Xe(R.drawable.hinh3,"Toyota", 9, 17));
        arrayList.add(new Xe(R.drawable.hinh4,"Hazate", 5, 39));
        arrayList.add(new Xe(R.drawable.hinh5,"Wave", 3, 27));
        arrayList.add(new Xe(R.drawable.hinh6,"Sirius", 2, 19));

        gr.setAdapter(xeAdapter);
    }
}
