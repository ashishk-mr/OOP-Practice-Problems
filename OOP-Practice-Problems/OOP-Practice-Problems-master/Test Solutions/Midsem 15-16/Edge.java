//import static java.lang.System.out;

public class Edge {
	private String start;
	private String end;
	private int cost;
	
	Edge(String s, String e, int c){
		start=s;
		end = e;
		cost = c;
	}
	
	@Override
	public String toString() {
		return "{ Start="+this.start+", Destination="+this.end+", Cost="+this.cost+"} ";
	}
}