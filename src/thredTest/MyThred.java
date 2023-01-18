package thredTest;

public class MyThred extends Thread
{	// 필드
	String str;

	
	
	//생성자
public MyThred(String str)
{
	this.str = str;
}
	// 오버라이딩


// start()할때 건들인것(총3개)
@Override
public void run() {
	for(int i= 0; i<10 ; ++i)
	{
		System.out.println(str);
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	System.out.println(str+" 종료");
	super.run();
}


	
}
