package ph.cary;

public class VideoDatabase {
    public void store(Video video) {
        System.out.println("Adding '" + video.getTitle() + "' to the database...");
        System.out.println("Done..\n");
    }
}
