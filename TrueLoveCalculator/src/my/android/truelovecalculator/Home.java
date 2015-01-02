package my.android.truelovecalculator;

import android.R.menu;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Home extends Fragment{
    
	protected static final CharSequence ok = null;
	Intent intentResult;
	Button calculate;
	TextView result;
	protected CharSequence cancel;
	VideoView vid;

	/*public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.activity_home, container, false);
	
		calculate = (Button) findViewById(R.id.button1);
	    calculate.setOnClickListener(new View.OnClickListener() {
	      @Override
	      public void onClick(View v) {
	        
	      }
	    });
	}
*/
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
		      Bundle savedInstanceState) {
		    View homeView = inflater.inflate(R.layout.activity_home,
		        container, false);
		    
		  
		    
		    
		    calculate = (Button) homeView.findViewById(R.id.button1);
		    result = (TextView) homeView.findViewById(R.id.textView3);
		    //test = (TextView) home.findViewById(R.id.test);
		    intentResult = new Intent(getActivity(), ResultActivity.class);
		    calculate.setOnClickListener(new View.OnClickListener() {
		      
		    	 
			       
			    	      
			    	      
		    	@Override
		      public void onClick(View v) {
		      result.setText("89%");
		      startActivity(intentResult);
		    
		     
		    		  		       
		    		
		    		
		    		
		    	
		    		
		    		
		    		
		    		
		      }
		    	
		    });
		    
		    return homeView;
		    
		  }
	
	
	
	protected Context getApplicationContext() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	

	

	
	
}//this is the END BRAVE MAN.
