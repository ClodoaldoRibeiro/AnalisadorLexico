package Imput;

public class Soma {

    public static void main(String arg[]) {
        int a, b, c;
        b = 10;
        c = 3;
        a = func(b, b + c);
    }

    public static int func(int x, int y) {
        int ret;
        ret = x + y;
        return ret;
    }
}
