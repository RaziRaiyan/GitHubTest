package com.raiyan.popstick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	
	public  void testMethod(){
		Toast.makeText(getApplicationContext(),"Hello this is the test method",Toast.LENGTH_SHORT);
    	}
}
