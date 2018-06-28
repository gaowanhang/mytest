package com.itheima01;

public class Person {
//	包含姓名,年龄,身高属性.私有成员变量
	private String name ;
	private int age;
	private int line;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, int line) {
		super();
		this.name = name;
		this.age = age;
		this.line = line;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", line=" + line + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + line;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (line != other.line)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
