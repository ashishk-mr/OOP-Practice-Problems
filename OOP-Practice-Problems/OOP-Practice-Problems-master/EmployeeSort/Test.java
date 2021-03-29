import java.util.LinkedList;
import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator; // Comparator needs to be imported as a package

public class Test implements Comparator<Salary>{ //Comparator can be implemented by any Class overriding compare() method.

	public static void main(String[] args) {
		LinkedList<Salary> list = new LinkedList<Salary>();
		Scanner scan = new Scanner(in);
		char ch;
		String name;
		int num;
		double sal;
		
		do {
			out.println("Enter employee name, number and salary:");
			name = scan.nextLine();
			num = Integer.parseInt(scan.nextLine());
			sal = Double.parseDouble(scan.nextLine());
			
			list.add(new Salary(sal, name, num));
			
			out.println("Enter more employee record:");
			ch = scan.next().trim().charAt(0);
			scan.nextLine(); // To take string input one needs to add this.
		}while(ch != 'n');
		
		Comparator<Salary> com = new Test();
		/*
		 * {
		 * 
		 * @Override 
		 * public int compare(Salary s1, Salary s2) 
		 * { 
		 * 		if(s1.getSalary() <	s2.getSalary()) 
		 * 		{ 
		 * 			return 1; 
		 * 		} 
		 * 		else if(s1.getSalary() == s2.getSalary())
		 * 			return 0; 
		 * 		else 
		 * 			return -1; 
		 * } 
		 * }
		 *///;
		
		out.println("Before sort:");
		out.println(list);
		Collections.sort(list,com);
		out.println("After sort:");
		out.println(list);
		
		scan.close();
	}
	
	@Override
	public int compare(Salary s1, Salary s2) {
		if(s1.getSalary() < s2.getSalary()) {
			return 1;
		}
		else if(s1.getSalary() == s2.getSalary())
			return 0;
		else
			return -1;
	}

}
