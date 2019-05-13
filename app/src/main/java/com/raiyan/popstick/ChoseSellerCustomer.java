package com.raiyan.popstick;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ChoseSellerCustomer extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_seller_consumer);
    }

    public void testMethod(){
        Toast.makeText(this,"This is raiyan",Toast.LENGTH_SHORT).show();
    }
}
























