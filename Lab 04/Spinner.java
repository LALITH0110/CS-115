
public class Spinner {
	private int arrow, size;
	private static final int DEFAULT_SIZE = 10, DEFAULT_ARROW = 0;
	
	public Spinner () {
		setSize(DEFAULT_SIZE);
		setArrow(DEFAULT_ARROW);
	}
	
	public Spinner(int newSize) {
		setSize(newSize);
		setArrow(DEFAULT_ARROW);		
	}
	
	public int getArrow() {
		return arrow;
	}
	
	public int getSize() {
		return size;
	}
	
	
	public void setArrow(int newArrow) {
		arrow = newArrow;
	}
	
	public void setSize(int newSize) {
		size = newSize;
	}
	
	public void spin() {
		arrow = (int)(Math.random()*size);
	}
	
	public String toString() {
		return "Size=" + size + " Arrow=" + arrow;
	}

}
