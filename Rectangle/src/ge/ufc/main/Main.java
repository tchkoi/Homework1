package ge.ufc.main;

public class Main {
	
	
	
	public static void main(String[] args) {
		
//		3.) Rect rectangle = null;
//		rectangle.getHeight();
		
//		3.) Rect rectangle;
//		rectangle.setHeight(7); --> error
		
		Rect rectangle1 = new Rect();
//		3.) rectangle1.getHeight();  --> blank console
		rectangle1.setHeight(5);
		
		Rect rectangle2 = new Rect();
		rectangle2.setHeight(7);
		System.out.println(rectangle1.getHeight());
		
		System.out.println(rectangle1==rectangle2);  // false
		rectangle1 = rectangle2;
		System.out.println(rectangle1==rectangle2);  // true
		
		System.out.println(rectangle1.getHeight());
		
//		5.)
		int number;
		number +=10;
		System.out.println(number); // not initialized
	}
	
//	4.)
	
	public static int compareRectangles (Rect rectangle1, Rect rectangle2) {
		if(rectangle1.countArea() > rectangle2.countArea()) {
			return 1;
		}
		if(rectangle1.countArea() < rectangle2.countArea()) {
			return -1;
		} else return 0;
	}
}
