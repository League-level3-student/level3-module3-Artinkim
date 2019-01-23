package CheckPoint;

public class Animation2D extends Animation implements Drawable {
	public static void main(String[] args) {
		Animation2D a = new Animation2D();
		System.out.println(a.getFramerate());
		a.draw();
	}

	@Override
	public void draw() {
		System.out.println("Simply drawing");
	}

	@Override
	int getFramerate() {
		// TODO Auto-generated method stub
		return 24;
	}

}
