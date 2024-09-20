public class use_of_static_keyword {
    private static int count = 0;
    public use_of_static_keyword() {
        count++; }
    public static void main(String[] args) {
        use_of_static_keyword obj1 = new use_of_static_keyword();
        use_of_static_keyword obj2 = new use_of_static_keyword();
        use_of_static_keyword obj3 = new use_of_static_keyword();
        System.out.println("Number of objects created: " + use_of_static_keyword.count); }
}
