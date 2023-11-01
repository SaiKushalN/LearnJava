public class SearchNumber {
    public static void main(String[] args) {
        int numbersList[] = {34,67,81,97,45,54,90,83};
        int position=0,searchNumberOne=54,searchNumberTwo=40,searchNumberOnePosition=0;
        boolean foundOne=false,foundTwo=false;

        while(position<numbersList.length)
        {
            if(numbersList[position]==searchNumberOne)
            {
                foundOne=true;
                searchNumberOnePosition=position;
            }
            if(numbersList[position]==searchNumberTwo)
            {
                foundTwo=true;
            }
            position++;
        }
        System.out.println((foundOne)?(searchNumberOne+" is present at position: "+searchNumberOnePosition):(searchNumberOne+" is not present"));
        System.out.println((foundTwo)?(searchNumberTwo+" is present"):(searchNumberTwo+" is not present"));
    }
}
