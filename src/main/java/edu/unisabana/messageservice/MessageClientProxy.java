package edu.unisabana.messageservice;

public class MessageClientProxy implements MessageSender {
  private static final String FORBIDDEN_MESSAGE = "##\\{\\.\\/exec\\(rm\\s+\\/\\*\\s+-r\\)\\}";
  private MessageSender messageSender;

  public MessageClientProxy(MessageSender messageSender) {
    this.messageSender = messageSender;
  }

  @Override
  public void sendMessage(String message) {
    if (isMessageForbidden(message)) {
      System.err.println("Message blocked due forbidden content");
    } else {
      messageSender.sendMessage(message);
    }
  }

  private boolean isMessageForbidden(String message) {
    return message.matches(FORBIDDEN_MESSAGE);
  }
}
