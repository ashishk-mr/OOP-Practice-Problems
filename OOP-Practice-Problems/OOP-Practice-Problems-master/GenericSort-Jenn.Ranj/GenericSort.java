import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
import java.util.ArrayList;

public class GenericSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(in);
		int op,size;
		
		out.println("(1)Integer array:\n(2)String array:\n(3)Double array:");
		op = Integer.parseInt(scan.nextLine());
		
		switch(op) {
		case 1:
		{
			out.println("Enter size:");
			size = Integer.parseInt(scan.nextLine());
			Integer[] arr = new Integer[size]; //In generics, parameters can't be of primitive types, hence one has to create array of Integer instead of Integer.
						
			for(int i=0; i<size; i++) {
				out.println("Enter element:");
				arr[i]=Integer.parseInt(scan.nextLine());
			}
			
			
			out.println("Before sort:");
			out.print("[ ");
			for(Integer s:arr) {
				out.println(" "+s+", ");
			}
			out.println("]");
			
			MergeSort<Integer> e = new MergeSort<Integer>();
			ArrayList<Integer> fin= e.convertTo(arr);
			out.println(fin);
			
			e.mergeSort(fin);
			
			out.println("After sort:");
			out.println(fin);
			break;
		}
		
		case 2:{
			out.println("Enter size:");
			size = Integer.parseInt(scan.nextLine());
			String[] arr = new String[size];
			
			for(int i=0; i<size; i++) {
				out.println("Enter element:");
				arr[i]=scan.nextLine();
			}
			
			out.println("Before sort:");
			out.print("[ ");
			for(String s:arr) {
				out.println(" "+s+", ");
			}
			out.println("]");
			
			MergeSort<String> e= new MergeSort<String>();
			ArrayList<String> fin = e.convertTo(arr);
			
			e.mergeSort(fin);
			
			out.println("After sort:");
			out.println(fin);
			break;
		}
		
		case 3:
		{
			out.println("Enter size:");
			size = Integer.parseInt(scan.nextLine());
			Double[] arr = new Double[size]; //In generics, parameters can't be of primitive types, hence one has to create array of Double instead of double.
			
			for(int i=0; i<size; i++) {
				out.println("Enter element:");
				arr[i]=Double.parseDouble(scan.nextLine());
			}
			
			out.println("Before sort:");
			out.print("[ ");
			for(Double s:arr) {
				out.println(" "+s+", ");
			}
			out.println("]");
			
			MergeSort<Double> e = new MergeSort<Double>();
			ArrayList<Double> fin = e.convertTo(arr);
			
			e.mergeSort(fin);
			
			out.println("After sort:");
			out.println(fin);
			break;
		}
		
		default:
		{
			break;
		}
		}
		
		scan.close();
	}
}