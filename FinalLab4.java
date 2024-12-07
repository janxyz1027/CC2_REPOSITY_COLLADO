//COLLADO JOHN FRANK
//CITCS 1N A
package com.mycompany.finallab4;
class Song {
    String title;
    Song next;
    Song prev;

    public Song(String title) {
        this.title = title;
        this.next = null;
        this.prev = null;
    }
}

public class FinalLab4 {
    private Song current;

    // Add a new song to the playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (current == null) {
            current = newSong;
            current.next = current;
            current.prev = current;
        } else {
            Song last = current.prev;
            last.next = newSong;
            newSong.prev = last;
            newSong.next = current;
            current.prev = newSong;
        }
        System.out.println("Added song: " + title);
    }

    //removes the current song from the playlist
    public void removeCurrentSong() {
        if (current == null) {
            System.out.println("No songs in the playlist to remove.");
            return;
        }

        System.out.println("Removing song: " + current.title);

        if (current.next == current) {
            current = null; //only one song in the playlist
        } else {
            Song prevSong = current.prev;
            Song nextSong = current.next;
            prevSong.next = nextSong;
            nextSong.prev = prevSong;
            current = nextSong; //moves to the next song
        }
    }

    //moves to the next song
    public void nextSong() {
        if (current == null) {
            System.out.println("The playlist is empty.");
            return;
        }
        current = current.next;
        System.out.println("Now playing: " + current.title);
    }

    //moves to the previous song
    public void previousSong() {
        if (current == null) {
            System.out.println("The playlist is empty.");
            return;
        }
        current = current.prev;
        System.out.println("Now playing: " + current.title);
    }

    //displays the current song
    public void displayCurrentSong() {
        if (current == null) {
            System.out.println("The playlist is empty.");
            return;
        }
        System.out.println("Currently playing: " + current.title);
    }

    //displays all songs in the playlist
    public void displayPlaylist() {
        if (current == null) {
            System.out.println("The playlist is empty.");
            return;
        }

        System.out.println("Playlist:");
        Song temp = current;
        do {
            System.out.println("- " + temp.title);
            temp = temp.next;
        } while (temp != current);
    }

    public static void main(String[] args) {
        FinalLab4 playlist = new FinalLab4();

        //add songs to the playlist
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");
        playlist.addSong("Song 4");

        //displays the playlist
        playlist.displayPlaylist();

        //plays the current song
        playlist.displayCurrentSong();

        //moves to the next song
        playlist.nextSong();
        playlist.nextSong();

        //moves to the previous song
        playlist.previousSong();

        //removes the current song
        playlist.removeCurrentSong();

        //displays the updated playlist
        playlist.displayPlaylist();
    }
}

