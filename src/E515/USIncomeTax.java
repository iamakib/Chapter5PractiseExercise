package E515;

public class USIncomeTax {
    public static final double TAX_UPTO_50000 = 50000 * 0.01;
    public static final double TAX_UPTO_75000 = 25000 * 0.02 + TAX_UPTO_50000;
    public static final double TAX_UPTO_100000 = 25000 * 0.03 + TAX_UPTO_75000;
    public static final double TAX_UPTO_250000 = 150000 * 0.04 + TAX_UPTO_100000;
    public static final double TAX_UPTO_500000 = 250000 * 0.05 + TAX_UPTO_250000;
    private int income;
    private double tax;

    public USIncomeTax(int income){
        this.income = income;
    }
    public double getTax(){

        if(income > 500000){
            tax = (income - 500000) * 0.06 + TAX_UPTO_500000;
        }
        else if(income > 250000 && income <= 500000 ){
            tax = (income - 250000) * 0.05 + TAX_UPTO_250000;
        }
        else if(income > 100000 && income <= 250000){
            tax = (income - 100000) * 0.04 + TAX_UPTO_100000;
        }
        else if(income > 75000 && income <= 100000){
            tax = (income - 75000) * 0.03 + TAX_UPTO_75000;
        }
        else if(income > 50000 && income <= 750000){
            tax = (income - 50000) * 0.02 + TAX_UPTO_50000;
        }
        else{
            tax = income * 0.01;
        }
        return tax;

    }
}
