import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.reflect.*;

public class Graph {
	private ArrayList<Edge> graph = new ArrayList<Edge>();
	
	Graph(ArrayList<Edge> n){
		graph = n;
	}
	
	public void print() {
		out.println();
		out.println(graph);
	}
	
	public void removeLoop(){
		try {
			
			/////////////////////////////////
			Edge ed1;			
			/////////////////////////////////
			String str1, str2;
			Iterator<Edge> itr = graph.iterator(); //Iterator is a raw type warning: If not parameterized, itr.next() will return Object type
			while(itr.hasNext()) {
				ed1 = itr.next(); // Here we need not typecast to (Edge) object from (Object) because due to the parameterization of Iterator<Edge> it returns an Edge type object 
				
				/////////////////////////////////
				
				 Class<?> cls = ed1.getClass(); // Class is a raw type warning: Class<Edge> produces error.
				 Field f1 = cls.getDeclaredField("start"); 
				 Field f2 = cls.getDeclaredField("end");
				 f1.setAccessible(true); 
				 f2.setAccessible(true);
				 
				//////////////////////////////////
				
				str1 = (String)f1.get(ed1);
				str2 = (String)f2.get(ed1); // f2.get() return value of Object type
				out.println(str1+" "+str2);
				
				if(str1.equalsIgnoreCase(str2)) {
					itr.remove();
					out.println("Removed edge from "+str1+" to "+str2);
				}
			}
		}
		
		catch(NoSuchFieldException e) {
			out.println("Enter correct field name in setAccessible()");
		}
		
		catch(IllegalAccessException i) {
			out.println("Set accessible permision to true for the fields");
		}
		
		finally {
		}
	}
	
}