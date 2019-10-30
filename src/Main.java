import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        double number1 = input.nextDouble();
        System.out.println("Enter b:");
        double number2 = input.nextDouble();
        System.out.println("Enter c:");
        double number3 = input.nextDouble();

        Test result = new Test(number1, number2, number3 );
        System.out.println(result.display());

        if( result.getDelta()<0) {
            System.out.println("Phương trình vô nghiệm");
        } else if(result.getDelta()>0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt là: " + "x1= " + result.root1() + " x2= " + result.root2());
        } else if(result.getDelta()==0) {
            System.out.println("PT có nghiệm kép x1,x2= " + result.root3() );
        }

    }

}
