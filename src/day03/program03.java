package day03;

public class program03 {

	public static void main(String[] args) {
	//classname objectname= new classname(); --- syntax for object creation,
		program03 xyz=new program03();
		addmethod(20,30);
		xyz.submethod(10,5);
		xyz.mulmethod(10,10);
		
		addmethod(120,230);
		xyz.mulmethod(110,15);
		xyz.mulmethod(10,6);
	}
	
	public static void addmethod(int a,int b)
	{
     System.out.println(a+b);
}

	public static void submethod(int a,int b)
	{
	System.out.println(a-b);;	
	}
	public void mulmethod(int a,int b)
	{
		System.out.println(a*b);
	}
	
}