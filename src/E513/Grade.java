package E513;

public class Grade {
    private String letterGrade;

    public Grade(String letterGrade){
        this.letterGrade = letterGrade;
    }
    public double  getNumericGrade(){
        double number;

        if(letterGrade.equals("A+") || letterGrade.equals("A")) {
            number = 4.0;
        }
        else if (letterGrade.equals("B+") ) {
            number = 3.3;
        }
        else if (letterGrade.equals("B")) {
            number = 3.0;
        }
        else if (letterGrade.equals("B-")) {
            number = 2.7;
        }
        else if (letterGrade.equals("C+")) {
            number = 2.3;
        }
        else if (letterGrade.equals("C")) {
            number = 2;
        }
        else if (letterGrade.equals("C-")) {
            number = 1.7;
        }
        else if (letterGrade.equals("D+")) {
            number = 1.3;
        }
        else if (letterGrade.equals("D")) {
            number = 1;
        }
        else if (letterGrade.equals("D-")) {
            number = 0.7;
        }else if (letterGrade.equals("F")) {
            number = 0;
        }
        else{
            number = -1;
        }
        return number;
    }

}
