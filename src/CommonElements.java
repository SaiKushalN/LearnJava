/*
21. Write a program to print the common elements in two arrays
	input:
			array1 = {1,3,6,2}
			array2 = {3,1,5,4}
	output:
			array = {1,3}
 */
public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1,3,6,2}, arr2 = {3,1,5,4};
        int positionArr1=0;
        while(positionArr1 < arr1.length)
        {
            int positionArr2=0;
            while (positionArr2 < arr2.length)
            {
                if(arr1[positionArr1] == arr2[positionArr2])
                    System.out.println(arr1[positionArr1]);
                positionArr2++;
            }
            positionArr1++;
        }
    }
}
