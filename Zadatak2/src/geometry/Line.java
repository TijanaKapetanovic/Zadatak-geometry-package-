package geometry;
import java.awt.Point;

public class Line {

	 private Point startPoint;
	 private Point endPoint;
	 private boolean Selected;

	 public Line()
	 {
		 	 
	 }
	 
	 public Line(Point startPoint, Point endPoint)
	 {
		 this.startPoint = startPoint;
		 this.endPoint = endPoint;
		 this.Selected = false;  
	 }
	 		
		public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

		

	public boolean isSelected() {
	    return Selected; 
	}


	public void setSelected(boolean Selected) {
	    this.Selected = Selected; 
	}
		public double length()
		{
			
			return startPoint.distance(endPoint);
			
		}
		

}
