package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		AbstractShape shape = new Circle(Color.WHITE, 3.0);
		AbstractShape shape2 = new Rectangle(Color.BLACK, 2.0, 3.0);
		
		System.out.println("Circle color: " + shape.getColor());
		System.out.println("Circle area: " + String.format("%.3f", shape.area()));
		
		System.out.println("Rectangle color: " + shape2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", shape2.area()));

	}

}
