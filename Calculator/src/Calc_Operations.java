import java.util.Scanner;

class Calc_Operations
{
	public static void main(String a[])
	{
		int num1=0,num2=0,choice,res;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice from the following menu:");
			System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
			choice = sc.nextInt();
			if(choice!=5){
				System.out.println("Enter the first number");
				num1=sc.nextInt();
				System.out.println("Enter the second number");
				num2=sc.nextInt();
			}
			else
				break;
			switch(choice)
			{
				case 1:System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
					break;
				case 2:System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
					break;
				case 3:System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
					break;
				case 4:	if(num2==0)
						System.out.println("In Division denominator cannot be 0!");
					else{
					System.out.println("In division of "+num1+" by "+num2+" quotient is "+(num1/num2));} 
					break;
				case 5: break;
				default: System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue?1.Yes 2.No");
			res=sc.nextInt();
		}while(res==1);
	}
}