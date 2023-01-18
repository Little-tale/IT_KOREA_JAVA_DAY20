package thredTest;

public class MyThread2 implements Runnable 
{
	//필드
	
	
	
	//생성자
	

	
	
	
	
	
	//  Runnable 인터페이스 구현방법 시작!
	
	
	
	
	
	@Override
	public void run() 
	{
	// 스티링 타입에 네임 만들고 겟 네임 확안	
		String name = Thread.currentThread().getName();
		//현재쓰레드. 이름가져오기
		
		for(int i = 0 ; i < 10; ++i)
		{
			System.out.println(name);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}	
		}
		System.out.println(name + "쓰레드 종료!");
	}	

	
}
