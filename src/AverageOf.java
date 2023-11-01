public class AverageOf {
    public static void main(String[] args) {
        int values[] = {1,2,3,4,5,6};
        int index=0;
        float sum=0,average=0;
        while(index< values.length)
        {
            sum=sum+values[index];
            index++;
        }
        average=sum/(values.length);
        System.out.println("Average is "+average);
    }
}
