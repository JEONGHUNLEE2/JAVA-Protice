
public class F_ReculFactorial
{

	public static void main(String[] args)
	{
		System.out.println("3 factorial: " + factorial(3));
		System.out.println("12 factorial: " + factorial(12));
		
	}
	
	public static int factorial(int n)
	{
		if(n==1)
			return 1;
		else
			return n * factorial(n-1);
	}

}
//같이 써주는거랑 무슨차이지...아아 return해주고 안해주고차이?
//return은 정확하게 뭘해주는거지.......console에 뜨는거랑 뭔차이