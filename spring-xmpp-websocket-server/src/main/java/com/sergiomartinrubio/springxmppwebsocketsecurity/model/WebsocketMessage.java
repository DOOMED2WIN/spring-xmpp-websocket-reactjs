package com.sergiomartinrubio.springxmppwebsocketsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WebsocketMessage {
    String from;
    String to;
    String content;
    MessageType messageType;
}
