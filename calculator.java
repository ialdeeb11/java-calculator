
public class calculator {

    static int x = 8;
    static int y = 4;

    public static void main(String args[]) {

    }

    public static int sum() {

        int result = calculator.x + calculator.y;

        return result;
    }

    public static int sub() {

        int result = calculator.x - calculator.y;

        return result;

    }

    public static int multi() {

        int result = calculator.x * calculator.y;

        return result;
    }

    public static int div() {

        int result = calculator.x / calculator.y;

        return result;
    }
}

class test {
    public static void main(String args[]) {
        System.out.println("x = " + calculator.x);
        System.out.println("y = " + calculator.y);
        System.out.println("+: " + calculator.sum());
        System.out.println("-: " + calculator.sub());
        System.out.println("*: " + calculator.multi());
        System.out.println("/: " + calculator.div());

    }

}