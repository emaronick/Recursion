
public class TracingA
	{
	public static void main(String[] args)
		{
		System.out.println(trace(7));
		}
	
	public static int trace(int n)
		{
		if(n <= 1)
			{
			return 1;
			}
		else
			{
			return trace(n - 2) + n;
			}
		}
	}
