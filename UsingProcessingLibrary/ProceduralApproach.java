package UsingProcessingLibrary;

public class ProceduralApproach {

    void setup() {
        size(800, 600); // Set canvas size
      }
      
      float[] ballX = {0, 0, 0, 0}; // X-coordinates of the balls
      float[] speeds = {1, 2, 3, 4}; // Speeds of the balls
      float[] heights; // Heights of the balls
      
      void draw() {
        background(0); // Clear the background
      
        // Set heights relative to the screen
        heights = new float[]{
          height / 5.0,  // 1/5 of the canvas height
          height * 2 / 5.0,
          height * 3 / 5.0,
          height * 4 / 5.0
        };
      
        // Draw and move each ball
        for (int i = 0; i < ballX.length; i++) {
          fill(255); // Set ball color
          ellipse(ballX[i], heights[i], 30, 30); // Draw the ball
          ballX[i] += speeds[i]; // Update the position
      
          // Reset the ball's position when it goes off the screen
          if (ballX[i] > width) {
            ballX[i] = 0;
          }
        }
      }
      
    
}
