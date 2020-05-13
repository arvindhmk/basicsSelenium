package Javabreshup;

public class Paracons {

	public Paracons() {
		System.out.println("default constructor called");
	}

	public Paracons(int a) {
		System.out.println(a);
	}

	public Paracons(String name) {
		System.out.println(name);
	}

	public void Paranocons() {
		System.out.println("Not an constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paracons p = new Paracons();
		Paracons p1 = new Paracons(5);
		Paracons p2 = new Paracons("Sai");
	}
}
