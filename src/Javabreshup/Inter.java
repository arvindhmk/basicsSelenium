package Javabreshup;

interface I1 {
	default int sum(int a, int b) {
		int c = a + b;
		System.out.println(c +" I1");
		return c;
	}
}

interface I2 extends I1 {
	public void sub(int x, int y);
}

interface I3 extends I2 {
	default public int sum(int a, int b) {
		int c = a + b;
		System.out.println(c + "I2");
		return c;
	}
}

abstract class interf implements I1, I2, I3 {
	public int sum(int a, int b) {
		int c = a + b;
		System.out.println(c + "Class");
		return c;
	}

	public void sub(int x, int y) {
		int z = x - y;
		System.out.println(z);
	}
}

public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interf obj = new interf() {
			@Override
			public int sum(int a, int b) {
				return super.sum(a, b);
			}
		};
		obj.sum(3, 5);
		obj.sub(9, 4);

	}

}