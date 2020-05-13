package Abstracte;

public class Abstractexample2 
{

	public static void main(String[] args) 
	{
// TODO Auto-generated method stub

	Huawei h = new Huawei();
	Mi m = new Mi();
	show(m);
	
	}
		public static void show(phone e) 		
		{
			e.showconfig();
		}
	}

abstract class phone
{
	public abstract void showconfig();
}

class Huawei extends phone
{
	public void showconfig()
	{
		System.out.println("6GB 12GB Kirin processor");
	}
}
class Mi extends phone
{
	public void showconfig()
	{
		System.out.println("6GB 12GB Snapdragon processor");
	}
}