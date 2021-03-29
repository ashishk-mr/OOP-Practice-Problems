import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.out;

public class MergeSort<T extends Comparable<T>> { // T extends comparable to make compareTo method work.
	public void mergeSort(ArrayList<T> arr) { // AL objects are mutable, Hence any changes in the arr abject results in changes in the original AL. Therefore void return type works.
		if(arr.size() <= 1){
			return;
		}
		
		else {
			int mid = arr.size()/2;
			ArrayList<T> left = new ArrayList<T>(mid); //Arrays have not been used because they can't be declared by a parametrized type without any indication of type of object to be stored in the array.
			ArrayList<T> right = new ArrayList<T>(arr.size() - mid);
			
			for(int i=0; i<mid; i++) {
				left.add(arr.get(i));
			}
			out.println(left);
			
			for(int i=mid; i<arr.size(); i++) {
				right.add(arr.get(i));
			}
			
			out.println(right);
			mergeSort(left);
			mergeSort(right);
			merge(left,right,arr);
			
		}
	
	}
	
	public ArrayList<T> convertTo(T[] arr) { //this method can't be declared static as it is handling a non-static reference variable arr.
		return new ArrayList<T>(Arrays.asList(arr));
	}
	
	public void merge(ArrayList<T> left, ArrayList<T> right, ArrayList<T> tar) {
		int nl = left.size();
		int rl = right.size();
		
		int i=0, j=0, k=0;
		
		while(j<nl && k<rl) {
			if((left.get(j)).compareTo(right.get(k)) < 0) { //compareTo works only with objects that implement Comaparable interface.
				tar.set(i,left.get(j));
				j++;
			}
			
			else {
				tar.set(i, right.get(k));
				k++;
			}
			
			i++;
		}
		
		while(j<nl) {
			tar.set(i,left.get(j));
			i++;
			j++;
		}
		
		while(k<rl) {
			tar.set(i, right.get(k));
			i++;
			k++;
		}
	}
}