package com.d3ti.pbolanjt20.threadProject;

import com.d3ti.pbolanjt20.thread.MethodSinkronisasi;

public class ObjectSinkronisasi extends Thread{
int[] a= {5, 6, 7, 8, 9};
	
	public ObjectSinkronisasi(String name) {
		super(name);
	}
	public void tampil(String nama) {
		synchronized(a) {
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread: "+nama+" posisi: "+a[i]);
			}
		}
	}
	public void run() {
		tampil(getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread pesawat = new Thread(new MethodSinkronisasi("pesawat"));
		Thread kereta = new Thread(new MethodSinkronisasi("kereta"));
		pesawat.start();
		kereta.start();

	}
}
