package ArrayLearning;

public class ArrayUserDefined {
      public static void main(String args[])
      {
    	  Student[] students = new Student[10];
    	  for (int i= 0;i<10;i++)
    	  {
    		  students[i] = new Student();
    		  students[i].rollNumber = 100+i;
    		  students[i].name = "Student" + i; 
    		  students[i].address = "Address" + i; 
    		  students[i].email = "E-mail" + i; 
    		  students[i].mobile = "Mobile" + i; 
    	  } 
    	  for( int i=0;i<10;i++) 
    	  {
    		  System.out.println("Roll Number:"+ students[i].rollNumber + " Name:" + students[i].name + " E-mail:" +students[i].email + " Address:" + students[i].address );
    	  }
    		  
      }
}
