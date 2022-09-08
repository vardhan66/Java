import java.util.*;
class EBl
{
			double Domestic(double a)
			{
		 		if (a<=100)
					return a*1;
		 		else if (a<=200)
					return 100+(a-100)*2.50;
		 		else if (a<=500)
					return 100+250+(a-200)*4;
		 		else
					return 100+250+800+(a-500)*6;
			}
			double Commercial(double a)
			{
		 		if (a<=100)
					return a*2;
		 		else if (a<=200)
					return 200+(a-100)*4.50;
				else if (a<=500)
					return 200+900+(a-200)*6;
		 		else
					return 200+900+(a-500)*7;
			}
}