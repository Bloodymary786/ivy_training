package graph;
import java.util.*;
class Graph{
	int vCount, eCount;
	ArrayList[] adj;
	
	Graph(int vCount){
		this.vCount=vCount;
		this.eCount=0;
		adj=new ArrayList[vCount];
		
		for(int i=0;i<vCount; i++) {
			adj[i]=new ArrayList();
		}
	}
	void addEdges(int src, int dest) {
		adj[src].add(dest);
		eCount++;
	}
	Object[] adj(int src) {
		return adj[src].toArray();// covert AL to object array
	}
}
public class DemoGraph {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		System.out.println(arrList.size());
		
		System.out.println("--------------");
		Graph graph=new Graph(5);
		graph.addEdges(0, 1);
		graph.addEdges(0, 2);
		graph.addEdges(0, 3);
		
		graph.addEdges(1, 4);
		graph.addEdges(1, 2);
		
		graph.addEdges(2, 3);
		
		graph.addEdges(3, 1);
		
		graph.addEdges(4, 0);
		graph.addEdges(4, 3);
		
		Object[] obs=graph.adj(0);
		
		for(Object object: obs) {
			System.out.println(object);
		}
	}
}





