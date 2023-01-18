package thredTest;

public class ThreadTest {

	public static void main(String[] args)
	{
		MyThred t1 = new MyThred("#");
		MyThred t2 = new MyThred("*");
		
		//단일 쓰레드
//		t1.run(); // 단일 쓰레드로 실행됨
//		t2.run();	// run() 단순히 재정의한 코드를 실행
		
		t1.start();	//
		t2.start(); //
		//run은 메인쓰레드
		//start는 다른 쓰레드
		// start()일 때 (3개의 쓰레드가 있는 것)
			
		
		
	}

}
