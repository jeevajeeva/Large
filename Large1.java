# Large
import java.util.*;
public class Large1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println("The Large number");
    if((a>b)&&(a>c))
    
    {
      System.out.println(a);
    }
    else if((b>a)&&(b>c))
    {
      System.out.println(b);
    }
    else
    {
      System.out.println(c);
    }
  }
}
