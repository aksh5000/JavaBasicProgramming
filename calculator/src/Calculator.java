public class Calculator {

        public double num1;
        public double num2;
//    Calculator(double num1,double num2){
//        this.num1=num1;
//        this.num2=num2;
//    }

     double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }

    double subtract(double num1, double num2){
        double sub = num1 - num2;
        return sub;
    }

    double multiply(double num1, double num2){
        double product = num1 * num2;
        return product;
    }

    double divide(double num1, double num2){
        double div = num1 / num2;
        return div;
    }
}
