package main;

import base.SpringBean;
import bean.AopAction;
import bean.MyClass;
import bean.SweetStudent;
import bean.SweetTeacher;

public class Main {
	public static void main(String[] args)
	{
		//////////////////bean注入
		System.out.println("...................注入............................");
		SweetTeacher t = (SweetTeacher) SpringBean.single().getContext().getBean("teacher");
		System.out.println(t.getName());
		/////////////////通过set注入
		SweetStudent s = (SweetStudent) SpringBean.single().getContext().getBean("student");
		System.out.println(s.getTeacher().getAge());
		System.out.println(s.getAge());
		System.out.println(s.getName());
		//////////////通过构造函数注入
		SweetStudent s1 = (SweetStudent) SpringBean.single().getContext().getBean("student1");
		System.out.println(s1.getTeacher().getAge());
		System.out.println(s1.getAge());
		
		////////控制反转
		System.out.println("...................控制反转.............................");
		MyClass cl1 = (MyClass) SpringBean.single().getContext().getBean("mycl1");
		cl1.getP1().showMy();
		cl1.getP2().showMy();
		
		MyClass cl2 = (MyClass) SpringBean.single().getContext().getBean("mycl2");
		cl2.getP1().showMy();
		cl2.getP2().showMy();
		
		
		///////AOP面向切面编程
		System.out.println("...................面向切面.............................");
		AopAction action =   (AopAction) SpringBean.single().getContext().getBean("aopAction");
		action.execute();
		action.execute2();
	}
}
