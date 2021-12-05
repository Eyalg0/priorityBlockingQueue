package com.eyalg0.pbq.task;

import java.util.concurrent.PriorityBlockingQueue;

import com.eyalg0.pbq.model.Task;

public class Consumer implements Runnable {

	private PriorityBlockingQueue<Task> queue;
	
	public Consumer(PriorityBlockingQueue<Task> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		
		while(true) {
			System.out.println("Polling...");
			try {
			    Task task = queue.take();
			    System.out.println("Polled: " + task);
			    if (task.getPriority() == -1) {
			    	return;
			    }
			    if (!task.isRemove()) {
			    	queue.add(task);
			    }
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
		}
	}
}
