package com.example.clouds;

import com.example.clouds.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class StartMenu extends Activity{

	@Override
    protected void onCreate(Bundle savedInstanceState) {
	   super.onCreate(savedInstanceState);
	   this.setContentView(R.layout.start_menu);
	   LinearLayout ll0 = (LinearLayout)findViewById(R.id.newTHbtn1);
	   Button create = new Button(this);
	   create.setText("Create Quest");
	   ll0.addView(create);
	   create.setOnClickListener(new OnClickListener() {

    	   @Override
    	   public void onClick(View v) {
    	   }
	   });
	   LinearLayout ll1 = (LinearLayout)findViewById(R.id.playTHbtn);
	   Button play = new Button(this);
	   play.setText("Play Quest");
	   ll1.addView(play);
	   play.setOnClickListener(new OnClickListener() {

    	   @Override
    	   public void onClick(View v) {	   
    		   Intent myIntent = new Intent(StartMenu.this, Activity1.class);
	    	   Log.d("MSG", "Deschide nou activity");
    		   startActivity(myIntent);
    	   }
	   });
	}	
}
