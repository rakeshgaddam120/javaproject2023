package day04.test01;

public class program02 extends program01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addmethod(20,20);
		submethod(30,30);
		mulmethod(20,30);
		squarerootmethod(20);
		program01 x= new program01();
		x.addmethodnonstatic(20, 30);
		x.submethodnonstatic(20, 50);
		x.mulmethodnonstatic(48, 30);
		x.squarerootmethodnonstatic(80);
	}

}
