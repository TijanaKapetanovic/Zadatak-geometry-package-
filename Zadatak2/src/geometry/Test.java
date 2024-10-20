package geometry;

import java.awt.Point;

public class Test {

	public static void main(String[] args) {
			
			Point startPoint = new Point(1, 2);
			
	        Point endPoint = new Point(4, 6);
	        
			Line line = new Line( startPoint , endPoint );
			
			System.out.println("the length of the line is "  + line.length());
					
				System.out.println(line.isSelected());
		
		
				Point upperLeftPoint = new Point(5,1); 
				 Rectangle rectangle = new Rectangle(upperLeftPoint,5,6);
				 
				 System.out.println( rectangle.area());
			     System.out.println( rectangle.circumference());
			     System.out.println( rectangle.isSelected());

	}

}
