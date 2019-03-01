package com.java.core.employee;

import java.time.LocalDate;


/**
 * Ա����
 * Ŀ�ģ�����JAVA���ı���е�����
 * @author 14221
 *
 */
public class Employee {

	private String name;
	private double sallary;
	private LocalDate time;
	
	/**
	 * ������
	 * ��ʼ����Ա����
	 * @param name	Ա������
	 * @param sallary	Ա��нˮ 
	 * @param year	��
	 * @param month	��
	 * @param day	��
	 */
	public Employee(String name, double sallary, int year, int month, int day) {
		this.name = name;
		this.sallary = sallary;
		this.time = LocalDate.of(year, month, day);
	}

	/**
	 * ��ȡԱ������
	 * @return	Ա������
	 */
	public String getName() {
		return name;
	}

	/**
	 * ����Ա������
	 * @param name	Ա������
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��ȡ��ǰʱ��
	 * @return	��ǰʱ��
	 */
	public LocalDate getTime() {
		return time;
	}

	/**
	 * ���õ�ǰʱ��
	 * @param time	��ǰʱ�����LocalDate����
	 */
	public void setTime(LocalDate time) {
		this.time = time;
	}

	/**
	 * ��ȡнˮ
	 * @return	����нˮ
	 */
	public double getSallary() {
		return sallary;
	}
	
}
