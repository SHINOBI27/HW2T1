public class Main {
    public static void main(String[] args) {
        System.out.println("За покупку билета начисленно бонусных миль:");
        int cost = 23000;
        int condition = 20;
        int miles = cost * 1 / condition;
        System.out.println(miles);
    }
}