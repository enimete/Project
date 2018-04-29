public interface AdjacencyList 
{
	public void addEdge(AdjacencyListADT list, int v1, int v2);
	public void printGraph(AdjacencyListADT list);
	public void removeEdge(AdjacencyListADT list, int v1, int v2);
	public int edgeWeight(AdjacencyListADT list, int v1, int v2);
	
}
