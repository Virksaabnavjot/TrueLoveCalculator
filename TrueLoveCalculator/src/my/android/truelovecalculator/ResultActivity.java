package my.android.truelovecalculator;

import java.io.InputStream;

import nav.gif.GifRun;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Movie;
import android.graphics.PixelFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.Window;
import android.widget.MediaController;
import android.widget.VideoView;

public class ResultActivity extends Activity {
    
	private Movie mMovie;
	public MediaPlayer resultPlayer;
	 // Declare variables
    ProgressDialog pDialog;
    VideoView videoview;
 
    // Insert your Video URL
    String VideoURL = "http://vid-high.ve.vc/punjabi/high/Ungli%20Pe%20Nachalein%20-%20Emraan%20Hashmi%20.mp4";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		//@@ Navjot this code is to hide action bar
		
	    getActionBar().hide();
		
		/*SurfaceView surfView = (SurfaceView) findViewById(R.id.surfaceView1);
		surfView.setZOrderOnTop(true);    // necessary
		SurfaceHolder sfhTrackHolder = surfView.getHolder();
		sfhTrackHolder.setFormat(PixelFormat.TRANSPARENT);
		GifRun g = new GifRun();
		g.LoadGiff(surfView, this, R.drawable.anilove);  */
		
		//@@Navjot to check the screen size and set orientations
		switch (getResources().getDisplayMetrics().densityDpi) {
        case DisplayMetrics.DENSITY_LOW:
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            break;
        case DisplayMetrics.DENSITY_MEDIUM:
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            break;
        case DisplayMetrics.DENSITY_HIGH:
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            break;
        case DisplayMetrics.DENSITY_XHIGH:
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            break;
        }
		
	    
		
		
		// MediaPlayer for playing background music
		resultPlayer = MediaPlayer.create(this, R.raw.blueeyes);
		resultPlayer.start();
		resultPlayer.setLooping(false);
		
		
		//@@ VIDEVIEW
		
		videoview = (VideoView) findViewById(R.id.video);
        // Execute StreamVideo AsyncTask
 
        // Create a progressbar
        pDialog = new ProgressDialog(ResultActivity.this);
        // Set progressbar title
        pDialog.setTitle("True Love Calculator");
        // Set progressbar message
        pDialog.setMessage("Buffering... Please Wait");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(true);
        // Show progressbar
        pDialog.show();
 
        try {
            // Start the MediaController
            MediaController mediacontroller = new MediaController(
            		ResultActivity.this);
            //mediacontroller.setAnchorView(videoview);
            // Get the URL from String VideoURL
            Uri video = Uri.parse(VideoURL);
            videoview.setMediaController(mediacontroller);
            videoview.setVideoURI(video);
           
 
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
 
        videoview.requestFocus();
        videoview.setOnPreparedListener(new OnPreparedListener() {
            // Close the progress bar and play the video
            public void onPrepared(MediaPlayer mp) {
                pDialog.dismiss();
                videoview.start();
                
            }
        });
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	 
	protected void onDestroy(){
		super.onDestroy();
		resultPlayer.release();
	}
	
	protected void onPause(){
		super.onPause();
		resultPlayer.pause();
	}
	
	protected void onResume(){
		super.onResume();
		resultPlayer.start();
	}

	protected void onStart(){
		super.onStart();
		resultPlayer.start();
	}
	
	protected void onStop(){
		super.onStop();
		resultPlayer.stop();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}

}
