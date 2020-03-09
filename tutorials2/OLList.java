package tutorials2;

import java.util.Comparator;
import java.util.function.BiFunction;

public class OLList<T extends Comparable<T>>
{
	private ONode<T> obHead;
	
	public OLList()
	{
		this.obHead=null;
	}
	
	public void add(T obElem, Comparator<T> func)
	{
		this.obHead = (ONode<T>)add(obHead, obElem,func);
	}
	
	
	public ONode<T> add(ONode<T> obCurrent, T obElem, Comparator<T> func)
	{
		//Base cases
		if(obCurrent == null)
		{
			return new ONode<>(obElem);
		}
		if(func.compare(obElem, obCurrent.getElem())>0)
		{
			ONode<T> obNode = new ONode<T>(obElem);
			obNode.setNext(obCurrent);
			return obNode;
		}
		
		//recursion
		
		obCurrent.setNext(add(obCurrent.getNext(),obElem,func));
		return obCurrent;
		
		
	}
	
	
	
	
	//do an add ussing a biFunction definition
	public void add(T obElem, BiFunction<T, T, Integer> fn)
	{
		
		this.obHead = add(this.obHead, obElem, fn);
		
	}
	
	public ONode<T> add(ONode<T> obCurrent, T obElem, BiFunction<T, T, Integer> fn)
	{
		
		if(obCurrent==null)
		{
			return new ONode<>(obElem);
		}
		//Where the biFunction comes in for sorting
		if(fn.apply(obElem, obCurrent.getElem())<0)
		{
			ONode<T> obNode = new ONode<>(obElem);
			obNode.setNext(obCurrent);
			return obNode;
		}
		
		//Still have to find a place to insert
		obCurrent.setNext(add(obCurrent.getNext(),obElem,fn));
		return obCurrent;
		
	}
	
	
	
	
	
	
	
	
//	public void add(T obElem, Comparator<T> obCom)
//	{
//		this.obHead = add(obElem, this.obHead, obCom);
//		
//	}
	
	/**
	 * this method will do an insertion into the linked list ordered by the comparator object passed in obCom
	 * Identical to the other except it calls obCom.compare, instead of obElem.compareTo, which allows us to order it byu something else
	 * @param obElem
	 * @param obCurrent
	 * @param obCom
	 * @return
	 */
//	public ONode<T> add(T obElem, ONode<T> obCurrent, Comparator<T> obCom )
//	{
//		if(obCurrent ==null)
//		{
//			return new ONode<>(obElem);
//		}
//		
//		if(obCom.compare(obElem,obCurrent.getElem())<0)
//		{
//			ONode<T> obNode = new ONode<>(obElem);
//			obNode.setNext(obCurrent);
//			return obNode;
//		}
//		obCurrent.setNext(add(obElem,obCurrent.getNext(),obCom));
//		
//		return obCurrent;
//		
//	}
	
	/**
	 * This method will attempt to add a new element to our linked list
	 * @param obElem
	 */
	public void add(T obElem)
	{
		
		
		
			this.obHead = add(obHead, obElem); //
		
		
	}
	
	

	
	
	/**
	 * this is a recursive add method, The general algorith is as follows:
	 * BaseCase1: obCurrent is null(We have reached the end of the list)
	 * 			Return: a reference to a new node that contains the element
	 * 
	 * BaseCase2: In this case we have reached the correct insertion point(obElem is greater then the current node)
	 * 			Add the element here
	 * @param obCurrent
	 * @param obElem
	 * @return
	 */
	public ONode<T> add(ONode<T> obCurrent, T obElem)
	{
		//BaseCase1
		if(obCurrent == null)
		{
			return new ONode<>(obElem);
		}
		
		//BaseCase2
		if(obElem.compareTo(obCurrent.getElem()) < 0)// copies current node to next, then places the NEW element into the newly vacated spot
		{
			ONode<T> obNode = new ONode<>(obElem);
			obNode.setNext(obCurrent);
			return obNode;
		}
		
		
		//Recursion Case
		obCurrent.setNext(add(obCurrent.getNext(),obElem)); // adds the next node on the list, and the node passed in(trying to place)
		return obCurrent;
		
		
		
		
		
		
		
		
		
	}
	
	
	/**
	 * this routine will attempt to delete an element from an ordered lists of elements
	 * BaseCase1: The current element is empty
	 * BaseCase2: The current element matches the element we wish to delete
	 * BaseCase3: The current element is greater than the element we wish to delete
	 * 
	 * RecursionCase: Call this routine with the next element in the list and return the current element after resetingthe next reference
	 * 				To be whatever the recursion call returned
	 * @param obElem
	 */
	public void delete(T obElem)
	{
		this.obHead = delete(this.obHead,obElem);
	}
	
	public ONode<T> delete(ONode<T> obCurrent, T obElem)
	{
		if(obCurrent == null)
		{
			return null;
		}
		if(obCurrent.getElem().compareTo(obElem)>0) //gone past the possible locations for the element
		{
			return obCurrent; // element was not in the list
		}
		if(obCurrent.getElem().equals(obElem)) // if it is the element we wish to delete
		{
			//ONode<T> obNode = new ONode<T>(obElem) ;
			//obCurrent.setNext(obNode);
			return obCurrent.getNext();
		}
		
		
		//Recursion case
		obCurrent.setNext(delete(obCurrent.getNext(), obElem)); // set the next element to be equals to whatever is returned from .getnext
		return obCurrent;
		
	}
	
	/**
	 * This method will attempt to resort the current list by creating a new LinkedList that will be sorted according to
	 * the BiFunction that is passed in.
	 * @param fn
	 */
	public void sort(BiFunction<T, T, Integer> fn)
	{
		
		OLList<T>  obOther = new OLList<>();
		ONode<T> obCurrent = this.obHead; //creating a new Linkedlist and passing in the elements with the Function to sort it
		
		while(obCurrent != null)
		{
			
			T obElem = obCurrent.getElem();
			obOther.add(obElem, fn);
			obCurrent = obCurrent.getNext();
			
			
		}
		
		this.obHead = obOther.obHead;
		
		
		
	}
	
	public ONode<T>get()
	{
		return this.obHead;
	}
	
	public ONode<T> getMax()
	{
		if(this.obHead.getNext() == null)
		{
			return this.obHead;
		}
		return getMax(this.obHead, this.obHead.getNext());
	}
	
	
	public ONode<T>getMax(ONode<T> obCurrent, ONode<T> obOther)
	{
		//BaseCase
		if(obCurrent.getNext() == null)
		{
			return obCurrent;
		}
		if(obCurrent.getElem().compareTo(obCurrent.getElem())<0)
		{
			
		}
		
		//Recursive case
		
		return getMax(obCurrent,obCurrent.getNext());
		
		
	}
	
	
	public ONode<T>getLast(ONode<T> obCurrent)
	{
		//BaseCase
		if(obCurrent.getNext() == null)
		{
			return obCurrent;
		}
		
		//Recursive case
		
		return getLast(obCurrent.getNext());
		
		
	}
	
	
	@Override
	public String toString()
	{
		return addString(this.obHead);
	}
	
	
	
	public String addString(ONode<T> obCurrent)
	{
		String sTotal = "";
		//BaseCase1 obhead is empty
		if(obCurrent ==null)
		{
			return sTotal;
		}
		else
		{
			
			return String.format("%s \n %s",obCurrent.getElem(), addString(obCurrent.getNext()));
			
			
		}
			
//		//Recursive case
//		sTotal += obCurrent.toString();
//		return addString(obCurrent.getNext(),sTotal);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
