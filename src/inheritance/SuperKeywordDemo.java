package inheritance;

class Math {
    int x;

    public void info() {
        System.out.println("I'm a parent method.");
    }
}

public class SuperKeywordDemo extends Math {
    int y;

    public void sum(int a, int b) {
        super.x = a;
        this.y = b;
        System.out.println("total sum: " + (super.x + this.y));
    }
    public void info1(){
        super.info();
        System.out.println("I'm child method.");
    }
    public static void main(String[] args) {
        SuperKeywordDemo ob = new SuperKeywordDemo();
        ob.sum(4, 5);
        ob.info1();
    }
}
