package com.curso.json;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Path;

public class restService {
	  public static  String API_URL = "https://api.github.com";
	public restService() {
		super();
		// TODO Auto-generated constructor stub
		 Retrofit retrofit = new Retrofit.Builder()
	        .baseUrl(API_URL)
	        .addConverterFactory(GsonConverterFactory.create())
	        .build();
		
	}

	
	
}
