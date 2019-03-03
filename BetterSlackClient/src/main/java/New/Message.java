package New;


import java.time.LocalDateTime;

public class Message {

    private final String content;
    private LocalDateTime timestamp;

    public Message(String content) {
        timestamp = LocalDateTime.now();
        this.content = content;
    }

    public Message(String content, LocalDateTime timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }
}

