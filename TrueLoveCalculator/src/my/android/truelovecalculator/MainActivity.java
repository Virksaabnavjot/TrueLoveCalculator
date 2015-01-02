package my.android.truelovecalculator;

import java.util.Locale;
import android.support.v4.app.FragmentActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

	

	/*public EditText loverName =(EditText) findViewById(R.id.editText2);
	public EditText yourName =(EditText) findViewById(R.id.editText1);
	public EditText loverBirth =(EditText) findViewById(R.id.EditText01);
	public EditText yourBirth =(EditText) findViewById(R.id.EditText02);*/

	MediaPlayer myPlayer;
	
		
	
	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a
	 * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
	 * will keep every loaded fragment in memory. If this becomes too memory
	 * intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getActionBar().hide();
		
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
		
	    myPlayer = MediaPlayer.create(this, R.raw.glad);
		myPlayer.start();
		myPlayer.setLooping(false);
		// Create the adapter that will return a fragment for each of the three
		// primary sections of the app.
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		mViewPager.setPageTransformer(true, new DepthPageTransformer());
	}

	protected void onDestroy(){
		super.onDestroy();
		myPlayer.release();
	}
	
	protected void onPause(){
		super.onPause();
		myPlayer.pause();
	}
	
	protected void onResume(){
		super.onResume();
		myPlayer.start();
	}

	protected void onStart(){
		super.onStart();
		myPlayer.start();
	}
	
	protected void onStop(){
		super.onStop();
		myPlayer.stop();
	}
	
	
	
	
	

		
	 @Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
				
			
			
		}
	
	
	
	

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		
		//@@Navjot add this code to add pages
		
		@Override
		public Fragment getItem(int i) {
			
			Fragment fragment = null;
			//for(int i = 0; i <= 2; i++){
			if(i == 0){
				fragment = new Home();
			}
			
			else if(i == 1){
				fragment = new Page1();
			}
			else if(i == 2){
				fragment = new Page2();
			}
			else if(i == 3){
				fragment = new Page4();
			}
			else if(i == 4){
				fragment = new Page5();
			}
			else if(i == 5){
				fragment = new Page6();
			}
	 //}
			return fragment;
			
			
			
			
			
			
			
			
			// getItem is called to instantiate the fragment for the given page.
			// Return a DummySectionFragment (defined as a static inner class
			// below) with the page number as its lone argument.
			/*Fragment fragment = new DummySectionFragment();
			Bundle args = new Bundle();
			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
			fragment.setArguments(args);
			return fragment;*/
			
			
			
		}

		
		
		
		
		@Override
		public int getCount() {
			// Show 3 total pages.
			return 6;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return getString(R.string.title_section1).toUpperCase(l);
			case 1:
				return getString(R.string.title_section2).toUpperCase(l);
			case 2:
				return getString(R.string.title_section3).toUpperCase(l);
			case 3:
				return getString(R.string.title_section4).toUpperCase(l);
			case 4:
				return getString(R.string.title_section5).toUpperCase(l);
			case 5:
				return getString(R.string.title_section6).toUpperCase(l);
			}
			return null;
		}
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main_dummy,
					container, false);
			TextView dummyTextView = (TextView) rootView
					.findViewById(R.id.section_label);
			dummyTextView.setText(Integer.toString(getArguments().getInt(
					ARG_SECTION_NUMBER)));
			return rootView;
		}
	}

	
	
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







