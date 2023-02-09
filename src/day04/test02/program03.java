package day04.test02;

import day04.test01.program01;

public class program03 extends program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addmethod(20,20);
		submethod(20,20);
		mulmethod(40,30);
		squarerootmethod(22);
		
		program03 x= new program03();
		x.addmethodnonstatic(20, 30);
		x.submethodnonstatic(20, 40);
		x.mulmethodnonstatic(30,40);
		x.squarerootmethodnonstatic(44);

	}

}
