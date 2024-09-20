public class use_of_this_keyword {
    private int value;
    public use_of_this_keyword(int value) {
        this.value = value; }
    public void printValue() {
        System.out.println("Value: " + this.value); }
    public static void main(String[] args) {
        use_of_this_keyword obj = new use_of_this_keyword(10);
        obj.printValue(); }
}
