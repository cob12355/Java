package corejava;

public class Nokia extends Mobile {
    String color;
    @Override
    public void info() {
        System.out.println("showing nokia information");
    }
    public static void main(String[] args) {
        Nokia nokiaxl = new Nokia();
        nokiaxl.name = "Nokia XL";
        nokiaxl.color = "Black";
        nokiaxl.price = 17000;

        System.out.println(nokiaxl.name + "\n Color:" + nokiaxl.color + "\nPrice:" + nokiaxl.price);
    nokiaxl.info();
    }


}
