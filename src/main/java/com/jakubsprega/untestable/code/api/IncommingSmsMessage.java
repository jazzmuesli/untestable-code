package com.jakubsprega.untestable.code.api;

/**
 *
 * @author U519060
 */
public class IncommingSmsMessage implements IncommingMessage {

    String content;
    String sender;

    public IncommingSmsMessage(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getSender() {
        return sender;
    }
}