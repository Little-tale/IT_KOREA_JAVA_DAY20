package thredTest;

//import java.rmi.server.RMIClassLoader;
//import java.security.PublicKey;

class MyRunnable extends Thread implements Runnable
{
	  @Override
	   public void run() {
	      System.out.println("쓰레드1단계");
	      thread2();
	   }
	   
	   public void thread2() {
	      System.out.println("쓰레드2단계");
	      thread3();
	   }
	   
	   public void thread3() {
	      System.out.println("쓰레드3단계");
	   }
	}

	public class JoinThread {

	   public static void main(String[] args) {
	      System.out.println(Thread.currentThread().getName() + "시작");
	      
	      Runnable r = new MyRunnable();
	      Thread thread = new Thread();
	      thread.start();
	      
	      try {
	         thread.join();
	      } catch (InterruptedException e) {
	         e.printStackTrace();
	      }
	      
	      System.out.println(Thread.currentThread().getName() + "끝");

	   }

	}
