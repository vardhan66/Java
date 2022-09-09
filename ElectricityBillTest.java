import java.util.Scanner;//Scanner class is imported to take the manual input.
class Electricitybill
{
	public static void main(String args[])
	{
		int t;//variable of type integer
		String cno,cname;//variables of type String
		double nu,b,b1,pmr,cmr;// variables defined of type double 
		Scanner s =new Scanner(System.in);//object s is created from Scanner class and 'System.in' is used recive input from the user 
		System.out.println("Enter consumer number");
		cno=s.nextLine();//input is stored in cno
		System.out.println("Enter consumer name");
		cname=s.nextLine();//input is stoired in cname
		System.out.println("Enter previous month reading:");
		pmr=s.nextDouble();//input is stored in pmr
		System.out.println("Enter current month reading:");
		cmr=s.nextDouble();//input is stored in cmr
		if (pmr>cmr)
			nu=cmr;
		else
			nu=cmr-pmr;
		System.out.println("Choose opur EB type \n 1.Domestic \n 2.Commercial");
		t=s.nextInt();//choice of the user is assignerd to t
		EBl e=new EBl();//object creation from classs EBl
		b=e.Domestic(nu);//passed parameter is stored in the variable
		b1=e.Commercial(nu);//passed parameter is stored in variable
		System.out.println("Consumer number"+cno);// prints the consumer number
		System.out.println("Consumer name"+cname);//prints the consumer name
		if (t==1)
		{
			System.out.println("Electricity Bill is Rs."+b);//Bill is displayed for domestic type
		}
		else if(t==2)
			System.out.println("Electricity Bill is Rs."+b1);//Bill is displayed for commercial type

	}//end of main method
}//end of class
