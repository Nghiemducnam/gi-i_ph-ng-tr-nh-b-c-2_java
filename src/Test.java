public class Test {
    double number1,number2,number3;
   // double root1, root2;

    public Test(double number1, double number2, double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
    public double getNumber1() {
        return this.number1;
    }
    public double getNumber2(){
        return this.number2;
    }
    public double getNumber3(){
        return this.number3;
    }
    public double getDelta(){
        return Math.pow(number2,2)-4*(number1*number3);
    }

    public double root1() {
        return (-number2 + Math.sqrt(getDelta()))/(2*number1);
    }
    public double root2() {
        return (-number2 - Math.sqrt(getDelta()))/(2*number1);
    }
    public double root3() {
        return -number2/(2*number1);
    }
    public String display() {
        return "Bạn vừa nhập: a,b,c lần lượt là" + this.getNumber1() + this.getNumber2() + this.getNumber3();
    }
}
