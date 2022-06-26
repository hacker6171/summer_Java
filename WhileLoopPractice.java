public class WhileLoopPractice 
{
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
