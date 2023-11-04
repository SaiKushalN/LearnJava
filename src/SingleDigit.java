import java.util.Scanner;

/*
18. Write a program to add the digits of the number until it is a single digit
	input: 765
	output: 7+6+5 = 18
			18 is not a single digit
			1+8 = 9
			9 is single digit, so final output should be 9

22. Write a program to calculate the power of a number
 */

public class SingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int givenNumber = scanner.nextInt();
        scanner.close();

        int sum=0,rem=0,power=givenNumber*givenNumber;

        while(givenNumber!=0)
        {
            rem = givenNumber%10;
            sum = sum + rem;
            givenNumber = givenNumber/10;
            if(givenNumber==0 && sum/10==0)
                break;
            else if (givenNumber==0) {
                givenNumber=sum;
                sum=0;
            }
            else
                continue;
        }
        System.out.println("Final sum = "+sum);
        System.out.println("Power of givenNumber is "+power);
    }
}
