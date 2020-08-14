package com.yuansong.tools.common;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionTool {
	
	/**
	 * 将错误堆栈输出到文本
	 * @param t
	 * @return
	 */
	public static String getStackTrace(Throwable t) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);
		return sw.toString();
	}

}
