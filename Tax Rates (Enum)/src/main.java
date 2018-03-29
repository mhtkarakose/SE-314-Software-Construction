import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter monthly salary");
		int input = reader.nextInt();
		assert(input>=0);

		System.out.println("Your yearly tax : " + calculateYearlyTax(input*12));

	}
	
	private static int calculateYearlyTax(int yearlySalary) {
		int result;
		
		if(yearlySalary <= SalaryType.YEARLYSALARYTOTAL11000) 
		{
			return yearlySalary*(SalaryType.TAXRATEFOR11000);
		}
		else if(yearlySalary > SalaryType.YEARLYSALARYTOTAL11000 && yearlySalary <= SalaryType.YEARLYSALARYTOTAL27000)
		{
			result =  (yearlySalary - SalaryType.YEARLYSALARYTOTAL11000);
			return SalaryType.TAXFOR27000 + (result*(SalaryType.TAXRATEFOR27000));
		}
		else if(yearlySalary > SalaryType.YEARLYSALARYTOTAL27000 && yearlySalary <= SalaryType.YEARLYSALARYTOTAL97000) {

			result =  (yearlySalary - SalaryType.YEARLYSALARYTOTAL27000);
			return SalaryType.TAXFOR97000 + (result*(SalaryType.TAXRATEFOR97000));
		}
		else if(yearlySalary > SalaryType.YEARLYSALARYTOTAL97000 ) {

			result =  (yearlySalary - SalaryType.YEARLYSALARYTOTAL97000);
			return SalaryType.TAXFORMORE97000 + (result*(SalaryType.TAXRATEFORMORETHAN97000));
		}else {
			return 0;
		}
	}

}
