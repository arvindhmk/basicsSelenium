package collections;

import java.util.HashMap;
import java.util.Map;

public class Animal {
	private static Map<String,Animal> friends = new HashMap<>();

    public void addFriend(String name, Animal animal){
        friends.put(name,animal);
    }

    public Animal callFriend(String name){
        return friends.get(name);
    }
    
   public static void main(String[] args)
   {
	   Animal ani = new Animal();
	   //ani.addFriend("hello", hi);
	   ani.callFriend("txt");
	   System.out.println(friends);
   }
}
