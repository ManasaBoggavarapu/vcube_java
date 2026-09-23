package com.javaintro.constructors;
//DEFAULT CONSTRUCTOR///
public class Student {
  int sid;
  String  name;
  


public static void main(String[]args) {
	Student s1=new Student();
	s1.sid=13;
	s1.name="Manasa";
	s1.Studentinfo();
}
void Studentinfo()
{
	System.out.println("STUDENT ID IS:"+sid);
	System.out.println("STUDENT NAME IS:"+name);
	

}
}

