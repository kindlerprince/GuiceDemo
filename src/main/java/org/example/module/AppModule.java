package org.example.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scope;
import com.google.inject.Singleton;
import org.example.draw.DrawShape;
import org.example.draw.DrawSquareShape;
import org.example.service.SquareRequest;

public class AppModule extends AbstractModule {
    @Override
    public void configure(){
        bind(DrawShape.class).to(DrawSquareShape.class).in(Singleton.class);

        // whenever the SquareRequest is instantiated it will use the same object
        bind(SquareRequest.class).in(Singleton.class);
    }

}
