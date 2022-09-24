import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songs;
    static int num = 1;

    public Album(){}

    public Album(String albumName,String artist){
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
        System.out.println("Playlist::"+num);
        num++;
    }

    public Song findSong(String songTitle){

        for(Song checkedSong : songs){
            if(checkedSong.getTitle().equals(songTitle)){
                return checkedSong;
            }
        }
        return null;
    }

    int count = 1;
    public boolean addSong(String songTitle, double duration){
        if(findSong(songTitle)==null){
            songs.add(new Song(songTitle,duration));
            System.out.println(count+":"+songTitle+" : Successfully added to list");
            count++;
            return true;
        }else{
            System.out.println("Song with name : " + songTitle+ ": already exists in the list");
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        int index = trackNumber-1;
        if(index>0 && index<=this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
        return true;
    }

    public boolean addToPlayList(String songtitle, LinkedList<Song> PlayList){
        for(Song checkedSong : this.songs){
            if (checkedSong.getTitle().equals(songtitle)){
                PlayList.add(checkedSong);
                return true;
            }
        }
        return false;
    }
}
