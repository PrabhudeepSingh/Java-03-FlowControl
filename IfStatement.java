class IfStatement
{
  public static void main(String[] args)
  {
    if(true)
    //int x=10;     ->declarative statement not allowed
    //if(true);     ->no output
    System.out.println("hello");  // without { } only one statement allowed
  }
}