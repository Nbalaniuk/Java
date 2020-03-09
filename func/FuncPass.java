package func;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FuncPass
{
	private static int doOper(Function<Integer,Integer> fn, Integer obVal)
	{
		
		return fn.apply(obVal);
		
	}
	private static int doOper2(BiFunction<Integer,Integer,Integer> fn, Integer nVal1, Integer nVal2)
	{
		return fn.apply(nVal1, nVal2);
	}
	
	
	public static Function<Integer,Integer> Times4 = x-> x*4;
	
	public static int modify(int nVal)
	{
		return nVal *6;
	}
	
	public static void main(String[] args)
	{
		Integer nVal = 12;
		
		System.out.printf("%d\n",doOper(new Times2<>(), nVal));
		System.out.printf("%d\n",doOper(new Times3<>(), nVal));
		//System.out.printf("%d\n",doOper(new Times4<>(), nVal));
		
		List<Integer> obList = Arrays.asList(10,19,8,14,11);
		
		obList.forEach(x->System.out.printf("%d\n", doOper(new Times2<>(),x)));
		System.out.printf("\n\n");
		obList.forEach(x->System.out.printf("%d\n", doOper(Times4,x)));
		System.out.printf("\n\n");
		obList.forEach(x-> System.out.printf("%d\n",x*5));
		
		System.out.printf("\n\n");
		obList.forEach(x-> System.out.printf("%d\n",doOper(y-> y*5, x))); // calls doOper on y -> y*5, at location x
		System.out.printf("\n\n");
		obList.forEach(x-> System.out.printf("%d\n",modify(x)));
		
		System.out.printf("\n\n");
		System.out.printf("%d\n", doOper2((x, y) -> x*y, 12,10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
