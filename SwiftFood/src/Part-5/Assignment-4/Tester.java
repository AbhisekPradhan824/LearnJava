import java.util.Scanner;
class Rectangle {
    //Implement your code here
    public float length;
    public float width;

    public double calculateArea() {
        double area = (double) length * width;
        // Rounding off to two decimal digits
        return Math.round(area * 100.0) / 100.0;
    }

    public double calculatePerimeter() {
        double perimeter = 2.0 * (length + width);
        // Rounding off to two decimal digits
        return Math.round(perimeter * 100.0) / 100.0;
    }
}

class Tester {

	public static void main(String args[]) {
	    Scanner scn =new Scanner(System.in);
		
		Rectangle rectangle=new Rectangle();
		//Assign values to the member variables of Rectangle class
		System.out.println("Enter Length ");
		rectangle.length =scn.nextFloat();
		System.out.println("Enter Width ");
		rectangle.width =scn.nextFloat();

		//Invoke the methods of the Rectangle class to calculate the area and perimeter
		double area = Math.round(rectangle.calculateArea());
        double perimeter = Math.round(rectangle.calculatePerimeter);
		
		//Display the area and perimeter using the lines given below
		System.out.println("Area of the rectangle is "+ area);
		System.out.println("Perimeter of the rectangle is "+perimeter);
	}

}
