public class ThereWasAnOldLady {
    public static void main(String[] args) {
        Verse1();
        Verse2();
        Verse3();
        Verse4();
        Verse5();
    }
/**
  * Verse Definitions
  */
    public static void Verse1() {
        System.out.println("There was an old lady who swallowed a fly");
        Fly();
    }
        public static void Verse2() {
        System.out.println("There was an old lady who swallowed a spider");
        System.out.println("That wriggled and wiggled and tiggled inside her");
        Spider();        
    }
    public static void Verse3() {
        System.out.println("There was an old lady who swallowed a bird");
        System.out.println("How absurd to swallow a bird");
        Bird();
    }
    public static void Verse4() {
        System.out.println("There was an old lady who swallowed a cat");
        System.out.println("Fancy that to swallow a cat");
        Cat();
    }
    public static void Verse5() {
        System.out.println("There was an old lady who swallowed a dog");
        System.out.println("What a hog, to swallow a dog");
        Dog();
    }
/**
  * Animal Definitions
  */
    public static void Fly() {
        System.out.println("I don't know why she swalled a fly - perhaps she'll die!");
    }
    public static void Spider() {
        System.out.println("She swallowed the spider to catch the fly");
        Fly();
    }
    public static void Bird() {
        System.out.println("She swallowed the bird to catch the spider");
        Spider();
    }
    public static void Cat() {
        System.out.println("She swallowed the cat to catch the bird");
        Bird();
    }
    public static void Dog() {
        System.out.println("She swallowed the dog to catch the cat");
        Cat();
    }
}