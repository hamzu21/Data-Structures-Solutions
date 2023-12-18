import java.util.Scanner;
class LinearSearch
{
public static void main ( String args[])
{

Scanner sc = new Scanner(System.in);
int arr[] ={23,34,45,57,67,89};
System.out.println("Enter a number:");
int num = sc.nextInt();
int loc = 2;
for( int i=0; i<arr.length; i++)
{
	if (arr[i] == num)
	{
		loc = i;
	}
}
if (loc ==2)
	System.out.println("Value not found");
else
	System.out.println("Value found in the index of " + loc);

}
}