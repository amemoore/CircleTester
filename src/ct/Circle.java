package ct;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
	
	private double radius;
	private double circumference;
	private double area;
	private static int i;
	
	public Circle(double radiusIn){
		radius = radiusIn;
	}
	
	public double getCircumference(){
		circumference = 2 * Math.PI * radius;
		return circumference;
	}
	
	public double getRoundedCircumference(double circumference){
		BigDecimal bdCircumference = new BigDecimal(circumference);
		bdCircumference = bdCircumference.setScale(2, RoundingMode.HALF_UP);
		return bdCircumference.doubleValue();
	}
	
	public double getArea(){
		area = Math.PI * Math.sqrt(radius);
		return area;
	}
	
	public double getRoundedArea(double area){
		BigDecimal bdArea = new BigDecimal(area);
		bdArea = bdArea.setScale(2, RoundingMode.HALF_UP);
		return bdArea.doubleValue();
	}
	
	public int getObjectCount(){
		i++;
		return i;
	}
}
