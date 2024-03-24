import java.util.*;//for scanner class to take input from keyboard
 public class gradesofmarks
{
    public static void main(String args[])//main method
    {
        int mar1,mar2,mar3,mar4,mar5;//declaring variables for 5 subject marks
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects");
        System.out.println("Marks in English");
        mar1=sc.nextInt();
        System.out.println("Marks in Maths");
        mar2=sc.nextInt();
        System.out.println("Marks in Science");
        mar3=sc.nextInt();
        System.out.println("Marks in Hindi");
        mar4=sc.nextInt();
        System.out.println("Marks in Social");
        mar5=sc.nextInt();
        int total=mar1+mar2+mar3+mar4+mar5;
        System.out.println("Total marks:"+total+"/500");
      float Average=(total)/5;
      System.out.println("The Average marks:"+Average);

        if(Average>=70)
        {
            System.out.println("Grade:A");
        }
        else if(Average>=60&&Average<70)
        {
             System.out.println("Grade:B");

        }
        else if(Average>=50&&Average<60)
        {
           System.out.println("Grade:C");
        }
        else if(Average>=40&&Average<50)
        {
           System.out.println("Grade:D");
        }
        else
        System.out.println("Fail");
    }
}