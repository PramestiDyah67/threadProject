package com.d3ti.pbolanjt20.threadProject;

public class ThreadProject extends Thread{
	 int[] a={10,11,12,13};

	    public void tampil(String nama)
	    {
			synchronized(a){
	            for(int i=0;i<6;i++)
	            {
	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    //TODO: handle exception
	                    e.printStackTrace();
	                }
	                System.out.println("Thread : "+nama+" Posisi : "+a[i]);
	            }
	        }
	    }

	    public void run()
	    {
	        tampil(getName());
	    }

	    public static void main(String args[])
	    {
	        Thread I1 = new Thread(new MethodSinkronisasi("I1"));
	        Thread I3 = new Thread(new MethodSinkronisasi("I3"));
	        Thread I2 = new Thread(new ThreadInterface("I2"));
	        Thread I4 = new Thread(new ThreadInterface("I4"));
	        I1.start();
	        I3.start();
	        I2.start();
	        try {
	            I3.join(3000);
	        } catch (InterruptedException e) {
	            //TODO: handle exception
	            e.printStackTrace();
	        }
	        I4.start();
	    }

}
