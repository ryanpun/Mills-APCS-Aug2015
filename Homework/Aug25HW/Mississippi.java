public class Mississippi {
    public static void main(String[] args) {
        Line1();
        Line2();
        Line3();
        Line4();
        Line5();
        Line6();
        Line7();
    }
/**
 * Line composition
 */
    public static void Line1() {
        System.out.println();MBottom();Space();IEnds();Space();SEnds();Space();SEnds();Space();IEnds();Space();SEnds();Space();SEnds();Space();IEnds();Space();PEnds();Space();PEnds();Space();IEnds();Space();
    }
    public static void Line2() {
        System.out.println();MLine2();Space();IMiddle();Space();SLine2();Space();SLine2();Space();IMiddle();Space();SLine2();Space();SLine2();Space();IMiddle();Space();PLoop();Space();PLoop();Space();IMiddle();Space();
    }
    public static void Line3() {
        System.out.println();MLine3();Space();IMiddle();Space();SLine3();Space();SLine3();Space();IMiddle();Space();SLine3();Space();SLine3();Space();IMiddle();Space();PLoop();Space();PLoop();Space();IMiddle();Space();
    }
    public static void Line4() {
        System.out.println();MLine4();Space();IMiddle();Space();SEnds();Space();SEnds();Space();;IMiddle();Space();SEnds();Space();SEnds();Space();;IMiddle();Space();PEnds();Space();PEnds();Space();IMiddle();Space();
    }
    public static void Line5() {
        System.out.println();MBottom();Space();IMiddle();Space();SLine4();Space();SLine4();Space();IMiddle();Space();SLine4();Space();SLine4();Space();IMiddle();Space();PBottom();Space();PBottom();Space();IMiddle();Space();
    }
    public static void Line6() {
        System.out.println();MBottom();Space();IMiddle();Space();SLine2();Space();SLine2();Space();IMiddle();Space();SLine2();Space();SLine2();Space();IMiddle();Space();PBottom();Space();PBottom();Space();IMiddle();Space();
    }
    public static void Line7() {
        System.out.println();MBottom();Space();IEnds();Space();SEnds();Space();SEnds();Space();IEnds();Space();SEnds();Space();SEnds();Space();IEnds();Space();PBottom();Space();PBottom();Space();IEnds();Space();
    }
/**
 * Space in between letters
 */
    public static void Space(){
        System.out.print("\t");
    }
/**
 * "M" Parts
 */
    public static void MLine2() {
        System.out.print("MM   MM");
    }
    public static void MLine3() {
        System.out.print("M M M M");
    }
    public static void MLine4() {
        System.out.print("M  M  M");
    }
    public static void MBottom() {
        System.out.print("M     M");
    }
/**
 * "I" Parts
 */
    public static void IEnds() {
        System.out.print("IIIII");
    }
    public static void IMiddle() {
        System.out.print("  I  ");
    }
/**
 * "S" Parts
 */
    public static void SEnds() {
        System.out.print(" SSSSS ");
    }
    public static void SLine2() {
        System.out.print("S     S");
    }
    public static void SLine3() {
        System.out.print("S");
    }
    public static void SLine4() {
        System.out.print("      S");
    }
/**
 * "P" Parts
 */
    public static void PEnds() {
        System.out.print("PPPPPP ");
    }
    public static void PLoop() {
        System.out.print("P     P");
    }
    public static void PBottom() {
        System.out.print("P");
    }
}