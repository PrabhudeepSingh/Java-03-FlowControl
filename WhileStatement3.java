class WhileStatement3
{
  public static void main(String[] args)
  {   
    final int a=10,b=20;
    while(a<b)
    {
      System.out.println("hello");//hello........
    }

   // System.out.println("hello"); -> CE: unreachable b'z a & b values are final
   
   /*final int a=10,b=20;
   while(a>b)
   {                            
    System.out.println("hello");  -> CE: unreachable
   }
    System.out.println("hello");*/
  }
}