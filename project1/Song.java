package project1;

public class Song implements Comparable {
	// A Song in Lab 1 has a name, artist,
	// album and time.
	private String title, artist, album, time;

	// Song constructor
	public Song(String title, String time, String artist, String album) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public String getTime() {
		return time;
	}

	public boolean equals(Object obj) {
		obj = (Song) obj;
		return this.compareTo(obj) == 0;
	}

	public int compareTo(Object obj) {
		Song otherObj = (Song)obj;
		if (this.getTitle().compareTo(otherObj.getTitle())== 0 && this.getArtist().compareTo(otherObj.getArtist()) == 0){
			return 0;
		}else{
		return this.getTitle().compareTo(otherObj.getTitle()); 
	
		}
	}

	public String toString() {
		return "Title: " + title + ", Artist: " + artist + ", Album: " + album
				+ ", Length: " + time ;
	}

	


}
