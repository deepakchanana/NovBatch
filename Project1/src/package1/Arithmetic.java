package package1;

public class Arithmetic
{
  public int sum(int a,int b)
  {
	  int c;
	  c=a+b;
	  System.out.println("sum result is "+c);
	  return c;
  }
  public int sub(int a1,int a2)
  {
	  int result;
	  result=a1-a2;
	  System.out.println("sub result is "+result);
	  return result;
  }
  public void multi(int x,int y)
  {
	  int z;
	  z=x*y;
	  System.out.println("final result is "+z);
  }
  public static void main(String[] args) 
  {
	Arithmetic deepak=new Arithmetic();
	int sumresult=deepak.sum(12, 2);
	int subresult=deepak.sub(12,2);
	deepak.multi(sumresult, subresult);
  }
  
}
