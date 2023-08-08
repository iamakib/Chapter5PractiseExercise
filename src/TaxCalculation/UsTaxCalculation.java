package TaxCalculation;

import Constants.Constants;

public class UsTaxCalculation {
    private int status;
    private double income;

    public UsTaxCalculation(double income,int status){
        this.income = income;
        this.status = status;
    }
    public double getTax(){

        double tax1 = 0;
        double tax2 = 0;

        if(status == Constants.SINGLE){
            if(income <= Constants.RATE1_SINGLE_LIMIT){
                tax1 = income * Constants.RATE1;
            }
            else{
                tax1 = Constants.RATE1 * Constants.RATE1_SINGLE_LIMIT;
                tax2 = Constants.RATE2 * (income - Constants.RATE1_SINGLE_LIMIT);
            }
        }
        else{
            if(income <= Constants.RATE1_MARRIED_LIMIT){
                tax1 = income * Constants.RATE1;
            }
            else{
                tax1 = Constants.RATE1 * Constants.RATE1_MARRIED_LIMIT;
                tax2 = Constants.RATE2 * (income - Constants.RATE1_MARRIED_LIMIT);
            }
        }

        return tax1 + tax2;
    }
}
