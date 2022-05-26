package ge.ufc.main;

public class Rect {
	private int height;
	private int width;
	

	public void setHeight(int height) {
		this.height = height;
	} 
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int countPerimeter() {
		return 2*(height + width);
	}
	
	public int countArea() {
		return width*height;
	}
}


