public class ForStatement5
{ 
  public static void main(String []args)
    { 
       int a=10,b=20;
       for(int i=0;a<b;i++)
       {
         System.out.println("hello");  //hello hello hello.......
       }
       System.out.println("hiii");  //reachable statement b'z a & b variable are not final
     }

       /*final int a=10,b=20;
         for(int i=0;a<b;i++)
         {
           System.out.println("hello");
         }
         System.out.println("hiii");  //unreachable statement b'z a & b variable are final*/
       

       /*final int a=10,b=20;
       for(int i=0;a>b;i++)
       { 
          System.out.println("hello");
       }*/

       //System.out.println("hiii");
}