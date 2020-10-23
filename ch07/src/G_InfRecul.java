
public class G_InfRecul
{

	public static void main(String[] args)
	{
		showHi(3);
	}

	public static void showHi(int cnt) // void와 int차이 다시 정리해보기
	{
		System.out.println("Hi~ " + cnt);
		
		if(cnt == 1)
			return;
		//showHi(cnt--); -> 무한 호출. 실행하지 말것 
		showHi(--cnt);
	}
}
