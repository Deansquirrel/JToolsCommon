package com.yuansong.tools.common;

import java.util.Random;

/***
 * 计算工具类
 * @author yuansong6@163.com
 *
 */

public class MathTool {
	/***
	 * 根据指定范围，返回随机整数
	 * @param min 最小值
	 * @param max 最大值（不含）
	 * @return
	 */
	public static Integer RandInt(Integer min,Integer max) {
		if(min == max) {
			return min;
		}
		if(min>max) {
			Integer t = min;
			min = max;
			max = t;
		}
		Random r = new Random();
		return min + r.nextInt(max-min);
	}
}
