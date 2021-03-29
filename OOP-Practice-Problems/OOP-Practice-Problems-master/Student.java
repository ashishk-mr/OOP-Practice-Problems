import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
	
	private String name;
	private double cgpa; // how arraylist prints private data?
	
	public Student(String name, double cgpa) {
		super();
		this.name = name;
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", cgpa=" + cgpa + "]\n";
	}
	
	@Override
	public int compareTo(Student s2) {
		double epsilon = 0.0001;
		double cg1 = this.cgpa;
		double cg2 = s2.cgpa;
		
		double diff = cg1-cg2;
		
		double diff1 = Math.abs(diff);
		
		if(diff1 <= epsilon) {
			return (this.name).compareTo(s2.name);
		}
		else if((this.cgpa > s2.cgpa)) {
			return -1;
		}
		else
			return 1;
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scan = new Scanner(in);
		out.println("Enter student data (y/n):");
		
		char op = scan.next().trim().charAt(0);
		scan.nextLine();
		
		while(op != 'n') {
			String name;
			double cg;
			
			out.println("Enter Student name:");
			name = scan.nextLine();
			out.println("Enter cgpa:");
			cg = Double.parseDouble(scan.nextLine());
			
			list.add(new Student(name,cg));
			
			out.println("Enter more data (y/n):");
			op = scan.next().trim().charAt(0);
			scan.nextLine();
		}
		
		out.println("Before sort:");
		out.println(list);
		
		Collections.sort(list);
		
		out.println("After sort:");
		out.println(list);
		
		scan.close();
	}
}