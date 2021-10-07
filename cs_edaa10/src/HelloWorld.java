import java.util.Random;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }
}
public class Die{
	private int dots;
	private Random rand;
	public void die() {
		rand = new Random();
		dots = 1;
	}
	public void roll() {
		dots = rand.nextInt(6) + 1;
	}
}

public class frog{
	private int x,y;
	public frog(){
		x = 0;
		y = 0;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	private void jumpNorth() {
		y = y + 1;
	}
	private void jumpEast() {
		x = x + 1;
	}
	private void jumpSouth() {
		y = y - 1;
	}
	private void jumpWest() {
		x = x - 1;
	}
}
