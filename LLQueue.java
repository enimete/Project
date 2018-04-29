public interface LLQueue 
{
	public void enqueue (LLQueueADT item);
	public String dequeue();
	public int size();
	public boolean empty();
	public String front();
	public String toString();

}
