public class PrimeNumbers {
    public static void main(String[] args) {
        int number=1;
        while(number<=100)
        {
            int factor=1,count=0;
            while(factor<=number)
            {
                if(number%factor==0)
                    count++;

                factor++;
            }
            if(count==2)
                System.out.println(number);
            number++;
        }
    }
}
