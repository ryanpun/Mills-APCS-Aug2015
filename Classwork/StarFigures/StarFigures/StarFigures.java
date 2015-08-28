public class StarFigures {
    public static void main(String[] args) {
        method1();
        method1();
        method2();
        method1();
    }
    public static void method1() {
        method3();
        method3();
        method4();
        method5();
        method4();
    }
    public static void method2() {
        method3();
        method3();
        System.out.println();
        method5();
        method5();
        method5();
    }
    public static void method3() {
        System.out.println("*****");
    }
    public static void method4() {
        System.out.println(" * * ");
    }
    public static void method5() {
        System.out.println("  *  "); 
    }
}

        