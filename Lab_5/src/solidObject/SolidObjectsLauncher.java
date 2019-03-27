package solidObject;

import java.util.ArrayList;

public class SolidObjectsLauncher {
	
   // TODO: define a new static ArrayList of type SolidObject called solidObject.
	static ArrayList<SolidObject<GeometricShape>> solidObjects = new ArrayList<SolidObject<GeometricShape>>();
   public static void main(String[] args){

		/* TODO
		 * Load the ArrayList declared above with the following four solidObject,
		 * which must be instantiated with the values shown below
		 * 
	     *          shape                   depth
	     *  
	     *        Circle(3.0)               5.0
	     *        Rectangle(10.0, 9.0)      2.0
	     *        Rectangle(3.0, 6.0)       10.0
	     *        Square(6.0)    
	     *        
	     * Note that the last SolidObject is a cube constructed using the Square
	     * GeometricShape.  For this, use the one-arg SolidObject constructor.  For 
	     * the other three, use the two-arg constructor.
	    */
	   Circle circle2D = new Circle(3.0);
	   SolidObject<GeometricShape> circle3D = new SolidObject<GeometricShape>(circle2D, 5.0);
	   solidObjects.add(circle3D);
	   Rectangle rect2D = new Rectangle(10.0, 9.0);
	   SolidObject<GeometricShape> rect3D = new SolidObject<GeometricShape>(rect2D, 2.0);
	   solidObjects.add(rect3D);
	   Rectangle rect2D2 = new Rectangle(3.0, 6.0);
	   SolidObject<GeometricShape> rect3D2 = new SolidObject<GeometricShape>(rect2D2, 10.0);
	   solidObjects.add(rect3D2);
	   Square sq2D = new Square(6.0);
	   SolidObject<GeometricShape> sq3D = new SolidObject<GeometricShape>(sq2D);
	   solidObjects.add(sq3D);
 
	   
 
	  displayVolumeComparison(solidObjects);   // method already declared below
      displaySurfaceAreaComparison(solidObjects);  // method already declared below

   }
	
   // TODO: Create a public static method isVolumeEqual() that takes two solidObject as 
   // parameters, and if they have the same volume, returns true, otherwise false.  This
   // method is called by the displayVolumeComparison method, whose code is provided below.

   public static boolean isVolumeEqual(SolidObject<GeometricShape> obj1, SolidObject<GeometricShape> obj2) {
	   if (obj1.getVolume() == obj2.getVolume()) {
		   return true;
	   } else {
		   return false;
	   }
   }
   
   public static boolean isSurfaceAreaEqual(SolidObject<GeometricShape> obj1, SolidObject<GeometricShape> obj2) {
	   if (obj1.getSurfaceArea() == obj2.getSurfaceArea()) {
		   return true;
	   } else {
		   return false;
	   }
   }
   // TODO: Create a public static method isSurfaceAreaEqual() that takes two solidObject 
   // as parameters and if they have the same surface area, returns true, otherwise false.  
   // This method is called by the displayVolumeComparison method, whose code is provided below.

	
   public static void displayVolumeComparison(ArrayList<SolidObject<GeometricShape>> arList){
		
      // Print out column header
      System.out.println("\n\nCompare the two object's volumes.  Are they equal?");
	  System.out.print("\t\t");
      for (SolidObject<GeometricShape> columnHeader: arList)
         System.out.print("\t" + columnHeader);
		
	 // Print out each row,starting with the name of the object
	 for (SolidObject<GeometricShape> solidObjRow: arList){
	    System.out.println();	// Next line
	    System.out.print(solidObjRow);
            for (SolidObject<GeometricShape> solidObjColumn: arList)
               System.out.print("\t\t" + isVolumeEqual(solidObjColumn, solidObjRow));
         }    
      }
	
   public static void displaySurfaceAreaComparison(ArrayList<SolidObject<GeometricShape>> arList){
      
	   System.out.println("\n\nCompare the two object's surface areas.  Are they equal?");  
	   // Print out the header
	   System.out.print("\t\t");
       for (SolidObject<GeometricShape> columnHeader: arList)
         System.out.print("\t" + columnHeader);
		
      // Print out each row,starting with the name of the object
      for (SolidObject<GeometricShape> solidObjRow: arList){
         System.out.println();	// Next line
         System.out.print(solidObjRow);
         for (SolidObject<GeometricShape> solidObjColumn: arList)
            System.out.print("\t\t" + isSurfaceAreaEqual(solidObjColumn, solidObjRow));  
      }
   }
}


