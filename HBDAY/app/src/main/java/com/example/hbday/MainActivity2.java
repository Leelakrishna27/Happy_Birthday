package com.example.hbday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onphoto(View v){
        Intent inte=new Intent(this,MainActivity4.class);
        startActivity(inte);
    }
    public void vidactivity(View g){
        Intent ite=new Intent(this,MainActivity6.class);
        startActivity(ite);
    }
    public void ontext(View o){
        Intent it=new Intent(this,textactivity.class);
        startActivity(it);
    }
}