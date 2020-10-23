
public class MyExam3
{

	public static void main(String[] args) // A
	{
		int num1 = 1;
		int num2 = 2;
		Add1(num1, num2);
		Add2(num1, num2);
		
		for(int i = 0; i<10; i++)
		{
			System.out.println(i);
			int numX= 0; // 의미없구 그냥 밖에서 못쓴다는거 알려주려고 적은거임
			System.out.println(num1); // 안에서는 num1을 사용가능
		}
		System.out.println(num1); // 여기서 numX를 사용 못함
	}
	
	public static void Add2(int num3, int num4) // B, A에 있는 변수랑 여기랑은 완전 별개
	{
		int num1 = num3;
		int num2 = num4;
		
		System.out.println(num1 + num2);
	}
	
	public static void Add1(int num1, int num2)
	{
		System.out.println(num1 + num2);
	}

}
