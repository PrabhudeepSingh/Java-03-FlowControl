class SwitchStatement3
{
  public static void main(String[] args)
  {
    int x=10;
    switch(x+1) //switch argument can be expression
    {
      case 10: System.out.println(10);
               break;

      case 11: System.out.println(11);//11
               break;

      case 10+20+30: System.out.println(60); //only constant expression allowed
                     break;
    }
  }
}