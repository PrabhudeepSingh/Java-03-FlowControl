class SwitchStatement4
{
  public static void main(String[] args)
  {
    byte x=10;

    switch(x)
    {
      case 10: System.out.println(10);
               break;

      // case 10: 	-> duplicate case label are not allowed

      case 100: System.out.println(100);
                break;

      //case 1000:   -> CE: incompatible types (case label should be in the range of switch argument). 
    }
  }
}