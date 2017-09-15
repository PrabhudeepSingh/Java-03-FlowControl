class WhileStatement1
{
  public static void main(String[] args)
  { 
    while(true)
    {
      System.out.println("hello"); //hello hello hello..........
    }

    //System.out.println("hello"); -> CE:unreachable statement
 
    /*while(false)
    {                          
    	System.out.println("hello");  ->  CE:unreachable statement
    }
    
    System.out.println("hello"); */
  }
}