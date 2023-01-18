package synchronize;

import java.time.LocalTime;

public class Test implements Runnable
{private int number;

//생성자
public Test(int number) {
   this.number = 100;
}

//메소드
@Override
public void run() {
   for(int i = 0; i<5; i++) {
      sub(10);
      try {
         Thread.sleep(500);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
   
}

public /* synchronized */ void sub(int number) {
   String name = Thread.currentThread().getName();
   synchronized (this)
   {
	   this.number -= number;
   }
   
   
   System.out.println(name + " : - " + number);
   System.out.println("현재 number : " + this.number);
}
}