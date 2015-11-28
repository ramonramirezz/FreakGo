package com.curso.freakgo;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import com.curso.json.SoundCloud;
import com.curso.json.Track;

import java.io.IOException;
import java.util.List;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Path;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NavDrawer extends Activity {
	EditText txtSearch;
    TextView request;
	public  String API_URL = "https://soundcloud.com";

    
	
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.nav_drawer);
			//ActionBar actionBar = getActionBar();
			//actionBar.hide();
			//hola
			request = (TextView) findViewById(R.id.textView1);
			
		    Retrofit retrofit = new Retrofit.Builder()
	        .baseUrl(API_URL)
	        .addConverterFactory(GsonConverterFactory.create())
	        .build();
	        
		    
		    SoundCloud sound = retrofit.create(SoundCloud.class);

		    // Create a call instance for looking up Retrofit contributors.
		    Call<Track> call = sound.getTrack("211588619", "7e2cdc554af905789da2068bca36a1");

		    // Fetch and print a list of the contributors to the library.
		    Track song = null;
			try {
				song = call.execute().body();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				request.setText(song.title);

	

		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
}
