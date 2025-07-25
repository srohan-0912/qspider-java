package control;
import java.util.*;

import model.student;
public  class studentController2 implements studentController1{
	
	LinkedHashMap<Integer,student> map=new LinkedHashMap<Integer,student>();
	Scanner sc=new Scanner(System.in);
	
	     @Override
	    public void addStudent() {
	    	System.out.println("Adding the student:");
	    	System.out.println("Enter the student name:");
	    	String name=sc.next();
	    	System.out.println("Enter the age");
	    	int age=sc.nextInt();
	    	System.out.println("");
	    	
	    }
	     @Override
	    public void displayStudent() {
	   
	    
	    }
	     @Override
	    public void countStudent() {
	   
	    }
	     @Override
	    public void removeStudent() {
	 
	    
	    }
	     @Override
	    public void searchStudent() {
	 
	    
	    }
	     @Override
	    public void sortStudent() {
	   
	    
	    }@Override
	    public void updateStudentMarks() {
	   
	    
	    }
	
}
