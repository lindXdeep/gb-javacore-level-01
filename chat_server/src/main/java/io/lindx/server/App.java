package io.lindx.server;

public class App {

  private final static int PORT = 8181;
  public static void main(String[] args) {
    
    new Server(PORT).start();
  }
}