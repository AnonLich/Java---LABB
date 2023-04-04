package paintApp;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shapes {
	private double x, y;
	private Color color;
	
	public Shapes(double x, double y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void draw(GraphicsContext gc) {
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}