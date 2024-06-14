package edu.unisabana.messageservice;

public class MessageClient implements MessageSender{
  public void sendMessage(String message) {
    System.out.println("Sending message: " + message);
  }
}
