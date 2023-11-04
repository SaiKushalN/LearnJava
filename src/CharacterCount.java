/*
23. Write a program to count the vowels in a given string
	input: string = "FullStack Programming"
	output: Vowel Count: 5
 */
public class CharacterCount {
    public static void main(String[] args) {
//        String[] vowels = {"a","e","i","o","u"};
        String vowels = "aeiou";
        String givenString = "FullStack Programming";
        int position=0,count=0;
        while(position<givenString.length())
        {
//            Can we do this way?
//            and if we use "in" keyword in while loop, will it be n square complexity?
//            if (givenString[position].toLowerCase() in vowels)
//                count++;

            char currentChar = Character.toLowerCase(givenString.charAt(position));
            if (vowels.indexOf(currentChar) != -1) {
                count++;
            }
            position++;
        }
        System.out.println("Vowel Count "+count);
    }
}
