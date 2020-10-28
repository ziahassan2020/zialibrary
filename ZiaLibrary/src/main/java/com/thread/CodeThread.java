package com.thread;

public class CodeThread extends Thread{
	
	public void run() {
		System.out.println(getId()+" is running");
		System.out.println(getPriority()+" priority");
	}

}
