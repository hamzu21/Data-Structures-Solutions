import java.util.Scanner;

public class GradeCalculator 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter assignment score(out of 100): ");
        double assignmentScore = scanner.nextDouble();

        System.out.println("Enter midterm score(out of 100): ");
        double midtermScore = scanner.nextDouble();

        System.out.println("Enter final score(out of 100): ");
        double finalScore = scanner.nextDouble();

        double finalGrade = (assignmentScore * 0.25) + (midtermScore * 0.25) + (finalScore * 0.5);
     

        if (finalGrade >= 90)
			{
           System.out.println("The Grade is A");
        }
		else if (finalGrade >= 80) 
		{
           System.out.println("The Grade is B");
        } 
		else if (finalGrade >= 70)
			{
            System.out.println("The Grade is C");
        } 
		else if (finalGrade >= 60) 
		{
            System.out.println("The Grade is D");
        } 
		else 
		{
           System.out.println("The Grade is F");
        }

        
       
    }
}
