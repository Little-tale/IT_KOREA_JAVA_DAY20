package synchronize;

public class ThreadEx implements Runnable
{
	int number;
	   
	   
	   @Override
	   public void run() {
	      for(int i = 0; i < 30; i++) {
	         com();
	         try {
	            Thread.sleep(500);
	         } catch (InterruptedException e) {
	            System.out.println("sleep~");
	            break;
	         }
	         
	      }
	      
	   }
	   
	   public synchronized void com() {
	      number++;
	      System.out.println("com + ");
	      System.out.println("num : " + number);
	      if (number > 9) {
	         System.out.println("com이 num을 최대치로 올렸습니다.");
	         try {
	            wait();
	         } catch (InterruptedException e) {
	            System.out.println("wait~");
	         }
	      }
	   }
	   
	   public synchronized void user() {
	      if(number == 0 ) {
	         System.out.println("이미 num이 최소치입니다.");
	      }else {
	         number --;
	         System.out.println("user - ");
	         System.out.println("num : " + number);
	         notify();
	      }
	   }
	}