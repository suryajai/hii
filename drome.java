
public class drome {
	public static void main(String[] args) {

        int num = 29, reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;
        while( num != 0 )
        {
            remainder = num % 20;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 20;
        }
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}
	


