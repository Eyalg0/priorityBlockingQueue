package com.eyalg0.pbq;

import java.util.ArrayList;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

import com.eyalg0.pbq.model.Task;
import com.eyalg0.pbq.task.Consumer;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<Task>();
		
		queue.add(new Task(2, "number 2", true));
		queue.add(new Task(5, "number 5", true));
		
		queue.add(new Task(4, "number 4", false));
		
		
		Consumer c = new Consumer(queue);
		Thread t = new Thread(c);
		t.start();
		System.out.println("thread started");
		queue.add(new Task(6, "number 6", false));
		queue.add(new Task(3, "number 3", true));
		queue.add(new Task(1, "number 1", true));
		
		Thread.sleep(TimeUnit.SECONDS.toMillis(10));
		queue.add(new Task(-1, "poisen", true));
		System.out.println("end");
	}

}
