package project1;

import java.util.ArrayList;
import java.util.Iterator;

public class Playlist {
	private String title;
	private ArrayList<Song> list;
	private int size;
	public Playlist(String title) {
		list = new ArrayList<Song>();
	}
	
	public void addSong(Song song){
		list.add(song);
	}
	//Playlist implements Iterable
	public Iterator<Song> iterator(){
	return list.iterator();
	
	}		public String getTitle(){
		return title;
	}
	
	public int getSize(){
		size = list.size();
	return size;
	}
	
	public boolean contains(Song obj){
		
		if(list.contains(obj)){
		return true;
		}
		else{
			return false;
		}
		
	}

	
	public String toString() {
		String toReturn = "";
		for (int k = 0; k < list.size(); k++) {
			toReturn += "Title: " + list.get(k).getTitle() + ", Artist: "
					+ list.get(k).getArtist() + ", Album: "
					+ list.get(k).getAlbum() + ", Time: "
					+ list.get(k).getTime() + "\n";
		}
		return toReturn;
		
		
	
	}
}
