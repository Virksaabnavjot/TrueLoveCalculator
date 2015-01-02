package my.android.truelovecalculator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Page2 extends Fragment {
	/*public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.activity_page2, container, false);
	}*/
	
	//declare variables
	Button openVideoLibraryButton;
	Intent intentVideoLibrary;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
		      Bundle savedInstanceState) {
		//@@@@Navjot Very important line if using Fragments   
		View page2View = inflater.inflate(R.layout.activity_page2,
		        container, false);
		    
		    //declaring videoview
		    VideoView videoPage2 = (VideoView) page2View.findViewById(R.id.video1);
		    Uri uri = Uri.parse("android.resource://my.android.truelovecalculator/"+ R.raw.lovevideo); 
		    //@@navjot this is to refrence video from raw folder
            MediaController mediacontrollerPage2 = new MediaController(getActivity());
		    videoPage2.setVideoURI(uri); 
		    videoPage2.setMediaController(mediacontrollerPage2);
		    videoPage2.start();
		    
		    
		    openVideoLibraryButton  = (Button) page2View.findViewById(R.id.openVideoLibraryButton);
		    
		    //test = (TextView) home.findViewById(R.id.test);
		    intentVideoLibrary = new Intent(getActivity(), VideoLibrary.class);
		    openVideoLibraryButton.setOnClickListener(new View.OnClickListener() {
		    	@Override
			      public void onClick(View v) {
			      
			      startActivity(intentVideoLibrary);
			    
			     
			    		  		       
			    		
			    		
			    		
			    	
			    		
			    		
			    		
			    		
			      }
			    	
			    });
		    
		    return page2View;
		    
		  }
}
