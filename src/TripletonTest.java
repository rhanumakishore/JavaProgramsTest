
public class TripletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();
		Singleton singleton4 = Singleton.getInstance();
		Singleton singleton5 = Singleton.getInstance();
		Singleton singleton6 = Singleton.getInstance();
		Singleton singleton7 = Singleton.getInstance();
		Singleton singleton8 = Singleton.getInstance();
		Singleton singleton9 = Singleton.getInstance();
		
		System.out.println(singleton1.toString() + "-------------" + singleton2.toString()+"---------------------"+singleton3.toString());
		System.out.println(singleton4.toString() + "-------------" + singleton5.toString()+"---------------------"+singleton6.toString());
		System.out.println(singleton7.toString() + "-------------" + singleton8.toString()+"---------------------"+singleton9.toString());

	}

}
