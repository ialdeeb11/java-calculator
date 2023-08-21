
public class calculator {

    int x = 6;
    int y = 0;

    public static void main(String args[]) {
        calculator calc = new calculator();
        calc.result();

    }

    public void result() {

        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
        System.out.println("+: " + this.sum());
        System.out.println("-: " + this.sub());
        System.out.println("*: " + this.multi());

        if (this.y == 0) {
            System.out.println("connot divid by 0");
        } else {
            System.out.println("/: " + this.div());
        }

    }

    public int sum() {

        int result = this.x + this.y;

        return result;
    }

    public int sub() {

        int result = this.x - this.y;

        return result;

    }

    public int multi() {

        int result = this.x * this.y;

        return result;
    }

    public int div() {

        if (this.y == 0) {

            return this.y;
        }

        else {

            int result = this.x / this.y;

            return result;

        }
    }
}
