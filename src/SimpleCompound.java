/*
24. Write a program to find the simple interest
25. Write a program to find the compound interest
 */
public class SimpleCompound {
    public static void main(String[] args) {
        int principle = 10000, rate = 5, time = 3, currentYear=0, interest=0;
        System.out.println("Simple Interest is "+(principle*time*rate)/100);
        //Without formula
        while(currentYear<time)
        {
            interest = interest + (principle*rate)/100;
            principle = principle+interest;
            currentYear++;
        }
        System.out.println("Compound Interest is "+interest);
    }
}
