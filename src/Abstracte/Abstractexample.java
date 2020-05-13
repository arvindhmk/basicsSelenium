package Abstracte;

public class Abstractexample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Features3 feat = new Features3();
feat.Calling();
feat.Camera();
feat.Faceunlock();
feat.Fingerprintsensor();
feat.Camea();
	}

}

abstract class Features
{

	public void Calling()
	{
		System.out.println("Calling feature added");
	}
	
	protected abstract void Faceunlock();
	public abstract void Fingerprintsensor();
	public abstract void Camera();
}
abstract class Features2 extends Features
{
	public void Faceunlock()
	{
		System.out.println("faceunlock feature added");
	}
	public void Fingerprintsensor()
	{
		System.out.println("fingerprint feature added");
	}
}

class Features3 extends Features2
{

	public void Camea() 
	{
		// TODO Auto-generated method stub
	System.out.println("Camera feature not added");	
	}
	
	public void Camera()
	{
		System.out.println("Camera feature added");
	}
}