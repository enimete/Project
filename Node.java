public class Node 
{
	private int data;
	private int weight;
	private Node next;

	public Node (int d, int w) 
	{
	     data = d;
	     weight = w;
	}
	/*public Node (int d, int w, Node n) 
	{
	     data = d;
	     weight = w;
	     next = n;   
	}*/

	public void setData (int newData) 
	{
		data = newData;   
	}

	public void setNext (Node newNext) 
	{
		next = newNext;   
	}

	public int getData () 
	{
		return data;   
	}

	public Node getNext () 
	{
		return next;   
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public void displayNode () 
	{
		System.out.print (data);   
	}
}
