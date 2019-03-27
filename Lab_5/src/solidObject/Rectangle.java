package solidObject;

public class Rectangle extends GeometricShape {
	private double length;

	public Rectangle(){
		this(1.0, 1.0);
	}   // default constructor
	public Rectangle(double width, double length){
		setWidth(width);
		setLength(length);
	}   // base constructor
	public Rectangle(Rectangle rect){
		this(rect.getWidth(), rect.getLength()); 
	}  //copy constructor

	@Override
	public String toString(){
		return ("Square Overrides " + super.toString());}

	@Override
	public boolean equals(Object obj){
		return ((obj instanceof Rectangle) && ((Rectangle)obj).getWidth() == this.getWidth() && ((Rectangle)obj).getLength() == this.getLength());
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	//Perimeter of a square is 4*width
	@Override 
	public double getPerimeter() {
		double perimeter = this.getWidth() + this.getLength();
		return perimeter;
		}
	//Area of a square width*width
	@Override
	public double getArea() {
		double area = this.getWidth() * this.getLength();
		return area;
	}
}
