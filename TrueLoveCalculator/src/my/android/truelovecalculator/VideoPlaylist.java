package my.android.truelovecalculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class VideoPlaylist extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_playlist);
		
		
		
	}
	
	//@@@Navjot intent for playlist
	public void videoLibrary(View view) {
		Intent intent = new Intent(this, VideoLibrary.class);
		
		startActivity(intent);
	}
	
	public void v1(View view) {
		Intent intent = new Intent(this, V1.class);
		
		startActivity(intent);
	}
	
	public void v2(View view) {
		Intent intent = new Intent(this, V2.class);
		
		startActivity(intent);
	}
	
	public void v3(View view) {
		Intent intent = new Intent(this, V3.class);
		
		startActivity(intent);
	}
	
	public void v4(View view) {
		Intent intent = new Intent(this, V4.class);
		
		startActivity(intent);
	}
	
	public void v5(View view) {
		Intent intent = new Intent(this, V5.class);
		
		startActivity(intent);
	}
	
	public void v6(View view) {
		Intent intent = new Intent(this, V6.class);
		
		startActivity(intent);
	}

	
	public void v7(View view) {
		Intent intent = new Intent(this, V7.class);
		
		startActivity(intent);
	}
	
	
	public void v8(View view) {
		Intent intent = new Intent(this, V8.class);
		
		startActivity(intent);
	}
	
	public void v9(View view) {
		Intent intent = new Intent(this, V9.class);
		
		startActivity(intent);
	}
	
	
	public void main(View view) {
		Intent intent = new Intent(this, MainActivity.class);
		
		startActivity(intent);
	}
	
	//@@@@the end
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.video_playlist, menu);
		return true;
	}

}
