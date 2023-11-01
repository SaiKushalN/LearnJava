/*
10. Given an array of integers, write a program to print all the number at even position
	input: {34, 67, 81, 97, 45, 54, 90, 83}
	output: 67 97 54 83
 */
public class EvenPositions {
    public static void main(String[] args) {
        int values[]={34, 67, 81, 97, 45, 54, 90, 83};
        int index=0;
        while (index< values.length)
        {
            if(index%2!=0)
                System.out.println(values[index]);
            index++;
        }
    }
}
