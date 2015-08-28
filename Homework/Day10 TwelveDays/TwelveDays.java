/**
 * This program will print the lyrics to "The Twelve Days of Christmas"
 * Ryan Pun
 */
public class TwelveDays
{
   public static void main(String[] args) {
       Day1();
       System.out.println();
       Day2();
       System.out.println();
       Day3();
       System.out.println();
       Day4();
       System.out.println();
       Day5();
       System.out.println();
       Day6();
       System.out.println();
       Day7();
       System.out.println();
       Day8();
       System.out.println();
       Day9();
       System.out.println();
       Day10();
       System.out.println();
       Day11();
       System.out.println();
       Day12();
   }
   public static void Day1() {
       System.out.println("On the first day of Christmas,\nmy true love sent to me");
       Partridge();
   }
   public static void Day2() {
       System.out.println("On the second day of Christmas,\nmy true love sent to me");
       Doves();
   }
   public static void Day3() {
       System.out.println("On the third day of Christmas,\nmy true love sent to me");
       Hens();
   }
   public static void Day4() {
       System.out.println("On the fourth day of Christmas,\nmy true love sent to me");
       Birds();
   }
   public static void Day5() {
       System.out.println("On the fifth day of Christmas,\nmy true love sent to me");
       Rings();
   }
   public static void Day6() {
       System.out.println("On the sixth day of Christmas,\nmy true love sent to me");
       Geese();
   }
   public static void Day7() {
       System.out.println("On the seventh day of Christmas,\nmy true love sent to me");
       Swans();
   }
   public static void Day8() {
       System.out.println("On the eighth day of Christmas,\nmy true love sent to me");
       Maids();
   }
   public static void Day9() {
       System.out.println("On the ninth day of Christmas,\nmy true love sent to me");
       Ladies();
   }
   public static void Day10() {
       System.out.println("On the tenth day of Christmas,\nmy true love sent to me");
       Lords();
   }
   public static void Day11() {
       System.out.println("On the eleventh day of Christmas,\nmy true love sent to me");
       Pipers();
   }
   public static void Day12() {
       System.out.println("On the twelfth day of Christmas,\nmy true love sent to me");
       Drummers();
   }
   public static void Partridge() {
       System.out.println("a partridge in a pair tree.");
   }
   public static void Doves() {
       System.out.println("two turtle doves, and");
       Partridge();
   }
   public static void Hens() {
       System.out.println("three French hens,");
       Doves();
   }
      public static void Birds() {
       System.out.println("four calling birds,");
       Hens();
   }
   public static void Rings() {
       System.out.println("five golden rings,");
       Birds();
   }
   public static void Geese() {
       System.out.println("six geese a-laying,");
       Rings();
   }
   public static void Swans() {
       System.out.println("seven swans a-swimming");
       Geese();
   }
   public static void Maids() {
       System.out.println("eight maids a-milking");
       Swans();
   }
   public static void Ladies() {
       System.out.println("nine ladies dancing,");
       Maids();
   }
   public static void Lords() {
       System.out.println("ten lords a-leaping,");
       Ladies();
   }
   public static void Pipers() {
       System.out.println("eleven pipers piping,");
       Lords();
   }
   public static void Drummers() {
       System.out.println("twelve drummers drumming");
       Pipers();
   }
}
