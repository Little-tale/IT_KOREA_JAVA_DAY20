package synchronize;

public class SynchronizeTest {

	public static void main(String[] args)
	{
		Test test = new Test(100);
		
		Thread t1 = new Thread(test, "쓰레드 -1");
		Thread t2 = new Thread(test, "쓰레드 -2");
		
		
		t1.start();
		t2.start();
		// 100에서 10씩 5번 뻇는 쓰레드 2개를 실행ㅎ했지만
		// 결과는 0이다.
		// synchronized를 적용후는 0으로 끝난다.
		
		
		
		
	}

}
