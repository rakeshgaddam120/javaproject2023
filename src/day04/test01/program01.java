package day04.test01;

public class program01 
{
	
public static void addmethod(int a, int b)
{
	System.out.println(a+b);
}

public static void submethod(int a, int b)
{
	System.out.println(a-b);
}
	
public static void mulmethod(int a, int b)

{
	System.out.println(a*b);
}

public static void squarerootmethod(int a)
{
	System.out.println(a*a);

}
public void addmethodnonstatic(int a, int b)
{
	System.out.println(a+b);
	
}
	
public void submethodnonstatic(int a, int b) {
	System.out.println(a-b);
}

public void mulmethodnonstatic(int a, int b)
{
	System.out.println(a*b);
}

public void squarerootmethodnonstatic(int a)
{
	System.out.println(a*a);
}
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		addmethod(10,20);
		mulmethod(20,20);
		submethod(40,30);
		squarerootmethod(200);
		program01 x= new program01();
		x.addmethodnonstatic(10,20);
		x.submethodnonstatic(20,40);
		x.mulmethodnonstatic(90, 30);
		x.squarerootmethodnonstatic(40);
		
	}

}
