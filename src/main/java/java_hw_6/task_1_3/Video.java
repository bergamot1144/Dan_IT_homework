package java_hw_6.task_1_3;

public class Video extends Media{
    String resolution;
    public Video(String title, int duration, String resolution){
        this.title=title;
        this.duration=duration;
        this.resolution=resolution;
    }
    @Override
    public void play() {
        System.out.printf("The video [%s] is displayed in a separate edition [%s]%n",title,resolution);
    }
}
