package solidObject;

public class Square extends GeometricShape {
	
	   public Square(){this(1.0);}   // default constructor
	   public Square(double width){setWidth(width);}   // base constructor
	   public Square(Square square){square.getWidth();}  //copy constructor
	   
	   @Override
	   public String toString(){return ("Square Overrides " + super.toString());}
	   
	   @Override
	   public boolean equals(Object obj){
		   return ((obj instanceof Square) && ((Square)obj).getWidth() == this.getWidth());
	   }
	   
	   //Perimeter of a square is 4*width
	   @Override 
	   public double getPerimeter() {
		   double perimeter = this.getWidth() * 4;
		   return perimeter;}
	   //Area of a square width*width
	   @Override
	   public double getArea() {
		   double area = this.getWidth() * this.getWidth();
		   return area;
	   }
}
