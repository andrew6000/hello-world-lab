import java.util.Scanner;

public class Hello {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); // This is a comment
        String name;
        String age;
        String thePlaceWhereYouLive;
        System.out.print("Hello. What is your name? ");
        name = scanner.next();
        System.out.print("It's nice to meet you, " + name + ". How old are you? ");
        age = scanner.next();
        System.out.println("I see that you are still quite young at only " + age + ".");
        System.out.print("Where do you live? ");
        thePlaceWhereYouLive = scanner.next();
        System.out.print("Wow! I've always wanted to go to " + thePlaceWhereYouLive + ". Thanks for chatting with me. Bye!");

    }
}
