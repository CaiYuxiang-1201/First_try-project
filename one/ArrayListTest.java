package one;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arlist=new ArrayList<Student>();
		Student s1=new Student("001", "Alice");
		Student s2=new Student("002", "柯南");
		Student s3=new Student("003", "小兰");
		Student s4=new Student("004", "007");
		
		arlist.add(s1);
		arlist.add(s2);
		arlist.add(s3);
		arlist.add(s4);
		
		Collections.sort(arlist);
		
		for(int i=0;i<arlist.size();i++) {
			System.out.print(arlist.get(i).getName()+" ");
		}
	}

}
