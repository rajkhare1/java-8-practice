package com.raj.sorting.api;

public class Song implements Comparable<Song> {
	
	private String title;
	private String artist;
	private Integer year;
	
	
	
	public Song(String title, String artist, Integer year) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Song song) {
		// writing my own compareTo logic
//		if(this.getYear() < song.getYear()) {
//			return -1;
//		}
//		if(this.getYear() > song.getYear()) {
//			return 1;
//		}
//		return 0;
		
		//Sort things based on the Title
		
		return -this.getTitle().compareTo(song.getTitle());
	}
	
	
	
	

}
