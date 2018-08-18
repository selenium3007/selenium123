package pack2;

import pack1.Calculations;

public class DriverClass2 {

	public static void main(String[] args) throws Exception {
		Calculations c=new Calculations(10, 20);
		int x=c.addition(10, 20);
		System.out.println(x);
		
		int y=c.subtraction();
		System.out.println(y);

	}

}
