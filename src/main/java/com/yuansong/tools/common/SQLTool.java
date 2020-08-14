package com.yuansong.tools.common;

import java.sql.ResultSet;
import java.sql.SQLException;

/***
 * SQL 帮助类
 * @author yuansong6@163.com
 *
 */

public class SQLTool {
	
	public static String getString(ResultSet rs, String columnLabel) throws SQLException {
		return rs.getString(columnLabel);
	}
	
	public static String getNString(ResultSet rs, String columnLabel) throws SQLException {
		return rs.getNString(columnLabel);
	}
	
	public Byte getByte(ResultSet rs, String columnLabel) throws SQLException {
		Byte d = rs.getByte(columnLabel);
		if(rs.wasNull()) {
			d = null;
		}
		return d;
	}
	
	public Short getShort(ResultSet rs, String columnLabel) throws SQLException {
		Short d = rs.getShort(columnLabel);
		if(rs.wasNull()) {
			d = null;
		}
		return d;
	}
	
	public static Integer getInt(ResultSet rs, String columnLabel) throws SQLException {
		Integer d = rs.getInt(columnLabel);
		if(rs.wasNull()) {
			d = null;
		}
		return d;
	}
	
	public static Long getLong(ResultSet rs, String columnLabel) throws SQLException {
		Long d = rs.getLong(columnLabel);
		if(rs.wasNull()) {
			d = null;
		}
		return d;
	}
	
	public static Float getFloat(ResultSet rs, String columnLabel) throws SQLException {
		Float d = rs.getFloat(columnLabel);
		if(rs.wasNull()) {
			d = null;
		}
		return d;
	}
	
	public static Double getDouble(ResultSet rs, String columnLabel) throws SQLException {
		Double d = rs.getDouble(columnLabel);
		if(rs.wasNull()) {
			d = null;
		}
		return d;
	}
	
	public static byte[] getBytes(ResultSet rs, String columnLabel) throws SQLException {
		return rs.getBytes(columnLabel);
	}
	
	public static java.sql.Date getDate(ResultSet rs, String columnLabel) throws SQLException {
		return rs.getDate(columnLabel);
	}
	
	public static java.sql.Time getTime(ResultSet rs, String columnLabel) throws SQLException {
		return rs.getTime(columnLabel);
	}
	
	public static java.sql.Date getDatetime(ResultSet rs, String columnLabel) throws SQLException {
		java.sql.Timestamp dt = rs.getTimestamp(columnLabel);
		if(rs.wasNull()) {
			return null;
		}
		return new java.sql.Date(dt.getTime());
	}
	
	public static java.math.BigDecimal getBigDecimal(ResultSet rs, String columnLabel) throws SQLException {
		return rs.getBigDecimal(columnLabel);
	}

}
