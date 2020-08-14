package ph.cary;

public class VideoProcessor {
    public void process(Video video) {
        var encoder = new VideoEncoder();
        encoder.encode(video);

        var database = new VideoDatabase();
        database.store(video);

        var email = new EmailService();
        email.sendEmail(video);
    }
}
