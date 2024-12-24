package UsingProcessingLibrary;

class OopsApproach{
  float x;        // X-coordinate
  float y;        // Y-coordinate
  float speed;    // Speed of the ball

  // Constructor to initialize a ball
  OopsApproach(float y, float speed) {
    this.x = 0;
    this.y = y;
    this.speed = speed;
  }

  // Method to draw the ball
  void drawBall() {
    fill(255);
    ellipse(x, y, 30, 30);
  }

  // Method to update the ball's position
  void updatePosition() {
    x += speed;
    if (x > width) { // Reset when it goes off the screen
      x = 0;
    }
  }
}

// Array to store ball objects
OopsApproach[] balls = new OopsApproach[4];

void setup() {
  size(800, 600); // Set canvas size

  // Create ball objects with varying heights and speeds
  balls[0] = new OopsApproach(height / 5.0, 1);
  balls[1] = new OopsApproach(height * 2 / 5.0, 2);
  balls[2] = new OopsApproach(height * 3 / 5.0, 3);
  balls[3] = new OopsApproach(height * 4 / 5.0, 4);
}

void draw() {
  background(0); // Clear the background

  // Draw and update all balls
  for (int i = 0; i < balls.length; i++) {
    balls[i].drawBall();
    balls[i].updatePosition();
  }
}
