package com.example.student.a2018010301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=(ImageView)findViewById(R.id.imageView);
        btn=(Button)findViewById(R.id.button);
    }
    public void click1(View v){
        img.setImageResource(R.drawable.s123);
    }
    public void click2(View v){
        Picasso.with(MainActivity.this).load("https://tshop.r10s.com/9e457980-ec8b-11e4-9861-005056ae6702/upload/0120/DSC00329.jpg").into(img);
    }
}
