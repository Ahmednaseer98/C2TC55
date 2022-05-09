package Stream;
import java.beans.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>a1=new ArrayList<Student>();
		List<Student>a1=new ArrayList<Student>();
		List<Student>la=new ArrayList<Student>();
		List<Student>lv=new Vector<Student>();
		List<Student>al=new LinkedList<Student>();
		Student s1=new Student(1,"Alfiya,"12);
		Student s2=new Student(2,"Abhishek,"13);
		Student s3=new Student(3,"Aniketh,"14);
		Student s4=new Student(4,"chetan,"13);
		Student s5=new Student(5,"Harish,"15);
		Student s6=new Student(6,"jyothi,"18);
		Student s7=new Student(7,"kumendra,"17);
		Student s8=new Student(8,"meraj,"14);
		Student s9=new Student(9,"Naseer,"15);
		Student s10=new Student(10,"mohtashim,"19);
		Student s11=new Student(11,"moin,"15);
		Student s12=new Student(12,"neha",14) {;
		Student s13=new Student(13,"payal,"15);
		Student s14=new Student(14,"Alfiya,"12);
		a1.add(s1);
		a1.add(s14);
		System.out.println(a1.size());;//2
		a1.remove(s14);
		System.out.println(a1.size());//1
		System.out.println(a1.contains(s14));//true
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		System.out.println(a1.size());
		Iterator<Statement>it=a1.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s);
			}
		//stream<Student> SS=A1.stream().mapTODouble(Student::getMarks).average();
		System.out.println(od);
		System.out.println("Min Mark="+a1.stream().min(comparator.comparing(Student::getMarks))).average();
		System.out.println(a1.stream().filter(s))-->s.getmarks()<20).StreamAPIDemo((s))-->s.getmarks()).collections.toset())
		}
	}
}