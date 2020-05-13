package Javaprograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistpractice 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(30);
		ll.add(25);
		ll.add(20);
		ll.addFirst(15);
		ll.addLast(35);
		System.out.println(ll);
		ll.remove(0);//accepts index value
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll);
		System.out.println(ll.remove(3));
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);	
		System.out.println(ll.indexOf(20));
		ll.add(100);
		ll.add(100);
		ll.add(100);
		ll.add(100);
		ll.add(101);
		ll.add(102);
		ll.add(103);
		System.out.println(ll);
		ll.poll();//to remove first element
		System.out.println(ll);
		ll.pollFirst();//also removes first value
		ll.pollLast();//removes last value
		System.out.println(ll);
		ll.removeFirstOccurrence(100);
		System.out.println(ll);
		ll.removeLastOccurrence(100);
		System.out.println(ll);
		int[] a=  new int[10];
		
		
		for(Integer values: ll)
		{
			System.out.println(values);
			
		}
		System.out.println("-------------------------------");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
			
		}
		System.out.println("-------------------------------");
		
		Iterator<Integer> val = ll.iterator();
		
		while(val.hasNext())
		{
			System.out.println(val.next());
		}
		System.out.println("-------------------------------");
	}

}
