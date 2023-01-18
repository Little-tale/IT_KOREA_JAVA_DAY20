package thredTest;

public class ThreadTest2 {

	public static void main(String[] args)
	{
	/*{
		MyThread2 mt1 = new MyThread2();
		MyThread2 mt2 = new MyThread2();
		
		Thread t1 = new Thread(mt1,"A"); // 쓰레드 생성자가 런에이블 타겟으로 넣어줄수 있다.
		Thread t2 = new Thread(mt2,"B"); // 이름도 지어서 넣어줄수 있다.
		
		t1.start();
		t2.start();
		
		
		// 런에이블 인터페이스는 함후형 인터페이스이다.
		
		//람다식으로 가자
		Runnable r1 = () -> 
		{
			for(int i =0 ; i<10; ++i)
			{
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		Thread test = new Thread(r1,"C");
		test.start();
		System.out.println("XX테스트XX");
		*/
		
		//한번에 같이 사용하기
		
		 Thread t3 = new Thread(() ->
		 {
	         for(int i = 0; i < 10; i++)
	         {
	            System.out.println(Thread.currentThread().getName());
	         try
	         {
	            Thread.sleep(500);   
	         }
	         catch (InterruptedException e)
	         {
	            e.printStackTrace();
	         }
	      }
	         System.out.println(Thread.currentThread().getName() + "쓰레드종료!!");
	      }, "C");

		
		
	}

}
