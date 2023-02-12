package day05;

public class program03 extends program02 {

	public static void main(String[] args) {
		program03 x= new program03();
		x.add(10, 20);

	}
	
	@Override
	public  void add (int a,int b)
	{
		System.out.println((a*a)+(b*b));
	}

}