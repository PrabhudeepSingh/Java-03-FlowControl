class IfElseStatement
{
  public static void main(String[] args)
  {
    int x=0;
    int y=10;
    //if(x)  -> CE:incompatible types   -> x should be boolean type
    if(x==20)
    {
      System.out.println("hello");
    }
    else
    {
      System.out.println("hiii");
    }
  }
}