package ph.cary;

public class EmailService implements Services {
    @Override
    public void sendEmail(Video video) {
        System.out.println("Sending email to '" + video.getUser() + "'");
        System.out.println("Email sent..");
    }
}
