public class ReverseOrder {
    public static void main(String[] args) {
        int values[] = {12,64,23,35,2,67,9,11};
        int newValues[] = new int[values.length];
        int position=values.length-1;
        int newPosition=0;

        while (position >= 0)
        {
            newValues[newPosition]=values[position];
            position--;
            newPosition++;
        }
        int index=0;
        while (index<newValues.length)
        {
            System.out.println(newValues[index]);
            index++;
        }
    }
}
