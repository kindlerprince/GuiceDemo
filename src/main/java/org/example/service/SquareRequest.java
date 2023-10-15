package org.example.service;

import org.example.draw.DrawShape;

/**
 * @SquareRequest is dependent and @DrawShape is dependency
 */
public class SquareRequest {
  private DrawShape drawShape;

  // Initializing the dependency DrawShape
  public SquareRequest(DrawShape drawShape) {
    this.drawShape = drawShape;
  }

  public void makeRequest() {
    drawShape.draw();
  }
}
