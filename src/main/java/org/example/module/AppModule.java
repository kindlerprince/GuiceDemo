package org.example.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.example.annotation.ColorValue;
import org.example.annotation.EdgeValue;
import org.example.draw.DrawShape;
import org.example.draw.DrawSquareShape;
import org.example.service.SquareRequest;

public class AppModule extends AbstractModule {
  @Override
  public void configure() {
    // DrawShape is an interface, so when the object is needed we must specify which subtype does it
    // refer to
    bind(DrawShape.class).to(DrawSquareShape.class).in(Singleton.class);
    // Injecting constant dependencies
    bind(String.class).annotatedWith(ColorValue.class).toInstance("Blue");
    bind(int.class).annotatedWith(EdgeValue.class).toInstance(40);

    // whenever the SquareRequest is instantiated it will use the same object
    bind(SquareRequest.class).in(Singleton.class);
  }
}
