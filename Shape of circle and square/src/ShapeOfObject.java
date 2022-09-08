
// this code is for printing the shape of square and circle and area of them
public class ShapeOfObject {

	public static void main(String[] args) {
		abstract class Shape
		{
			abstract Number calculateArea();
			
		}
		class Circle   extends Shape
		{
			private final double base;
			private final double height;
			Circle(double base, double height) 
			{
				this.base= base;
				this.height=height;
			}
			Double calculateArea() {  //we use override method
				return(base/2)*height;
			}
			void display()
			{
				System.out.println("Area of circle:"+calculateArea());
			}
		}
		class Square  extends Shape
		{
			private final double side;
			Square(double side){
				this.side=side;
			}
				Double calculateArea() {    //we use override method
					return side*side;
				}
				void display()
				{
					System.out.println("Area of circle:"+calculateArea());
				}
			
		}
		public class Shape{

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		   Circle C= new Circle(5,6);
		   C.calculateArea();
		   Square S= new Square(4);
		   S.calculateArea();
			}

		}
	}
}