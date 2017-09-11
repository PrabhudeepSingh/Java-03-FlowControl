class BreakStatement2
{
	public static void main(String[] args)
	{ 
		int x=10;
		
		l:
		{
			System.out.println("begin");
			if(x==10)
			break l;
			System.out.println("end");
		}
		
		System.out.println("hello");
	}
}
