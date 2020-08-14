package ph.cary;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFilename("guitar.mp4");
        video.setTitle("Kurt's Guitar Collections");
        video.setUser(new User("kurt@icloud.com"));

        var processor = new VideoProcessor();
        processor.process(video);
    }
}
