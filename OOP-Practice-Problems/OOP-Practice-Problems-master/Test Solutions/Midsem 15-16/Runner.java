import static java.lang.System.out;
import static java.lang.System.in;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Runner {
	public static void main(String[] args) throws IOException {
		int op;
		ArrayList<Edge> graph = new ArrayList<Edge>();
		String start=null,end=null;
		int cost = 0;
		int op1=1;
		
		out.println("Enter edge (yes-1/no-0):");
		BufferedReader br = new BufferedReader(new InputStreamReader(in)); // Scanner throws InputMismatchException.
		op = Integer.parseInt(br.readLine());
		
		do {
			
			out.println("Enter start, destination, cost of edge:");
			start = br.readLine();
			end = br.readLine();
			cost = Integer.parseInt(br.readLine());
			
			Edge ed = new Edge(start, end, cost);
			graph.add(ed);
			
			out.println("Enter more edges (yes-1/no-0):");
			op1 = Integer.parseInt(br.readLine());
		}while(op1 != 0);
		
		Graph g = new Graph(graph);
		
		out.println("Perform operation (yes-1/no-0):");
		op1 = Integer.parseInt(br.readLine());
		
		while(op != 0) {
			out.println("(1)Print edges of graph:");
			out.println("(2)Remove loops:");
			op = Integer.parseInt(br.readLine());
			
			switch(op){
			case 1:
			{
				g.print();
				break;
			}
			case 2:
			{
				g.removeLoop();
				break;
			}				
			default:
			{
				break;
			}
			}
			
			out.println();
			out.println("Perform operation (yes-1/no-0):");
			op = Integer.parseInt(br.readLine());
		}
	}
}