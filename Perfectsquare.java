import java.util.*;
class PerfectSquare{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    if(n==1)
     System.out.println("true");
    else if(n==2)
     System.out.println("false");
    else
   System.out.println(isPerfectSquare(n));
  }
  public static boolean isPerfectSquare(int n){
   int flag=0;
  for(int i=3;i<n/2;i++)
  {
   if(i*i==n)
     {
       flag=1;
        break;
     } 
    else
     {
       if(i*i>n)
        break;
     }
  }
   if(flag==1)
     return true;
    else
     return false;
 } 
}