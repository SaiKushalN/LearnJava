/*
9. Write a program to find the number of digits in a given integer
	input: 4536
	output: 4
 */
public class NoOfDigits {
    public static void main(String[] args) {
        int value = 4536,count=0;
        while (value!=0)
        {
            value = value/10;
            count++;
        }
        System.out.println(count);
    }
}
