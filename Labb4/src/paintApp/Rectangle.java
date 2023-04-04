package paintApp;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shapes{
	
    private double width, height;

    public Rectangle(double x, double y, double width, double height, Color color) {
    	super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
	public void draw(GraphicsContext gc) {
        gc.setFill(getColor());
        gc.fillRect(getX(), getY(), width, height);
    }
}