/*
20 .Write a program to add to numbers into a single array
	input: array1 = {1,3,5)
			array2 = {2,4,7,9}
	output: finalArray = {1,3,5,2,4,7,9}
 */
public class ArrayConcat {
    public static void main(String[] args) {
        int[] array1 = {1,3,5}, array2 = {2,4,7,9};
        int[] combinedArray = new int[array1.length+array2.length];
        int positionOne=0,positionTwo=0,combinedPosition=0;
        while(combinedPosition < combinedArray.length)
        {
            // can it be better?
            // combinedArray[combinedPosition]=(position < array1.length) ? array1[position]:array2[position];
            if(combinedPosition<array1.length)
            {
                combinedArray[combinedPosition] = array1[positionOne];
                positionOne++;
            }
            else
            {
                combinedArray[combinedPosition] = array2[positionTwo];
                positionTwo++;
            }
            combinedPosition++;
        }
        combinedPosition = 0;
        while(combinedPosition < combinedArray.length)
        {
            System.out.print(combinedArray[combinedPosition]+" ");
            combinedPosition++;
        }
    }
}
