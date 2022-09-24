public class Song {
    String songTitle;
    double duration;

    public Song(){} // default constructor

    public Song(String songTitle,double duration){ //constructor
        this.songTitle = songTitle;
        this.duration = duration;
    }

    public String getTitle(){
        return songTitle;
    }
    public double getduration(){
        return duration;
    }
    
    @Override
    public String toString(){
        return "Song{" + "title='" + songTitle +'\'' + ", duration=" +duration + "}";
    }
}
