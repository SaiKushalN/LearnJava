import java.util.Scanner;

/*
16. write a program to find out whether a number is ARMSTRONG NUMBER
123  = (1*1*1) + (2*2*2) + (3*3*3)
153 = (1*1*1) + (5*5*5) + (3*3*3)  = 1 + 125 + 27 = 153

17. Write a program to find the sum of digits of a number
	input: 4356
	output: 4+3+5+6 = 18

19. Write a program to reverse a number
input: 1234
output: 4321
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int givenNumber = scanner.nextInt();
        scanner.close();

        int sum=0,qut=0,currentValue=givenNumber,newSum=0,reverseSum=0;

        while(currentValue!=0)
        {
            qut = currentValue%10;
            sum = sum + (qut*qut*qut);
            newSum=newSum+qut;
            reverseSum = reverseSum*10+qut;
            currentValue = currentValue/10;
        }
        System.out.println((sum == givenNumber) ? "Given number is an Armstrong Number":"Given Number is not an Armstrong Number");
        System.out.println("Sum of given number is "+newSum);
        System.out.println("Reverse of given number is "+reverseSum);
    }
}
