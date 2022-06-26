import java.util.Scanner;
public class WhileLoopPractice 
{
    public static void check_If_Number_Is_In_Range(int rangeStart, int rangeEnd)
    {
        while(true)
        {
            System.out.println("To terminate this loop please enter value an integer btween the range"+rangeStart+" - "+rangeEnd);
            Scanner reader= new Scanner (System.in);
            int number = reader.nextInt();
            if (number>=rangeStart && number<=rangeEnd)
            {
                System.out.println(number + " is in range"+rangeStart+" - "+rangeEnd);
                break;
            }
    }
}
    
    public static void check_If_Number_Is_In_Range(int number, int rangeStart, int rangeEnd)
    {
        while(number>=rangeStart && number<=rangeEnd)
        {
            System.out.println(number + " is in range: "+rangeStart+" - "+rangeEnd);
            return;
        }
        System.out.println(number + " is not in range: "+rangeStart+" - "+rangeEnd);

    }
}
