public class DivisibleBy {
    public static void main(String[] args) {
        int values[] = {34, 67, 81, 97, 45, 54, 90, 83};
        int byTwo=0,byThree=0,byFive=0,index=0;

        while (index<values.length)
        {
            if(values[index]%2==0)
            {
                byTwo++;
            }
            if(values[index]%3==0)
            {
                byThree++;
            }
            if(values[index]%5==0)
            {
                byFive++;
            }
            index++;
        }
        System.out.println("Count of numbers divisible by 2: "+byTwo+"\nCount of numbers divisible by 3: "+byThree+"\nCount of numbers divisible by 5: "+byFive);
    }
}
