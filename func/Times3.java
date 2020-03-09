package func;

import java.util.function.Function;

public class Times3<T,R> implements Function<Integer, Integer> 
{

	@Override
	public Integer apply(Integer t)
	{
	
		return t*3;
	}

}
