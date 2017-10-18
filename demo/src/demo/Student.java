package demo;

public class Student {
	
	    int rollno;
		String name;
		int marks1;
		int marks2 ;
		int marks3 ;
		
		public Student(){
			System.out.println("This is a Default Constructor");
			name = "Abirami Mahendran";
			rollno = 123445;
			marks1 = 90;
			marks2 = 30;
			marks3 = 50;
			
		}
		public Student(int i){
			rollno = i;
			System.out.println("Constructor with rollno called");
			
		}
					
		
		public Student(String myname,int myrollno, int j, int k,int l){
			name = myname;
			rollno = myrollno;
			marks1 = j;
			marks2 = k;
			marks3 = l;
			System.out.println("Constructor with name,rollno, marks1,marks2,marks3 called");
		}
		
		public void show(){
			System.out.println("My rollno is "+rollno);
			System.out.println("My name is "+name);
			System.out.println("My marks1 is "+marks1);
			System.out.println("My marks2 is "+marks2);
			System.out.println("My marks3 is "+marks3);
		
		}
		public void MarksValidation(int x, int y, int z){
			int marks1 = x;
			int marks2 = y;
			int marks3 = z;
			int marks = 40;
			if(marks1 < 40){
				System.out.println("marks1 is "+marks);
				
			}else {System.out.println("marks1 is "+marks1);
				
			}
			if(marks2 < 40){
				System.out.println("marks2 is "+marks);
				
			}else {System.out.println("marks2 is "+marks2);
				
			}
			if(marks3 < 40){
				System.out.println("marks3 is "+marks);
				
			}else {System.out.println("marks3 is "+marks3);
				
			}
			
		}
				
		}
		
		
		
		


