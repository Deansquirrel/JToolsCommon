package com.yuansong.tools.common;

public interface IRunUntillSuccess  {
	
	public boolean getPremiss();
	
	public void job() throws Exception;
	
	default public void start() {
		this.start(5000L);
	}
	
	default public void start(long interval) {
		Thread d = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					try {
						if(getPremiss()) {
							job();
							break;							
						}
					}catch(Exception e) {
						System.out.println(ExceptionTool.getStackTrace(e));
						e.printStackTrace();
					}
					try {
						Thread.sleep(interval);
					} catch (InterruptedException e) {}
				}
			}
			
		});
		d.start();
	}

}
