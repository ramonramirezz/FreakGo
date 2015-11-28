package com.curso.json;

public class Track {

	public String genre;
	public String id;
	public String title;
	public String stream_url;
	
	public Track(String genre, String id, String title, String stream_url) {
		super();
		this.genre = genre;
		this.id = id;
		this.title = title;
		this.stream_url = stream_url;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStream_url() {
		return stream_url;
	}

	public void setStream_url(String stream_url) {
		this.stream_url = stream_url;
	}	
		
}
