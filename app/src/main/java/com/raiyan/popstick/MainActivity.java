package com.raiyan.popstick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void method1(){
        Toast.makeText(this,"This is raiyan's method1",Toast.LENGTH_SHORT).show();
    }
}
