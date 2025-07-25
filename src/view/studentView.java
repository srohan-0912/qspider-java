package view;
import control.studentController1;
import control.studentController2;

public class studentView {
public static void main(String[] args) {
	studentController1 s=new studentController2();
	s.addStudent();
	System.out.println();
	s.countStudent();
	System.out.println();
	s.displayStudent();
	System.out.println();
	s.removeStudent();
	System.out.println();
	s.searchStudent();
	System.out.println();
	s.displayStudent();
	
}
}
