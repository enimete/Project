public class LLQueueADT 
{
	private int size;
	private Node front;
	private Node rear;

	public LLQueueADT () 
	{
		size = 0;
		front = null;
		rear = null;
	}

	public boolean empty () 
	{
		return (size == 0);
	}

	public int size () 
	{
		return size;
	}	
	
	public void enqueue (int item, int weight) 
	{
		Node newNode = new Node(item, weight);
		newNode.setNext(null);
		if (this.empty()) 
			front = newNode;
		else
			rear.setNext(newNode);
		rear = newNode;
		size++;
	}

	public int dequeue () 
	{
		int i;
		i = front.getData();
		front = front.getNext();
		size--;
		if (this.empty())
			rear = null;
		return i;
	}

	public Node front () 
	{
		return front;
	}
	public String toString()
	{
		String result = "";
		Node current = front;
		while(current != null)
		{
			result = result + current.getData() + ", ";
			current = current.getNext();
		}
		
		return result;
		}

	}

