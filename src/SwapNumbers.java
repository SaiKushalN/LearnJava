/*

14. Write a program to swap two numbers
	a =10 and b =20
	a =20 and b =10
 */
public class SwapNumbers {
    public static void main(String[] args) {
        int a=10,b=20,swap=0;
        swap=a;
        a=b;
        b=swap;
        System.out.println("a = "+a+" b = "+b);
    }
}
