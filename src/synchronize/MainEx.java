package synchronize;

import javax.swing.JOptionPane;

public class MainEx {

	public static void main(String[] args)
	{
		ThreadEx te = new ThreadEx();
		Thread t1 = new Thread(te);
		String[] btn = {"-1","종료"};
		int choice =0;
		
		t1.start();
		
		while(true)
		{
			choice = JOptionPane.showOptionDialog(null, "","숫자놀이",
					JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,btn,null);
			
			if (choice==0)
			{
				te.user();
			}else {
				//쓰레드가 멈췄을때 InterruptedException을 발생시킨다.
				t1.interrupt(); // sleep
				System.out.println("종료");
				System.exit(0); // 프로그램 종료
				break;
			}
		}

	}

}
