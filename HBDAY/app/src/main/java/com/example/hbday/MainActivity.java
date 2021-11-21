package com.example.hbday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.editTextTextPersonName4);
        ed2=findViewById(R.id.editTextTextPersonName5);
    }

    public void onsub(View v){
        String str1=ed1.getText().toString();
        String str2=ed2.getText().toString();
        if(str1.equals("bindu") && str2.equals("udnib")) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
        }

}