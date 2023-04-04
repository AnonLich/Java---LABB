package paintApp;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Model {
	
	private Shapes currentShape = new Circle(25, 25, 25, Color.BLACK);
	private Color color;
	
	public void drawShapes(GraphicsContext gc, double mouseX, double mouseY) {	
		currentShape.setX(mouseX);
		currentShape.setY(mouseY);
		currentShape.setColor(color);
		currentShape.draw(gc);
		}
	
	public void setColor(Color newColor) {
		this.color = newColor;
	}
	
	public void setShape(Shapes newShape) {
		this.currentShape = newShape;
	}
	
	public Shapes getShape() {
		return currentShape;
	}
	
	public Model getModel() {
		return this;
	}
}