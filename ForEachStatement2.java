public class ForEachStatement2
{ 
  public static void main(String []args)
  { 
    int [][][]x={{{10,20,30,40},{10,20,30,40},{10,20,30,40}}};
    for(int[][]x1:x)
    {
      for( int[]x2:x1)
        {
          for(int x3:x2)
            {
             System.out.println(x3);
            }
        }
    }
  }
}
  