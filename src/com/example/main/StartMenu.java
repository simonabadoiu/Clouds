package com.example.main;

import com.example.clouds.Activity1;
import com.example.clouds.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StartMenu extends Activity{

	@Override
    protected void onCreate(Bundle savedInstanceState) {
	   super.onCreate(savedInstanceState);
	   this.setContentView(R.layout.start_menu);
	   
	   Button create = new Button(this);
	   create.setOnClickListener(new OnClickListener() {

    	   @Override
    	   public void onClick(View v) {
    	   }
	   });
	   
	   Button play = new Button(this);
	   play.setOnClickListener(new OnClickListener() {

    	   @Override
    	   public void onClick(View v) {	   
    		   Intent myIntent = new Intent(StartMenu.this, Activity1.class);

	    	   startActivity(myIntent);
    	   }
	   });
	}	
}
