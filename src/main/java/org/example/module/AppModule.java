package org.example.module;

import com.google.inject.AbstractModule;
import org.example.draw.DrawShape;
import org.example.draw.DrawSquareShape;

public class AppModule extends AbstractModule {
    @Override
    public void configure(){
        bind(DrawShape.class).to(DrawSquareShape.class);
    }

}
