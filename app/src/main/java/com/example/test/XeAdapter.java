package com.example.test;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class XeAdapter extends ArrayAdapter<Xe> {

    Context context;
    ArrayList<Xe> arrayList;
    int resource;

    TextView ten;
    Button button;
    ImageView imageView;

    public XeAdapter(@NonNull Context context, int resource, ArrayList<Xe> arrayList) {
        super(context, resource, arrayList);
        this.context = context;
        this.resource = resource;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(resource, null);

        final EditText editText = convertView.findViewById(R.id.editText2);
        final RadioButton thuengay = convertView.findViewById(R.id.radioButton);
        final RadioButton thuegio = convertView.findViewById(R.id.radioButton2);
        imageView = convertView.findViewById(R.id.imageView);
        ten = convertView.findViewById(R.id.textView);

        final Xe xe = arrayList.get(position);

        ten.setText(xe.getTen());
        imageView.setImageResource(xe.getHinh());
        thuegio.setText(xe.getGiathuegio() + " USD/Hour");
        thuengay.setText(xe.getGiathuengay() + " USD/Day");


        button = convertView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText.getText().length() <= 0) {
                    editText.setError("Nhap so");
                }
                else {

                    int gia;
                    int soluong = Integer.parseInt(editText.getText().toString());

                    if (thuengay.isChecked()) {
                        gia = xe.getGiathuengay();
                    }
                    else {
                        gia = xe.getGiathuegio();
                    }

                    Toast.makeText(context, "Total: " + (gia * soluong), Toast.LENGTH_SHORT).show();
                }
            }
        });

        return convertView;
    }
}
