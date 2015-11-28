package com.curso.json;
import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
public interface SoundCloud {

	@GET("/tracks/{id}/?client_id=/{client_id}")
    Call<Track> getTrack(
            @Path("id") String id,
            @Path("client_id") String client_id);
}
