package com.eyalg0.pbq.model;

public class Task implements Comparable<Task> {
	private Integer priority;
	private String message;
	private boolean isRemove;

	public Task(Integer priority, String message, boolean isRemove) {
		super();
		this.priority = priority;
		this.message = message;
		this.isRemove = isRemove;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isRemove() {
		return isRemove;
	}
	public void setRemove(boolean isRemove) {
		this.isRemove = isRemove;
	}
	
	@Override
	public String toString() {
		return "Task [priority=" + priority + ", message=" + message + ", isRemove=" + isRemove + "]";
	}
	
	@Override
	public int compareTo(Task o) {
		return o.getPriority().compareTo(this.priority);
	}
}
