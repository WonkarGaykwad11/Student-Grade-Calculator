import java.util.Scanner;

class studentGradeCalculator{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to Student's Grade calculator");
        System.out.print("Enter the total number of subjects : ");
        // total subjects
        int noOfSubjects = inp.nextInt();
        String []subjects=new String[noOfSubjects];
        int [] Marks= new int[noOfSubjects];
        System.out.println("Enter the subject name along with their Marks");
        for(int i=0;i<noOfSubjects;i++)
        {
           System.out.print("Enter the subject :");
           String sub= inp.next(); 
           subjects[i] = sub;
           System.out.print("Enter the Obtained Marks :");
           int mark=inp.nextInt();
           Marks[i]=mark ;
           
        }
        float sum=0;
      for(int j=0;j<noOfSubjects;j++){
            sum += Marks[j];
        }
        
       float avg= sum/noOfSubjects;

     System.out.println("\n RESULT:-");
     System.out.println("Total  marks : " + sum + " out of " + (noOfSubjects*100));
     System.out.println("Total Percentage : " + avg + "%");
     System.out.print("Based upon the score obtained grade is:");
        if(avg>80)  System.out.println(" A");
        else if(avg>60)  System.out.println(" B");
        else if(avg>40)  System.out.println(" C");
        else if(avg>30)  System.out.println(" D");
        else  System.out.println(" F");
        inp.close(); 
    }
}