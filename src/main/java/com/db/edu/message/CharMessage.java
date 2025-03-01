package com.db.edu.message;

import static com.db.edu.message.Prefix.CHAR_PREFIX;

public class CharMessage extends Message {
    private final char message;

    public CharMessage(char message) {
        super(message);
        this.message = message;
    }

    @Override
    public Message accumulate(Message message) {
        return message;
    }

    @Override
    public String decorate() {
        return CHAR_PREFIX.body + message;
    }

    @Override
    public boolean sameTypeOf(Message accumulateMessage) {
        return accumulateMessage instanceof CharMessage;
    }
}
