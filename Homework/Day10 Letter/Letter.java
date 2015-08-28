/**
 * Thie program will print a series of three similar letters.
 * Ryan Pun and Toby Jeung
 */
public class Letter
{
    public static void main(String[] args) {
        MomLetter();
        System.out.println();
        SisterLetter();
        System.out.println();
        FriendLetter();
    }
    public static void MomLetter() {
        Intro();
        MomBody();
        From();
    }
    public static void SisterLetter() {
        Intro();
        SisterBody();
        From();
    }
    public static void FriendLetter() {
        Intro();
        FriendBody();
        From();
    }
    public static void Intro() {
        System.out.println("Dear Person I Know,\n\tI'm writing to you from APCS. I'm learning so much about computers and coding and having a ton of fun!");
    }
    public static void MomBody() {
        System.out.println("Thanks for sending me here I've learned so much. I need money for class. Please send ASAP.");
    }
    public static void SisterBody() {
        System.out.println("Hope you're doing well. See you at home.");
    }
    public static void FriendBody() {
        System.out.println("How are you? I'm doing well. Let's get Mc Donalds later.");
    }
    public static void From() {
        System.out.println("\n\nFrom,\nRyan or Toby");
    }
}
