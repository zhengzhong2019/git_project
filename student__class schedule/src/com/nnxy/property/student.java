package com.nnxy.property;
/**
 * 学生实体类
 * @author XG402
 *创建时间：2019/05/07
 */
public class student {
	private int id;
	private String username;
	private String password;
	private int age;
	private int sex;
	public student(int id, String username, String password, int age, int sex) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.sex = sex;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
