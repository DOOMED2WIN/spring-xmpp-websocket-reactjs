package com.sergiomartinrubio.springxmppwebsocketsecurity.websocket.utils;

import com.sergiomartinrubio.springxmppwebsocketsecurity.model.TextMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.EncodeException;
import javax.websocket.Session;
import java.io.IOException;

@Slf4j
@Component
public class WebSocketTextMessageTransmitter {

    public void send(Session session, TextMessage textMessage) {
        try {
            session.getBasicRemote().sendObject(textMessage);
        } catch (IOException | EncodeException e) {
            log.error("WebSocket error, message {} was not sent.", textMessage.toString(), e);
        }
    }
}
