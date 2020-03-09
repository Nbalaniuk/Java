package func;

import java.util.function.Consumer;

public class ConsImp<T> implements Consumer<T>
{

	private static int nVal =0;
	
	@Override
	public void accept(T arg0)
	{
		System.out.printf("(%d) %s", nVal++, arg0);
		
	}
	
}
