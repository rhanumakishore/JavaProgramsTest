
public class Singleton {
	private static Singleton singletonInstance1 = new Singleton();
	private static Singleton singletonInstance2 = new Singleton();
	private static Singleton singletonInstance3 = new Singleton();
	
	private static int count=0;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
			count++;
			
			if(count ==1)
			{
				return singletonInstance1;
			}
			else if(count ==2)
			{
				return singletonInstance2;
			}
			else
			{
				count = 0;
				return singletonInstance3;
			}
		
		
	}

}
