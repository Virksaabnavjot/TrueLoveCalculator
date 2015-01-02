package my.android.truelovecalculator;

import nav.gif.GifRun;
import nav.gif.GifRun;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Page1 extends Fragment{
	GifRun gg;
	SurfaceView surfView1;
	/*public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.activity_page1, container, false);
		
		
		
	}*/

public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.activity_page1,
	        container, false);
	    
	    
	    
	    return view;
	    
	  }

}
