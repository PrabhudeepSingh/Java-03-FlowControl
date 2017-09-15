class WhileStatement2
{
  public static void main(String[] args)
  {   
    int a=10,b=20;
    while(a<b)
    {
      System.out.println("hello");
    }

    System.out.println("hello"); // reachable b'z a & b values are not final
  }
}