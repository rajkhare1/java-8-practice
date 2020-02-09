package com.raj.sorting;

import java.util.ArrayList;
import java.util.Collections;

import com.raj.sorting.api.Song;
import com.raj.sorting.myutility.MyUtils;

public class MP4  {

	public static void main(String[] args) {
		
		Song song1 = new Song("take me to your heart","Michel Learns to Rock",2014);
		Song song2 = new Song("see you again","Wiz Khalifa",2015);
		Song song3 = new Song("love me like you do","Ellie Goulding",2013);
		Song song4 = new Song("just a dream","Nelly",2010);
		Song song5 = new Song("as long as you love me","Backstreet Boys",2008);
		
		ArrayList<Song> musicList = new ArrayList<>();
		musicList.add(song1);
		musicList.add(song2);
		musicList.add(song3);
		musicList.add(song4);
		musicList.add(song5);
		
		MyUtils.iterateList(musicList);
		Collections.sort(musicList);
		System.out.println("after sort----------------");
		MyUtils.iterateList(musicList);
	}
}
