package E522;

public class PayCheck {
    private String name;
    private double hours,hourlyWage;

    public PayCheck(String name, double hours, double hourlyWage){
       this.name = name;
       this.hours = hours;
       this.hourlyWage = hourlyWage;
    }

    public double getPayment(){
        double payment;
        if(hours > 40){
            payment = (hours - 40) * hourlyWage * 1.5 + 40 * hourlyWage;
        }
        else{
            payment = hours * hourlyWage;
        }
        return payment;
    }
    public void printPayCheck(){
        System.out.println("Paycheck for : " + name);
        System.out.println("Total pay = $" + getPayment());
    }
}
