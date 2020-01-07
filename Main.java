import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        String s1,s2,s3;
        s1 = "cat";
        s2 = "dog";
        s3 = "llama";
        System.out.println("please enter one word and if it match in our collecton we will display it");
        String input = keyboard.nextLine();
        if((input.equalsIgnoreCase(s1)||(input.equalsIgnoreCase(s2)||input.equalsIgnoreCase(s3))))
        {
            System.out.println("word is matched: " + input);

        }
        else
            System.out.println("sorry we dont have this word");


    }
}
