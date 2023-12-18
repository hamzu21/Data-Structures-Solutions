import java.util.Scanner;
class BinarySearch
{
public static void main ( String args[])
{

Scanner sc = new Scanner(System.in);
int arr[] ={23,34,45,57,67,89};
System.out.println("Enter a number:");
int num = sc.nextInt();
int start = 0;
int front = -1;
int end = arr.length;
while(start<= end)
{
	int mid = (start + end)/2;
	if (arr[mid] == num)
	{
		front=mid;
	break;
}
else if (arr[mid]<num)
{
	start = mid + 1;
}
else
{
	end = mid - 1;
}
}
if (front != -1)
{
	System.out.println("Value found in the index of " + front);
}
else
{
	System.out.println("Value not found");
}
}
}