package ph.cary;

public class Video {
    private String filename;
    private String title;
    private User user;

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFilename() {
        return filename;
    }

    public String getTitle() {
        return title;
    }

    public String getUser() {
        return user.getEmail();
    }
}
