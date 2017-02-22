package retirement;
import java.util.Scanner;

public class Retirement {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many years do you plan to work?");
		int WorkingYears = sc.nextInt();
		System.out.println("What percentage is your annual expected return on investment while working?");
		double WorkingReturn = sc.nextDouble();
		System.out.println("What percentage is your annual expected return on investment while retired?");
		double RetiredReturn = sc.nextDouble();
		System.out.println("How many years do you plan to draw money?");
		int DrawYears = sc.nextInt();
		System.out.println("What's your required income?");
		double RequiredIncome = sc.nextDouble();
		System.out.println("What's your expected Social Security Income?");
		double SSI = sc.nextDouble();
		sc.close();
		double MonthlyDraw = RequiredIncome - SSI;
		double MonthlyInterest = RetiredReturn/1200;
		double WorkingInterest = WorkingReturn/1200;
		double TotalSaved = (MonthlyDraw*(1-(1/Math.pow(1+MonthlyInterest,DrawYears*12))))/MonthlyInterest;
		double MonthlySavings = TotalSaved /
			(((Math.pow((1 + WorkingInterest),WorkingYears*12)-1)/WorkingInterest));
		System.out.print(String.format("You need to have $%.2f saved to receive \n",
			Math.round(TotalSaved * 100) / 100.0));
		System.out.print(String.format("$%.2f each month." ,Math.round(MonthlySavings * 100) / 100.0));
	}
	
	//private double getMontlyDraw(int reqInc, int ssi){
		//return reqInc - ssi;
	//}
}