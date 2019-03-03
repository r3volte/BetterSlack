package Sandbox.New;


import lombok.Getter;

import java.time.LocalDateTime;

public class Message {

@Getter
    private String content;
    private LocalDateTime timestamp;

    public Message(String content) {
        timestamp = LocalDateTime.now();
        this.content = content;
    }

    public Message(String content, LocalDateTime timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    private Message() {
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}

