package com.yuansong.tools.common;

public interface IRunUntillSuccess  {
	
	/**
	 * 是否开始执行
	 * @return
	 */
	public boolean getPremiss();
	
	/**
	 * 执行内容（报错后会继续执行）
	 * @throws Exception
	 */
	public void job() throws Exception;
	
	/**
	 * 执行任务前内容
	 */
	public void prefixJob();
	
	/**
	 * 执行任务后执行
	 */
	public void suffixJob();
	
	default public void startMain() {
		this.startMain(5000L);
	}
	
	default public void startThread() {
		this.startThread(5000L);
	}
	
	default public void startMain(long interval) {
		runJob(interval);
	}
	
	default public void startThread(long interval) {
		Thread d = new Thread(new Runnable() {

			@Override
			public void run() {
				runJob(interval);
			}
			
		});
		d.start();		
	}
	
	default void runJob(long interval) {
		try {
			this.prefixJob();
		} catch(Exception e) {}
		while(true) {
			try {
				if(getPremiss()) {
					job();
					break;						
				}
			}catch(Exception e) {
				ExceptionTool.getStackTrace(e);
			}
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {}
		}
		try {
			this.suffixJob();
		} catch(Exception e) {}
	}
}
