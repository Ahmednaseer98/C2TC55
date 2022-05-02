package collectionFramework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		Vector v2=new Vector();
		String s1= new String("Naseer");
		String s2= new String("Naseer");
		Employee E1=new Employee(1,"Naseer",10000);
		Employee E2=new Employee(1,"Naseer",10000);
		v1.add(s1);
		v2.add(E1);
		System.out.println(v1.contains(s2));//
		System.out.println(v2.contains(E2));//
	}
}