import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album> albumList = new ArrayList<Album>();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Song> playlist = new LinkedList<Song>();
		Album demonDays = new Album("Demon Days","Gorillaz");
		Album rtj4 = new Album("RTJ4", "Run the Jewels");
		demonDays.addSong("Feel Good Inc", 4.00);
		demonDays.addSong("Dance", 2.55);
		demonDays.addSong("DirtyHarry", 3.40);
		rtj4.addSong("Oh La La", 3.12);
		rtj4.addSong("yankee and the brave",2.27);
		rtj4.addSong("out of sight", 3.21);
		albumList.add(demonDays);
		albumList.add(rtj4);
		albumList.get(0).addToPlaylist("Feel Good Inc",playlist);
		albumList.get(0).addToPlaylist("Dance",playlist);
		albumList.get(0).addToPlaylist("DirtyHarry",playlist);
		albumList.get(1).addToPlaylist("Oh La La",playlist);
		albumList.get(1).addToPlaylist("yankee and the brave",playlist);
		albumList.get(1).addToPlaylist("out of sight",playlist);
		play(playlist);
	}
	public static void printInstructions() {
		
		System.out.println("Please choose one of the below options \n"+
		"0-quit \n"+
		"1-skip to next song \n"+
		"2-Go back to previous song \n"+
		"3-Replay Current song \n"+
		"4-List songs in the playlist \n"+
		"5-Remove current song from playlist \n"+
		"6- Print choices");
	}
	private static void play(LinkedList<Song> playlist) {
	ListIterator<Song> listIterator = playlist.listIterator();
	boolean forward = true;
	if(playlist.isEmpty()) {
		System.out.println("No songs in the playlist");
		return;
	}
	else {
		System.out.println("Now playing: "+listIterator.next().toString());
	boolean quit = false;
	
	while(!quit) {
	printInstructions();
	int choice = scanner.nextInt();
	switch(choice) {
	case 0:
		System.out.println("Playlist Complete");
		quit = true;
		break;
	case 1:
		System.out.println("value of forward: "+forward);
		forward = skipCurrentSong(listIterator, playlist, forward);
		break;
	case 2:
		forward = goBackToPreviousSong(listIterator, playlist,forward);
		break;
	case 3:
		forward = replayCurrentSong(listIterator, playlist,forward);
		System.out.println("value of forward: "+forward);
		break;
	case 4:
		 listSongsInPlaylist(playlist);
		break;
	case 5:
		forward = removeCurrentSong(listIterator, playlist,forward);
		break;
	case 6:
		printInstructions();
		break;
	}
	}
	}
	
	}
	private static boolean skipCurrentSong(ListIterator<Song> listIterator,LinkedList<Song> playlist, boolean forward) {
		if(!forward) {
			System.out.println("The double skip was hit");
			if(listIterator.hasNext()) {
				listIterator.next();
			}
			forward = true;
			}
			if(listIterator.hasNext()) {
				System.out.println("Now Playing: "+listIterator.next().toString());
			}
			else {
				System.out.println("End of Playlist");
				forward = false;
			}
			return forward;
		}
	
	private static boolean goBackToPreviousSong(ListIterator<Song> listIterator,LinkedList<Song> playlist, boolean forward) {
		if(forward) {
			if(listIterator.hasPrevious()) {
				listIterator.previous();
			}
			forward = false;
		}
		if(listIterator.hasPrevious()) {
			System.out.println("Now playing: "+listIterator.previous().toString());
		}
		else {
			System.out.println("Reached the beginning of the playlist");
		}
		return forward;
	}
	private static boolean replayCurrentSong(ListIterator<Song> listIterator,LinkedList<Song> playlist, boolean forward) {
		if(!forward) {
			if(listIterator.hasNext()){
			System.out.println("Now Playing: "+listIterator.next().toString());
			forward =  true;
			}
			else {
				System.out.println("Reached the end of the playlist");
			}
		}
		else if(forward) {
			if(listIterator.hasPrevious()) {
				System.out.println("Now playing: "+listIterator.previous().toString());
				forward = false;
				System.out.println("Forward set to "+forward);
			}
			else {
				System.out.println("Reached the beginning of the playlist");
			}
		}
		return forward;
	}
	private static void listSongsInPlaylist(LinkedList<Song> playlist) {
		ListIterator<Song> listIterator = playlist.listIterator();
		for(int i = 0; i<playlist.size(); i++)
		if(listIterator.hasNext()){
			System.out.println(listIterator.next().toString());
	}
		else {
			System.out.println("End of the playlist has been reached");
		}
	}
	private static boolean removeCurrentSong(ListIterator<Song> listIterator,LinkedList<Song> playlist, boolean forward) {
		if (playlist.size()>0) {
			listIterator.remove();
			if(listIterator.hasNext()) {
				System.out.println("Now Playing "+listIterator.next());
				forward = true;
			}
			else if(listIterator.hasPrevious()) {
				System.out.println("Now Playing"+ listIterator.previous());
				forward = false;
			}
		}
		else {
			System.out.println("Playlist is empty");
		}
		return forward;
	}
}

