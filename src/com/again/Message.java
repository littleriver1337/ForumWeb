package com.again;

/**
 * Created by MattBrown on 10/28/15.
 */
public class Message {
    int id;
    int replyId;
    String username;
    String text;

    public Message(String text, int id, int replyId, String username) {
        this.id = id;
        this.replyId = replyId;
        this.username = username;
        this.text = text;
    }
}
