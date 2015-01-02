package my.android.truelovecalculator;


import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class VideoLibrary extends YouTubeFailureRecoveryActivity implements
YouTubePlayer.OnInitializedListener{
	
	public static final String API_KEY = "AIzaSyCe6tORd9Ch4lx-9Ku5SQ476uS9OtZYsWA";
	
	public static final String VIDEO_ID = "sUy6WJL7wV8";
	
	//Button v1;
	//Intent intentV1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_library);
		
		//@@Navjot YOUTUBE
		 YouTubePlayerView youTubePlayerView = (YouTubePlayerView)findViewById(R.id.youtubeplayerview);
	        youTubePlayerView.initialize(API_KEY, this);
	        
	    //@@navjot add code for button to start new activity
	      // v1 = (Button) findViewById(R.id.v1);
	        
	        
	            
	       
	        
	}

	
	//start new activity
	public void v1(View view) {
		Intent intent = new Intent(this, V1.class);
		
		startActivity(intent);
	}
	
	public void main(View view) {
		Intent intent = new Intent(this, MainActivity.class);
		
		startActivity(intent);
	}
	
	public void playList(View view) {
		Intent intent = new Intent(this, VideoPlaylist.class);
		
		startActivity(intent);
	}
	
	//@@@Navjot
	@Override
	public void onInitializationFailure(Provider provider,
			YouTubeInitializationResult result) {
		Toast.makeText(getApplicationContext(), 
				"onInitializationFailure()", 
				Toast.LENGTH_LONG).show();
	}
	
	//@@Navjot
	@Override
	public void onInitializationSuccess(Provider provider, YouTubePlayer player,
			boolean wasRestored) {
		if (!wasRestored) {
		      player.cueVideo(VIDEO_ID);
		      
		    }
	}
	
	
//@@Navjot

	@Override
	protected Provider getYouTubePlayerProvider() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
