package tree;

import java.util.ArrayList;

class Graph {
	private int vCount;
	private int eCount;

	private ArrayList[] adjacents;

	public Graph(int vCount) {
		this.vCount = vCount;
		this.eCount = 0;
		adjacents = new ArrayList[vCount];

		for (int i = 0; i < vCount; i++) {
			adjacents[i] = new ArrayList();
		}
	}

	public int getVertexCount() {
		return vCount;
	}

	public int getEdgeCount() {
		return eCount;
	}

	public void addEdge(int src, int dest) {
		adjacents[src].add(dest);
		eCount++;
	}

	public Object[] adj(int src) {
		return adjacents[src].toArray();
	}

}

public class DemoGraph {

	public static void main(String[] args) {
		Graph myGraph = new Graph(5);

		myGraph.addEdge(0, 1);
		myGraph.addEdge(0, 2);
		myGraph.addEdge(0, 3);

		myGraph.addEdge(1, 2);
		myGraph.addEdge(1, 4);

		myGraph.addEdge(2, 3);
		
		myGraph.addEdge(3, 1);
		myGraph.addEdge(4, 0);
		myGraph.addEdge(4, 3);

		Object[] values = myGraph.adj(1);
		for (Object val : values) {
			System.out.println(val);
		}

	}
}
