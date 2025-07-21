package methods;

public class Class
{
 //public protected private default
	public static void Add()
	{
	int x = 10;
	int y = 30;
	int c =x+y;
	System.out.println(c);
	
	}
	public void mul()
	{
		int x = 50;
		int y = 60;
		int z =x*y;
		System.out.println(z);
	}
	
	public static void main(String[] args)
	{
		Add();
		Class obj = new Class();
		obj.mul();
		

	}

}
