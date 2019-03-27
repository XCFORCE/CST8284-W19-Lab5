package solidObject;

public class SolidObject <T extends GeometricShape> {

	// TODO: Use the UML diagram to create the members required
	private T shape;
	private double depth;

	protected SolidObject(T shape, double depth) {
		this.setDepth(depth);
		this.setGeometricShape(shape);
	}

	protected SolidObject(T shape) {
		this.setGeometricShape(shape);
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public T getGeometricShape() {
		return shape;
	}

	public void setGeometricShape(T shape) {
		this.shape = shape;
	}

	public double getVolume() {
		double volume; // area * depth
		volume = (this.shape.getArea() * this.getDepth());
		return volume;
	}

	public double getSurfaceArea() {
		double surfaceArea; //2 *((l+) + (l + w))
		surfaceArea =(this.getGeometricShape().getPerimeter() * this.getDepth()
				+ (2 * this.getGeometricShape().getArea()));
		return surfaceArea;
	}

	public String toString(){
		String solidTypeEquivalent = "unknown   ";
		String className = getGeometricShape().getClass().toString();
		className = className.substring(className.lastIndexOf('.')+1);
		switch (className) {
		case "Circle": solidTypeEquivalent = "cylinder "; break;
		case "Square": solidTypeEquivalent = "cube     "; break;
		case "Rectangle": solidTypeEquivalent = "block    "; break;
		case "Triangle": solidTypeEquivalent = "prism    "; break;
		}	
		return solidTypeEquivalent;
	}

}
