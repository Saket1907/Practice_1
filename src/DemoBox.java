class Box {
	double width;
	double length;
	double depth;

	double volume() {
		return width * length * depth;
	}

	void setDim(double w, double l, double d) {
		width = w;
		length = l;
		depth = d;
	}
}

public class DemoBox {

	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

		mybox1.setDim(12, 6, 1);
		mybox2.setDim(45, 2, 3);

		vol = mybox1.volume();
		System.out.println("Volume is : " + vol);

		vol = mybox2.volume();
		System.out.println("Volume is : " + vol);

	}

}
