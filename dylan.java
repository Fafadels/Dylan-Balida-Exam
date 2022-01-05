import java.util.Scanner;

public class dylan {
    public static void main(String[] args) {
        Scanner fafa = new Scanner(System.in);
        System.out.print("Annual Salary: ");
        float dels = fafa.nextFloat();

        while(true){
            if(dels < 250000){

                float MontlyRate = dels / 12;
                float DailyRate = MontlyRate / 22;
                float HourlyRate = DailyRate / 8;
                Double AnnualTaxDeduction = 0.00;
                Double MonthlyTaxDeduction = 0.00;
                Double NetPay = MontlyRate - MonthlyTaxDeduction;
    
                System.out.println("Monthly Rate : " + String.format("%.2f", MontlyRate));
                System.out.println("Daily Rate : " + String.format("%.2f", DailyRate));
                System.out.println("Hourly Rate : " + String.format("%.2f", HourlyRate));
                System.out.println("Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
                System.out.println("Monthly Tax Deduction : " + String.format("%.2f", MonthlyTaxDeduction));
                System.out.println("Net Pay : " + String.format("%.2f", NetPay));
                break;
            }
            else if(dels >= 250000 && dels < 400000){
    
                Double tax_deduction = dels - 250000 * .20;
    
                float MontlyRate = dels / 12;
                float DailyRate = MontlyRate / 22;
                float HourlyRate = DailyRate / 8;
                Double AnnualTaxDeduction = tax_deduction;
                Double MonthlyTaxDeduction = AnnualTaxDeduction / 12;
                Double NetPay = MontlyRate - MonthlyTaxDeduction;
    
                System.out.println("Monthly Rate : " + String.format("%.2f", MontlyRate));
                System.out.println("Daily Rate : " + String.format("%.2f", DailyRate));
                System.out.println("Hourly Rate : " + String.format("%.2f", HourlyRate));
                System.out.println("Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
                System.out.println("Monthly Tax Deduction : " + String.format("%.2f", MonthlyTaxDeduction));
                System.out.println("Net Pay : " + String.format("%.2f", NetPay));
                break;
            }
            else if(dels >= 400000 && dels < 800000){
    
                float tax_excess = dels - 400000;
                Double tax_deduction = 0.25 * tax_excess + 30000;
    
                float MontlyRate = dels / 12;
                float DailyRate = MontlyRate / 22;
                float HourlyRate = DailyRate / 8;
                Double AnnualTaxDeduction = tax_deduction;
                Double MonthlyTaxDeduction = AnnualTaxDeduction / 12;
                Double NetPay = MontlyRate - MonthlyTaxDeduction;
    
                System.out.println("Monthly Rate : " + String.format("%.2f", MontlyRate));
                System.out.println("Daily Rate : " + String.format("%.2f", DailyRate));
                System.out.println("Hourly Rate : " + String.format("%.2f", HourlyRate));
                System.out.println("Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
                System.out.println("Monthly Tax Deduction : " + String.format("%.2f", MonthlyTaxDeduction));
                System.out.println("Net Pay : " + String.format("%.2f", NetPay));
                break;
            }
            else if(dels >= 800000 && dels < 2000000){
    
                float tax_excess = dels - 800000;
                Double tax_deduction = 0.30 * tax_excess + 130000;
    
                float MontlyRate = dels / 12;
                float DailyRate = MontlyRate / 22;
                float HourlyRate = DailyRate / 8;
                Double AnnualTaxDeduction = tax_deduction;
                Double MonthlyTaxDeduction = AnnualTaxDeduction / 12;
                Double NetPay = MontlyRate - MonthlyTaxDeduction;
    
                System.out.println("Monthly Rate : " + String.format("%.2f", MontlyRate));
                System.out.println("Daily Rate : " + String.format("%.2f", DailyRate));
                System.out.println("Hourly Rate : " + String.format("%.2f", HourlyRate));
                System.out.println("Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
                System.out.println("Monthly Tax Deduction : " + String.format("%.2f", MonthlyTaxDeduction));
                System.out.println("Net Pay : " + String.format("%.2f", NetPay));
                break;
            }
            else if(dels >= 2000000 && dels < 8000000){
    
                float tax_excess = dels - 2000000;
                Double tax_deduction = 0.32 * tax_excess + 490000;
    
                float MontlyRate = dels / 12;
                float DailyRate = MontlyRate / 22;
                float HourlyRate = DailyRate / 8;
                Double AnnualTaxDeduction = tax_deduction;
                Double MonthlyTaxDeduction = AnnualTaxDeduction / 12;
                Double NetPay = MontlyRate - MonthlyTaxDeduction;
    
                System.out.println("Monthly Rate : " + String.format("%.2f", MontlyRate));
                System.out.println("Daily Rate : " + String.format("%.2f", DailyRate));
                System.out.println("Hourly Rate : " + String.format("%.2f", HourlyRate));
                System.out.println("Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
                System.out.println("Monthly Tax Deduction : " + String.format("%.2f", MonthlyTaxDeduction));
                System.out.println("Net Pay : " + String.format("%.2f", NetPay));
                break;
            }
            else if(dels >= 8000000){
    
                float tax_excess = dels - 8000000;
                Double tax_deduction = 0.35 * tax_excess + 2410000;
    
                float MontlyRate = dels / 12;
                float DailyRate = MontlyRate / 22;
                float HourlyRate = DailyRate / 8;
                Double AnnualTaxDeduction = tax_deduction;
                Double MonthlyTaxDeduction = AnnualTaxDeduction / 12;
                Double NetPay = MontlyRate - MonthlyTaxDeduction;
    
                System.out.println("Monthly Rate : " + String.format("%.2f", MontlyRate));
                System.out.println("Daily Rate : " + String.format("%.2f", DailyRate));
                System.out.println("Hourly Rate : " + String.format("%.2f", HourlyRate));
                System.out.println("Annual Tax Deduction : " + String.format("%.2f", AnnualTaxDeduction));
                System.out.println("Monthly Tax Deduction : " + String.format("%.2f", MonthlyTaxDeduction));
                System.out.println("Net Pay : " + String.format("%.2f", NetPay));
                break;
            }
        }
        }
}
