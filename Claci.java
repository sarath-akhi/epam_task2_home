import java.util.Scanner;
public class Claci{
public static void main(String[] args)
{
double ans;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first oparand:");
  double num1=sc.nextDouble();
  System.out.println("Enter second oparand:");
  double num2=sc.nextDouble();
  System.out.println("Enter oparator:");
  char op=sc.next().charAt(0);
  switch(op)
        {
            case '+':
            	 ans=num1+num2;
                break;
            case '-':
            	ans=num1-num2;
                break;
            case '*':
            	ans=num1*num2;
                break;
            case '/':
            	ans=num1/num2;
                break;
            default:
                System.out.printf("error check again");
                return;
        }

        System.out.println(num1+" "+op+" "+num2+": "+ans);
    }
}