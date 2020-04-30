package com.d3ti.pbolanjt20.threadProject;

public class ThreadInterface extends MainThread implements Runnable {
	String name;
	public ThreadInterface(String name) {
			this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		jalan(name);
	}
}
