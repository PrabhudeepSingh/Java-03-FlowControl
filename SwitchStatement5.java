class SwitchStatement5
{
  public static void main(String[] args)
  { 
    int x=0;

    switch(x)
    {
      case 0: System.out.println(0);
      
      case 1: System.out.println(1);

      case 2: System.out.println(2);
      
      case 3: System.out.println(3);
              break;  //all statement will be executed until break if case label is matched.
      
      case 4: System.out.println(3);
	      break;
      
      default: System.out.println(3);
    }
  }
}
      