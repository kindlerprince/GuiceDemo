package org.example;

import org.example.draw.DrawShape;
import org.example.draw.DrawSquareShape;
import org.example.service.SquareRequest;

/** Dependency Injection! */
public class App {
  private static String SQUARE_REQ = "Square Request";

  private static void sendRequest(String req) {
    if (req.equals(SQUARE_REQ)) {
      DrawShape drawShape = new DrawSquareShape();
      SquareRequest squareRequest = new SquareRequest(drawShape);
      squareRequest.makeRequest();
    }
  }

  public static void main(String[] args) {
    System.out.println("Learning Dependency Injection without Google Guice");
    sendRequest(SQUARE_REQ);
  }
}
