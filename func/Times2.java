package func;

import java.util.function.Function;

public class Times2 <T,R> implements Function<Integer, Integer>
{

	@Override
	public Integer apply(Integer arg0)
	{
		
		return arg0*2;
	}
	
			
	
}
