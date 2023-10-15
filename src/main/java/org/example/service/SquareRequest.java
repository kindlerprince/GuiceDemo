package org.example.service;

import jakarta.inject.Inject;
import org.example.draw.DrawShape;

/**
 * @SquareRequest is dependent and @DrawShape is dependency
 */
public class SquareRequest {
  private DrawShape drawShape;

  // Initializing the dependency DrawShape
  @Inject
  public SquareRequest(DrawShape drawShape) {
    this.drawShape = drawShape;
  }

  public void makeRequest() {
    drawShape.draw();
  }
}
