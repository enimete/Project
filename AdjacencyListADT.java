public class AdjacencyListADT 
{
	private int vertices = 0;
	private static LLQueueADT[] adjList;
	
	public AdjacencyListADT(int v)
	{
		this.vertices = v;
		adjList = new LLQueueADT[v];
		
		for(int i = 0; i < v; i++)
		{
			adjList[i] = new LLQueueADT();
		}
	}
	
	public static void addEdge(AdjacencyListADT list, int v1, int v2, int w)
	{
		list.adjList[v1].enqueue(v2, w);
		list.adjList[v2].enqueue(v1, w);
	}
	
	public static void printGraph(AdjacencyListADT list)
	{
		for(int i=0; i<list.vertices; i++)
		{
			System.out.println("Adjacency list of vertex " + i);
			System.out.println(list.adjList[i].toString());
			System.out.println("\n");
		}
	}
	//still need to figure out how to get into the linked list in array
	public static int edgeWeight(AdjacencyListADT list, int v1, int v2) 
	{
		Node current = list.adjList[v1].front();
		while (current.getData() != v2) {
			current = current.getNext();
		}
		return current.getWeight();
	}
	
	public static void Prims(int start, AdjacencyListADT list)
	{
		boolean[] Reached = new boolean[list.vertices];
		Reached[start] = true;
		
		for(int i = 1; i <= list.vertices; i++)
			Reached[i] = false;
		for(int h = 1; h <= list.vertices-1; h++)
		{

		}
	}
}
