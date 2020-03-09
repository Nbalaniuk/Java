package tutorials2;



public class ONode <T extends Comparable<T>> 
{
	
	private ONode<T> obNext;
	private T obElem;
	
	public ONode(T obElem)
	{
		this.obElem = obElem;
		this.obNext=null;
	}
	
	
	public T getElem()
	{
		return this.obElem;
	}
	
	public ONode<T> getNext()
	{
		return this.obNext;
	}
	public void setNext(ONode<T> obNext )
	{
		this.obNext= obNext;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
