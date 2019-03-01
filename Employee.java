package com.java.core.employee;

import java.time.LocalDate;


/**
 * 员工类
 * 目的：检验JAVA核心编程中的内容
 * @author 14221
 *
 */
public class Employee {

	private String name;
	private double sallary;
	private LocalDate time;
	
	/**
	 * 构造器
	 * 初始化成员变量
	 * @param name	员工姓名
	 * @param sallary	员工薪水 
	 * @param year	年
	 * @param month	月
	 * @param day	日
	 */
	public Employee(String name, double sallary, int year, int month, int day) {
		this.name = name;
		this.sallary = sallary;
		this.time = LocalDate.of(year, month, day);
	}

	/**
	 * 获取员工姓名
	 * @return	员工姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置员工姓名
	 * @param name	员工姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取当前时间
	 * @return	当前时间
	 */
	public LocalDate getTime() {
		return time;
	}

	/**
	 * 设置当前时间
	 * @param time	当前时间对象LocalDate类型
	 */
	public void setTime(LocalDate time) {
		this.time = time;
	}

	/**
	 * 获取薪水
	 * @return	返回薪水
	 */
	public double getSallary() {
		return sallary;
	}
	
}
