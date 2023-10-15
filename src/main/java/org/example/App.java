package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.module.AppModule;
import org.example.service.SquareRequest;

/** Dependency Injection! */
public class App {
  private static final String SQUARE_REQ = "Square Request";

  private static void sendRequest(String req) {
    if (req.equals(SQUARE_REQ)) {
      Injector injector = Guice.createInjector(new AppModule());
      SquareRequest squareRequest = injector.getInstance(SquareRequest.class);
      squareRequest.makeRequest();
      SquareRequest squareRequest2 = injector.getInstance(SquareRequest.class);
      squareRequest2.makeRequest();
    }
  }

  public static void main(String[] args) {
    System.out.println("Learning Dependency Injection without Google Guice");
    sendRequest(SQUARE_REQ);
  }
}
