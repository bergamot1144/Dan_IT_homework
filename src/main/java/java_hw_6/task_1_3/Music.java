package java_hw_6.task_1_3;

public class Music extends Media {
    String artist;

    public Music(String title, int duration, String artist) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.printf("Music is being created [%s]:[%s]%n", artist, title);
    }
}
