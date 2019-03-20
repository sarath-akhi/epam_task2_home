import java.util .*;
class House
{
    public static void main (String[] args)
{
    double area,cost;
    String s;
    Scanner sc=new Scanner (System. in);
    System.out.println("Enter the area of house:");
    area=sc.nextDouble();
    System. out. println("Enter the material standard:");
    s=sc.next();
    switch(s)
        {
            case "standard":
            	 cost=area*1200;
                break;
            case "abovestandard":
            	cost=1500*area;
                break;
            case "highstandard":
            	cost=1800*area;
                break;
            case "highstandard-fully-automatedhome":
            	cost=2500*area;
                break;
            default:
                System.out.printf("check the material standard correctly");
                return;
        }
    System.out.println(s+"cost:"+cost);
    
   }
}