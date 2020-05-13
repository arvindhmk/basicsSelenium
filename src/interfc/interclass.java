package interfc;

public class interclass implements inter2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		interclass ic = new interclass();
		ic.CSE();
		ic.ECE();
		ic.EEE();
		ic.IT();
		System.out.println(a);//accessed in static way
		System.out.println(b);//accessed in static way
	}

	@Override
	public void ECE() {
		// TODO Auto-generated method stub
		System.out.println("Implemented ECE department");
	}

	@Override
	public void CSE() {
		// TODO Auto-generated method stub
		System.out.println("Implemented CSE department");
	}

	@Override
	public void EEE() {
		// TODO Auto-generated method stub
		System.out.println("Implemented EEE department");
	}

	@Override
	public void IT() {
		// TODO Auto-generated method stub
		System.out.println("Implemented IT department");
	}

}
