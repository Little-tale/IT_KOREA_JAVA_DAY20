package synchronize;

class B implements Runnable
{@Override
	   public void run() {
    //interrupted() 메소드는 한 번 사용하면 false로 바뀐다
    System.out.println(Thread.interrupted());
    System.out.println(Thread.interrupted()); 
    
    for(int i = 0; i < 10; i++) {
       if(Thread.interrupted()) {
          System.out.println("인터럽트발생!!");
          break;
       }
       System.out.println(i);
    }
 }
 
}



public class A
{  
	public static void main(String[] args) {
    Thread t1 = new Thread(new B());
    
    t1.start();
    t1.interrupt();

 }

}
