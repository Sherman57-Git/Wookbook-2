package TextMessageApp;

import java.time.LocalDate;

// creating class & fields
public class TextMessage {
    private String senderNumber;
    private String receiverNumber;
    private String body;
    private LocalDate sentOn;
    public void display() {

    }
    //No-args constructor.
    public TextMessage() {
        this.senderNumber = senderNumber;
        this.receiverNumber = receiverNumber;
        this.body = body;
        this.sentOn = sentOn;

    }
    // All-args constructor
    public TextMessage(String senderNumber, String receiverNumber, String body, LocalDate sentOn) {
        this.senderNumber = senderNumber;
        this.receiverNumber = receiverNumber;
        this.body = body;
        this.sentOn = sentOn;
    }
    // Getter & Setters

    public String getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    public String getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getSentOn() {
        return sentOn;
    }

    public void setSentOn(LocalDate sentOn) {
        this.sentOn = sentOn;
    }
}

