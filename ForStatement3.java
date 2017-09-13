public class ForStatement3
{ 
  public static void main(String []args)
    {
       for(int i=0;true;i++)
       {
       System.out.println("hello"); //hello hello hello......
       }
       
       // System.out.println("hiiii");  -> CE : unreachable statement
       
       // for(int i=0;false;i++)
       // {                      
       //      System.out.println("hello"); -> CE:unreachable statement 
       // }

       //System.out.println("hi");
     }
}
