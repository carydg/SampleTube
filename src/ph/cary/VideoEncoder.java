package ph.cary;

public class VideoEncoder implements Encoder {
    public void encode(Video video) {
        System.out.println("Encoding '" + video.getFilename() + "'...");
        System.out.println("Done..\n");
    }
}
