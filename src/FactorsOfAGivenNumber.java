// 11. Write a program to print all the factors of a given number
// 12. Write a program to find whether a given number is PRIME or NOT

import java.util.Scanner;
public class FactorsOfAGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int givenNumber = scanner.nextInt();
        scanner.close();
        int factor=1,count=0;

        while(factor <= givenNumber)
        {
            if(givenNumber%factor==0) {
                count++;
                System.out.println(factor);
            }
            factor++;
        }
        System.out.println(givenNumber + ((count==2)?(" is prime"):(" is not prime")));
    }
}
