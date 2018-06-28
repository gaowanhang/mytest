package com.itheima01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ѵ������
�Զ�������:��������,����,�������.˽�г�Ա����,�����޲�,�вι��췽��,����get/set����.
����5���˷ŵ�ArrayList��.ʹ�õ�������ȡÿ���˵���Ϣ.
�ҳ���ߵ���,����˲��������˺���˵���Ϣ.
��ӡ��ʽ����:��ߵ���������,���1.80. �����������,���1.60
������������
	1.����ѧ�����������޲�,�вι��췽��,����get/set����
	2.����ArrayList
	3.���5��ѧ��
	4.��ȡ������
	5.���������
	6.�������
	7.ʹ�õ�����ѭ���ж��Ƿ�����һ����
	8.ʹ��next������ȡѧ������
	9.�ж�����˵ĵ�����Ƿ�������߶�
	10.����˵ĵ���ߴ������߶�.�����ߵ��˵��������
	11.�ж�����˵ĵ�����Ƿ�С������߶�
	12.����˵ĵ����С������߶�.���ߵ��˵��������
	13.���ո�ʽ��ӡ��Ϣ
 */
public class Demo01 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("����",17,180));
		list.add(new Person("����",18,189));
		list.add(new Person("����",19,176));
		list.add(new Person("����",20,173));
		list.add(new Person("����",30,160));
		
		int max = list.get(0).getLine();
		int min = list.get(0).getLine();
		
		Iterator<Person> iterator = list.iterator();
		for (Person person : list) {
			if(person.getLine()>max){
				max = person.getLine();
			}
			if(person.getLine()<min){
				min = person.getLine();
			}
			
			
		}
		System.out.println(max);
		System.out.println(min);
		
		
		
	}
}
