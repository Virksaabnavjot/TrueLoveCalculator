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
import android.widget.Toast;

public class V9 extends YouTubeFailureRecoveryActivity implements
YouTubePlayer.OnInitializedListener{
	
	public static final String API_KEY = "AIzaSyCe6tORd9Ch4lx-9Ku5SQ476uS9OtZYsWA";
	
	public static final String VIDEO_ID = "YvR8LGOUpNA";
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_v9);
		
		//@@Navjot 
		 YouTubePlayerView youTubePlayerView = (YouTubePlayerView)findViewById(R.id.v9);
	        youTubePlayerView.initialize(API_KEY, this);
	        
	     
	}

	
	public void v8(View view) {
		Intent intent1 = new Intent(this, V8.class);
		
		startActivity(intent1);
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
