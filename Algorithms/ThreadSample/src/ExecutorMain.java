import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMain {

	public static void main(String[] args) {
		Thread t1= new Thread(new TaskRunnable());
		Runnable t2=new TaskRunnable();
		
		Thread t3= new Task();
		Runnable t4 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
		//t1.start();
		ExecutorService pool= Executors.newFixedThreadPool(2);
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		
		pool.shutdown();

	}

}

//Wait notify



class TaskRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello from runnable task");

	}

}

class Task extends Thread{


	public void run()
	{

		System.out.println("Hello from task");
	}
}