package designpatterns_adapters_email;

import designpatterns_adapters_email.gmailClient.GmailClient;

public class GmailAdapter implements EmailProvider {
    
    private GmailClient gmailClient;

    public GmailAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void connect() {
        gmailClient.login();
    }

    @Override
    public void getEmails() {
       gmailClient.fetchEmails(); 
    }

    
    @Override
    public void fetchEmails() {
        gmailClient.fetchEmails();
    }
}



