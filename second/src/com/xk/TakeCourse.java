package com.xk;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class TakeCourse {

static List<Courses> Courses=new ArrayList();

public static void main(String[] args) {

// TODO Auto-generated method stub

TakeCourse tc=new TakeCourse();

Students stu=new Students();

stu.setId("1");

stu.setName("张三");

tc.addCourse();

System.out.println("-----------欢迎【"+stu.getName()+"】进入选课系统----------\n待选课程信息:\n课程号\t课程名\t");

tc.getCourse();

Scanner input = new Scanner(System.in);

for(int i=1;i<=3;i++){

int flag=0;

System.out.println("输入您要选择的第"+i+"门课程号:");

String courseId=input.next();

for (Courses c : Courses) {

if (c.getId().equals(courseId)) {

stu.courses.add(c);

flag=0;

break;

}else{

flag=1;

}

}

if(flag!=0){

System.out.print("输入错误,重新");

i--;

}

}

input.close();

System.out.println("您共选择了:" + stu.courses.size() + "门课程!\n课程号\t课程名\t");

for (Courses c : stu.courses) {

System.out.println(c.getId() + '\t' +c.getName());

}

}

public void addCourse(){

Courses c1=new Courses();

c1.setId("0101");

c1.setName("语文");

Courses c2=new Courses();

c2.setId("0102");

c2.setName("数学");

Courses c3=new Courses();

c3.setId("0103");

c3.setName("英语");

Courses c4=new Courses();

c4.setId("0104");

c4.setName("Java");

Courses.add(c1);

Courses.add(c2);

Courses.add(c3);

Courses.add(c4);

}

public void getCourse(){

for (Courses c : Courses) {

System.out.println(c.getId() + "\t" + c.getName());

}

}

}
