package howard.edu.lsp.finals.problem;
import java.util.*;
import java.util.Map.Entry;

public class SongsDatabase {
	/* Key is the genre, HashSet contains associated songs */ 
	private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>(); 

/* Add a song title to a genre */ 
		public void addSong(String genre, String songTitle) { 

			if(map.containsKey(genre)){
				map.get(genre).add(songTitle);}
			else {
				HashSet<String> newSet = new HashSet<String>();
				newSet.add(songTitle);
				map.put(genre, newSet);
			}
				//Code it!! 
		}		 

	/* Return the Set that contains all songs for a genre */ 

	public Set<String> getSongs(String genre) { 

			return map.get(genre);// Code it!! 

	} 

	/* Return genre, i.e., jazz, given a song title */ 

	public String getGenreOfSong(String songTitle) { 

			for (Entry<String, HashSet<String>> entry : map.entrySet()) {// Code it!! 
				if(entry.getValue().contains(songTitle)){
					return entry.getKey();
				}
	
			}
			return "Empty";
	}
	public static void main(String args[]) {
		SongsDatabase db = new SongsDatabase(); 

		db.addSong("Rap","Yacht Club"); 

		db.addSong("Rap", "Diamonds"); 

		db.addSong("RnB", "Obsessed"); 

		Set<String> songs = db.getSongs("Rap"); 

		System.out.println( db.getGenreOfSong("Yacht Club") );// prints “Rap” 
		Set<String> songs1 = db.getSongs("RnB"); 
		
		System.out.println( db.getGenreOfSong("Obsessed") );// prints  

		}

	private Set<String> getSongs() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addSong() {
		// TODO Auto-generated method stub
		
	}
}

