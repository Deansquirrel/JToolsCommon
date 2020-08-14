package com.yuansong.tools.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/***
 * 日期工具类
 * @author yuansong6@163.com
 *
 */
public class DateTool {
	
	private DateTool() {}
	
	private static String _defaultFormat = "yyyy-MM-dd HH:mm:ss.SSS";
	private static String _dateFormat = "yyyy-MM-dd";
	private static String _datetimeFormat = "yyyy-MM-dd HH:mm:ss";
	private static String _datetimeWithMillionsecondFormat = "yyyy-MM-dd HH:mm:ss.SSS";
	
	/***
	 * 根据日期和指定格式，返回日期字符串
	 * @param date
	 * @param format
	 * @return
	 */
	public static String GetStr(java.util.Date date,String format) {
		if(date == null || format == null || format.trim() == "") {
			return null;
		}
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	/***
	 * 根据日期和默认格式，返回日期字符串
	 * @param date
	 * @return
	 */
	public static String GetStr(java.util.Date date) {
		if(date == null) {
			return null;
		}
		return GetStr(date,_defaultFormat);
	}
	
	/***
	 * 根据当前时间和默认日期格式，返回日期字符串
	 * @return
	 */
	public static String GetDateStr() {
		return GetStr(new java.util.Date(),_dateFormat);
	}
	
	/***
	 * 根据日期和默认日期格式，返回日期字符串
	 * @param date
	 * @return
	 */
	public static String GetDateStr(java.util.Date date) {
		if(date == null) {
			return null;
		}
		return GetStr(date,_dateFormat);
	}
	
	/***
	 * 根据当前时间和默认日期时间格式，返回日期字符串
	 * @return
	 */
	public static String GetDatetimeStr() {
		return GetStr(new java.util.Date(),_datetimeFormat); 
	}
	
	/***
	 * 根据日期和默认日期时间格式，返回日期字符串
	 * @param date
	 * @return
	 */
	public static String GetDatetimeStr(java.util.Date date) {
		if(date == null) {
			return null;
		}
		return GetStr(date,_datetimeFormat);
	}
	
	/***
	 * 根据当前时间和默认日期时间格式，返回日期字符串（含毫秒）
	 * @return
	 */
	public static String GetDatetimeWithMillionsecond() {
		return GetStr(new java.util.Date(),_datetimeWithMillionsecondFormat);
	}
	
	/***
	 * 根据日期和默认日期时间格式，返回日期字符串（含毫秒）
	 * @param date
	 * @return
	 */
	public static String GetDatetimeWithMillionsecond(java.util.Date date) {
		if(date == null) {
			return null;
		}
		return GetStr(date,_datetimeWithMillionsecondFormat);
	}
	
	/***
	 * 根据日期字符串和指定格式，返回日期
	 * @param date
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static java.util.Date ParseStr(String date,String format) throws ParseException{
		if(date == null || format == null || format.trim() == "") {
			return null;
		}
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.parse(date);
	}
	
	/***
	 * 根据日期字符串和默认格式，返回日期
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static java.util.Date ParseStr(String date) throws ParseException{
		if(date == null) {
			return null;
		}
		return ParseStr(date,_defaultFormat);
	}
	/***
	 * 根据日期字符串和默认日期格式，返回日期
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static java.util.Date ParseDateStr(String date) throws ParseException{
		if(date == null) {
			return null;
		}
		return ParseStr(date,_dateFormat);
	}
	/***
	 * 根据日期字符串和默认日期时间格式，返回日期
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static java.util.Date ParseDatetimeStr(String date) throws ParseException{
		if(date == null) {
			return null;
		}
		return ParseStr(date,_datetimeFormat);
	}
	
	/***
	 * 根据日期字符串和默认日期时间格式，返回日期（含毫秒）
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static java.util.Date ParseDatetimeWithMillionsecond(String date) throws ParseException{
		if(date == null) {
			return null;
		}
		return ParseStr(date,_datetimeWithMillionsecondFormat);
	}
}
