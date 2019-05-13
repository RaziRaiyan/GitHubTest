package com.raiyan.popstick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	
	public  void testMethod1(){
		Toast.makeText(getApplicationContext(),"Hello this is the test method-1",Toast.LENGTH_SHORT);
    	}


	public  void testMethod2(){
		Toast.makeText(getApplicationContext(),"Hello this is the test method-2",Toast.LENGTH_SHORT);
    	}


	public  void testMethod33(){
		Toast.makeText(getApplicationContext(),"Hello this is the test method-33",Toast.LENGTH_SHORT);
    	}
}
