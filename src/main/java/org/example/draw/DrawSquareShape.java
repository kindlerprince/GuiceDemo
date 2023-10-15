package org.example.draw;

import jakarta.inject.Inject;
import org.example.annotation.ColorValue;
import org.example.annotation.EdgeValue;

public class DrawSquareShape implements DrawShape {

  private String color;
  private int edge;

  @Inject
  public DrawSquareShape(@ColorValue String color, @EdgeValue int edge) {
    this.color = color;
    this.edge = edge;
  }

  @Override
  public void draw() {
    System.out.println("Drawing Square of color : " + color + " and edge : " + edge);
  }
}
