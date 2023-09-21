public class Main {
    public static void main(String[] args) {

        short result;
        String test = "Teststring_Einstufungstest";

        result = (short) myMult(21, 4);

        System.out.println("Result = " + result);
        System.out.println("Maxchar = " + findMaxChar(test));

        System.out.println("First string = " + replaceNthChar(test, 1, '0') );
        System.out.println("Second string = " + replaceNthChar(test, 3, '#') );
        System.out.println("Third string = " + replaceNthChar(test, 10, '-'));
        System.out.println("Fourth string = " + replaceNthChar(test, 30, 'X'));
        System.out.println("Fifth string = " + replaceNthChar("A", 1, '#'));

        printPattern(3, '*');
        printPattern(5, '+');
    }

    public static int myMult (int x, int y)
    {
        int result = 0;

        for (int i = 0; i < x; i++)
        {
            result += y;
        }

        return result;
    }

    public static char findMaxChar (String text)
    {
        char maxChar = text.charAt(0);

        for (int i = 1; i < text.length(); i++)
        {
            if ((int)maxChar < (int)text.charAt(i))
            {
                maxChar = text.charAt(i);
            }
        }

        return maxChar;
    }

    public static String replaceNthChar(String text, int n, char replaceChar)
    {
        String result = "" + text.charAt(0);

        for (int i = 1; i < text.length(); i++)
        {
            if (i%n == 0)
            {
                result += replaceChar;
            }
            else
            {
                result += text.charAt(i);
            }
        }

        return result;
    }

    public static void printPattern(int n, char character)
    {
        String output = "";
        String tabulation = "";

        for (int i = 0; i < n; i++)
        {
            output += character;
        }

        for (int i = 0; i < n; i++)
        {
            System.out.println(tabulation + output);
            output += character;
            tabulation += " ";
        }
    }

}