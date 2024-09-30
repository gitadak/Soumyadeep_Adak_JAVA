//Assignment 6 Q1

abstract class TwoDShape
{
	double dim1, dim2;

	abstract double area();
}

class Rectangle extends TwoDShape
{
	Rectangle(double d1, double d2)
	{
		dim1 = d1;
		dim2 = d2;
	}

	double area()
	{
		return dim1*dim2;
	}
}

class TwoDShapeMain
{
	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle(2,3.5);
		System.out.println("Dim1 = "+rectangle1.dim1+" Dim2 = "+rectangle1.dim2);
		System.out.println("Area = "+rectangle1.area());

		Rectangle rectangle2 = new Rectangle(2.5,3.5);
		System.out.println("Dim1 = "+rectangle2.dim1+" Dim2 = "+rectangle2.dim2);
		System.out.println("Area = "+rectangle2.area());
	}
}

/*
Output:
------
Dim1 = 2.0 Dim2 = 3.5
Area = 7.0
Dim1 = 2.5 Dim2 = 3.5
Area = 8.75
*/