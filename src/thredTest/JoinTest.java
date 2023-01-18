package thredTest;

public class JoinTest {

	public static void main(String[] args)
	{	Runnable r1 = () ->
		{
			for(int i = 0; i <10 ; ++i)
			{				
				System.out.println(Thread.currentThread().getName());
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				
			}
			
			System.out.println(Thread.currentThread().getName() + "쓰레드 종료!!");
			
		};
		
		Thread t1 = new Thread(r1,"t1");
		Thread t2 = new Thread(r1,"t2");
		
		t1.start();
		t2.start();
		
		try {
			// 조인 t1에 사용
			t1.join(1000); // 이놈이 종료되어야만 다른 쓰레드들이 종료됨.		
		}
		catch (InterruptedException e2)
		{
			e2.printStackTrace();
		}
		
		for(int i = 0; i < 5; ++i)
		{
			System.out.println(Thread.currentThread().getName());
			
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e2)
			{
				e2.printStackTrace();
			}
			
			
		}
		System.out.println("main Thread 종료");
	}

}
