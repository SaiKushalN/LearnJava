/*
15. Write a program to generate a fibonacci series
1,2,3,5,8,13,21,34,55,89.........
 */
public class FibSeries {
    public static void main(String[] args) {
        int firstNumber=1,secondNumber=2,currentNumber=0;
        while(firstNumber<100)
        {
            System.out.println(firstNumber);
            currentNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=currentNumber;
        }
    }
}
