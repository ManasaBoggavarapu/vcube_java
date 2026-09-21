
package com.javaintro.methods;

public class BugTracker {

	int  bugid;
	String applicationName;
	String Bugtitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	int getbugid()
	 {
		 return bugid;
		 
	 }
	 String getapplicationName()
	 {
		 return applicationName;
	 }
	 String getBugtitle()
	 {
		 return  Bugtitle;
	 }
	 String getseverity()
	 {
		 return severity;
	 }
	 String getpriority()
	 {
		 return  priority;
	 }
	 String assignedDeveloper()
	 {
		 return assignedDeveloper;
	 }
	 void assignToDeveloper(int bugid,String developerName) {
		 assignedDeveloper=developerName;
		 updatestatus("Assigned");
	 } 
	void updatestatus(String newstatus) {
		
         status=newstatus;		

	}
	void displayBugSummary() {
		System.out.println( getbugid());
		 System.out.println(getapplicationName());
		 System.out.println(getBugtitle());
		 System.out.println(getseverity());
		 System.out.println(getpriority());
		 System.out.println(assignedDeveloper());
		 assignToDeveloper(bugid,"Manasa");
	}
	
	
	public static void main(String[] args) {
		BugTracker b1=new BugTracker();
		b1.bugid=234;
		b1.applicationName="AMAZON SHOPPING";
		b1.Bugtitle="CHECKOUT";
		b1.severity="low";
		b1.priority="high";
		b1.status="Pending";
		b1.assignedDeveloper="not assigned";

	}

}
