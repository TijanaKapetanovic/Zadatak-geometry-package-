package geometry;
import java.awt.Point;
public class Rectangle {

	Point upperLeftPoint;
	int width;
	int height;
	boolean selected;
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public Rectangle()
	{ 
		
	}
	
	public Rectangle(Point upperLeftPoint,int width,int height)
	{  this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
		this.selected = false;
	}
	

	public int area()
	{
		return height * width;
		
	}
	
	public int circumference()
	{
		
		return 2* height + 2 * width;
		
	}

	

}
