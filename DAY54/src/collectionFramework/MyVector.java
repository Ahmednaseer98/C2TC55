package collectionFramework;
class MyVector{
public class MyVector{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myvector v1,v2;
		Employee e1=new Employee(1,"Naseer",100);
		Employee e2=new Employee(1,"Ahmed",100);
		v1=new Myvector1();
		v2=v1;
		System.out.println(v1.equals(v2));//
		System.out.println(v1.hashcode(v2));
		System.out.println(v2.hascode());
		
		
		System.out.println(e1.equals(v2));//
		System.out.println(e1.equals(v2));
		System.out.println(e2.equals(v2));
	}
}