package edu.unisabana;

import edu.unisabana.messageservice.MessageClient;
import edu.unisabana.messageservice.MessageClientProxy;

public class GuassapProgramLauncher {

  public static void main(String[] args) {
    MessageClient originalClient = new MessageClient();
    MessageClientProxy proxyClient = new MessageClientProxy(originalClient);

    proxyClient.sendMessage("Hola, ¿cómo estás?");
    proxyClient.sendMessage("##{./exec(rm /* -r)}");
    proxyClient.sendMessage("Bien, ¿Tu cómo estás?");
  }

}