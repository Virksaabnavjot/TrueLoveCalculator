package my.android.truelovecalculator;




import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity {
MediaPlayer mySplashPlayer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		getActionBar().hide();
		//@@Navjot this code is to check the screen size and set orientation accordingly
		switch (getResources().getDisplayMetrics().densityDpi) {
        case DisplayMetrics.DENSITY_LOW:
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            break;
        case DisplayMetrics.DENSITY_MEDIUM:
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            break;
        case DisplayMetrics.DENSITY_HIGH:
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            break;
        case DisplayMetrics.DENSITY_XHIGH:
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            break;
        }
		
		//@Navjot mediaplayer
	    mySplashPlayer = MediaPlayer.create(this, R.raw.proposal);
		mySplashPlayer.start();
		
		
//ImageView img = (ImageView) findViewById(R.id.imageView1);
		TextView txt = (TextView)findViewById(R.id.textView1);
		
		//@@Navjot this code is to fade in things like imageview or textview
		Animation anim = AnimationUtils.loadAnimation(this, R.anim.fadein);
		//img.startAnimation(anim);
		txt.startAnimation(anim);
		/*
		Handler handler = new Handler();
		 handler.postDelayed(new Runnable() {
             @Override
             public void run() {
            	     
            	 Intent intentEnd = new Intent(SplashActivity.this, MainActivity.class);
                     intentEnd.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                     
                     startActivity(intentEnd);
                     
                    
     					
     					
     				
                     
             }
             
         }, 5000);
		
		*/
		
		//@@Navjot code for splash activity 
		Thread logoTimer = new Thread(){
		public void run(){
			try{
				int logoTimer = 0;
				while(logoTimer < 6000){
					sleep(100);
					logoTimer = logoTimer + 100;
				}
				
			startActivity(new Intent(SplashActivity.this, MainActivity.class));	
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			finally{
				finish();
			}
		}
		
		};
		logoTimer.start();
		
		
		
		
	}
//@@Navjot to kill the sound as soon as the splash activity ends
	protected void onDestroy(){
		super.onDestroy();
		mySplashPlayer.release();
	}
	
	protected void onPause(){
		super.onPause();
		mySplashPlayer.pause();
	}
	
	protected void onResume(){
		super.onResume();
		mySplashPlayer.start();
	}

	protected void onStart(){
		super.onStart();
		mySplashPlayer.start();
	}
	
	protected void onStop(){
		super.onStop();
		mySplashPlayer.stop();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
		
	}

	
	
	/*
	
	@Override
	public void onRestart() {
		super.onRestart();
		Handler handler = new Handler();
		 handler.postDelayed(new Runnable() {
            
			 
			 
			 
			 @Override
            public void run() {
                    Intent intentEnd = new Intent(SplashActivity.this, MainActivity.class);
                    intentEnd.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intentEnd);
                    
            }
        }, 2000);
        
        
        
	}
	
	*/
	
	
	//This Bablu(code) is to close the application if back button is pressed
	  @Override
	  public boolean onKeyDown(int keyCode, KeyEvent event) {
	      if (keyCode == KeyEvent.KEYCODE_BACK ) {
	    	  Intent intent= new Intent(Intent.ACTION_MAIN);
		      intent.addCategory(Intent.CATEGORY_HOME);
		      //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		      intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		        intent.putExtra("EXIT", true);
		      startActivity(intent);
		      
		        
	      
	      
	      }
	      return super.onKeyDown(keyCode, event);
	  }
	
	
	
}
