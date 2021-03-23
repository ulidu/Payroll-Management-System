import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PayrollEmpNetSalary {

	
	public String empId(String empId) {
		
		return empId;
	}
	
	
	public double ETFAmount(double basicSalary, double ETFRate) {
		
		double ETFAmount = basicSalary * ETFRate;
		
		return ETFAmount;
		
	}
	
	public double OTAmount(double basicSalary, double oTRate, float noHours) {
		
		double OTAmount = basicSalary * oTRate * noHours;
		
		return OTAmount;
	}
	
	public double EmpGrossSalary(double basicSalary,double ETFAmount, double OTAmount) {
		
		double grossEmpSalary = (basicSalary + ETFAmount+OTAmount);
		
		return grossEmpSalary;
	}
	
	
		double EPFAmount;

	public double EPF(double basicSalary, String gender, Date joinDate, double less3YearsRate, double over3YearsRate) {
		
		@SuppressWarnings("unused")
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentdate = new Date();
        
        // Convert Date to Calendar
        Calendar c = Calendar.getInstance();
        c.setTime(joinDate);

        // Perform addition
        c.add(Calendar.YEAR, 3);
       
        // Convert calendar back to Date
        Date joinedDateAdd3 = c.getTime();

		if(gender == "female") {
			
			if (currentdate.after(joinedDateAdd3)) {

				// Female - More than 3 Years
				EPFAmount = basicSalary * over3YearsRate;
				
			}else{

				// Female - Less than 3 Years
				EPFAmount = basicSalary * less3YearsRate;

			}
			
		}else if(gender == "male") {
			
			EPFAmount = basicSalary * over3YearsRate;
			
		}
		
		return EPFAmount;
	
	}
	
	
	public double netEmpSalary(double grossEmpSalary, double EPF) {
		
		double netEmpSalary = grossEmpSalary - EPF;
		
		return netEmpSalary;
	}
	
}
