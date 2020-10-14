import java.util.ArrayList;

class Main {

    public static void main(String[] args) {  

      Student student1 = new Student();  

    student1.setName("Arnold Spielberg");    
    student1.setGPA(4.0);    
    student1.setMajor("Electrical Engineering");
    student1.print();

    System.out.println();


    
  
  
     //System.out.println("The student's name is " + student1.getName());
     //System.out.println("The student's GPA is " + student1.getGPA());
     //System.out.println("The student's major is " + student1.getMajor());

Student student2 = new Student(); 

    student2.setName("Damandeep Kaur");    
    student2.setGPA(4.3);    
    student2.setMajor("Information Systems");
    student2.print();

    System.out.println();

  


   // System.out.println("The student's name is " + student2.getName());
    //System.out.println("The student's GPA is " + student2.getGPA());
    //System.out.println("The student's major is " + student2.getMajor());

double sum;
sum = 0;

ArrayList<Double> gpas = new ArrayList<Double>();

    gpas.add(student1.getGPA());
    gpas.add(student2.getGPA());

    for(int i=0; i<gpas.size();i++)
    {sum+=gpas.get(i);}



   


    System.out.println("The average GPA is :" + (sum/gpas.size()));


    

    }
}
