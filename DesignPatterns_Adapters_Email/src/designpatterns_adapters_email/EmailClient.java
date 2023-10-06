package designpatterns_adapters_email;

public class EmailClient {

    private EmailProvider emailProvider;

    public EmailClient(EmailProvider emailProvider) {
        this.emailProvider = emailProvider;
    }

    public void connectToEmail() {
        emailProvider.connect();
        }

    public void fetchEmails() {
        emailProvider.getClass();
    }
}
