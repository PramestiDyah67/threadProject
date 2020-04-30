package com.d3ti.pbolanjt20.threadProject;

public class MainThread {
	public void jalan(String name) {
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread: "+name+" posisi: "+i);
		}
	}

	public static void main(String[] args) {
		ThreadExtends vespa = new ThreadExtends("vespa");
		ThreadExtends sepeda = new ThreadExtends("sepeda");
		vespa.start();
		sepeda.start();

	}
}
