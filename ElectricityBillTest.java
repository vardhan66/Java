import java.util.Scanner;
class Electricitybill
{
	public static void main(String args[])
	{
		int t;
		String cno,cname;
		double nu,b,b1,pmr,cmr;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter consumer number");
		cno=s.nextLine();
		System.out.println("Enter consumer name");
		cname=s.nextLine();
		System.out.println("Enter previous month reading:");
		pmr=s.nextDouble();
		System.out.println("Enter current month reading:");
		cmr=s.nextDouble();
		if (pmr>cmr)
			nu=cmr;
		else
			nu=cmr-pmr;
		System.out.println("Choose ypur EB type \n 1.Domestic \n 2.Commercial");
		t=s.nextInt();
		EBl e=new EBl();
		b=e.Domestic(nu);
		b1=e.Commercial(nu);
		System.out.println("Consumer number"+cno);
		System.out.println("Consumer name"+cname);
		if (t==1)
		{
			System.out.println("Electricity Bill is Rs."+b"/-");
		}
		else if(t==2)
			System.out.println("Electricity Bill is Rs."+b1"/-");

	}
}
