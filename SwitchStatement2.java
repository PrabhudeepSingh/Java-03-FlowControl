class SwitchStatement2
{
  public static void main(String[] args)
  {
    int x=10;
    int y=10;

    switch(x)
    {
      case 10: System.out.println(10);
               break;

      //case y:  -> CE: constant expression required
    }
  }
}