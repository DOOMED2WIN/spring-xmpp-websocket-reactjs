import React, { useEffect } from "react";
import { useSelector } from "react-redux";
import { selectCurrent } from "../../features/current/currentSlice";
import { selectMessages } from "../../features/messages/messagesSlice";
import Message from "../message/Message";

const ChatBox = () => {
  const currentContact = useSelector(selectCurrent);
  const messages = useSelector(selectMessages);

  const ref = React.useRef();
  useEffect(() => {
    if (ref.current) {
      ref.current.scrollIntoView({ behavior: "smooth", block: "end" });
    }
  }, [messages]);

  return (
    <div className="msg-history">
      {currentContact != null ? currentContact : ""}
      <div className="type-msg" />
      <ul>
        {messages.map((message) => (
          <div ref={ref} key={message.id}>
            <Message {...message} />
          </div>
        ))}
      </ul>
    </div>
  );
};

export default ChatBox;
