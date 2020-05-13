package Abstracte;

	public class User extends Mobile {
	    public User() {
	    }

	    public void User(String userName) {
	        System.out.println(userName);
	    }

	    public static void main(String[] args) {
	        Mobile n = new User();
	        n.Mobile("Nokia9", "6GB", 25000, "01/01/2019");
	        ((User)n).User("MK");
	        n.Print();
	    }
	}

