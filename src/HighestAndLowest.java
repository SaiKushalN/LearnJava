public class HighestAndLowest {
    public static void main(String[] args) {
        int values[] = {1,15,-1,23,45,70,99,-13,-5};
        int highest =values[0],lowest=values[0],position=0;

        while(position!=values.length)
        {
            if(values[position]>highest)
            {
                highest = values[position];
            }
            if(values[position]<lowest)
            {
                lowest = values[position];
            }
            position++;
        }
        System.out.println("highest: "+highest+" Lowest: "+lowest);
        System.out.println("Difference between highest and lowest is: "+(highest-lowest));
    }
}
