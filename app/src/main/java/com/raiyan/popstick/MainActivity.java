package com.raiyan.popstick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"This is toast for checking conflict",Toast.LENGTH_SHORT).show();

        Toast.makeText(this,"This is toast for checking conflict",Toast.LENGTH_SHORT).show();
    }

    public void method1(){
        Toast.makeText(this,"This is raiyan's method1",Toast.LENGTH_SHORT).show();
    }

    public void pullRequestTest(){
        String testPull = "Creating pull request to be merged with master";
    }

    public void pullRequestTest2(){
        String testPull = "Creating pull request to be merged with master 2";
    }

    public void newChangeInMaster(){
    	String test = "This is new change in master";
	}


	public void pullRequestTest3(){
        String testPull = "Creating pull request to be merged with master 3";
    }


	public  void testMethod33(){
		Toast.makeText(getApplicationContext(),"Hello this is the test method-33",Toast.LENGTH_SHORT);

    }

}
