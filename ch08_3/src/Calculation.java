class Calc   //new를 해서 사용해야하는 
{
	int add(int a, int b)
	{
		return a + b;
	}
}


public class Calculation
{
	// main(0 메서드와 같은 오브젝트 내의 메서드에는 static을 붙인다.
	static void disp()
	{
		int nRtn;
		Calc calc = new Calc();
		nRtn = calc.add( 3,  9);
	
		System.out.println("3 + 9 = " + nRtn); 
	}
	
	public static void main(String[] args)
	{
		disp();
	}

}

//new를 붙이거나
//static이 붙어있는 곳은 static이 붙어있어야 부를수잇다?