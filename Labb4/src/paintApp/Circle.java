package paintApp;

import javafx.scene.canvas.GraphicsContext;

import javafx.scene.paint.Color;

public class Circle extends Shapes{
	
	private double radius;

	public Circle(double x, double y, double radius, Color color) {
		super(x, y, color);
		this.radius = radius;
	}

	@Override
	public void draw(GraphicsContext gc) {
		gc.setFill(getColor());
		gc.fillOval(getX() - radius, getY() - radius, radius * 2, radius * 2);
	}
}
