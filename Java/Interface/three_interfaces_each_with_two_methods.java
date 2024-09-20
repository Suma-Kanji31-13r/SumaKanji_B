package Interface;
interface InterfaceA {
    void methodA1();
    void methodA2(); }
interface InterfaceB {
    void methodB1();
    void methodB2(); }
interface InterfaceC {
    void methodC1();
    void methodC2(); }
interface CombinedInterface extends InterfaceA, InterfaceB, InterfaceC {
    void newCombinedMethod(); }
class ConcreteClass {
    public void concreteMethod() {
        System.out.println("This is a method in ConcreteClass."); } }
class ImplementationClass extends ConcreteClass implements CombinedInterface {
    public void methodA1() { System.out.println("Implementing methodA1."); }
    public void methodA2() { System.out.println("Implementing methodA2."); }
    public void methodB1() { System.out.println("Implementing methodB1."); }
    public void methodB2() { System.out.println("Implementing methodB2."); }
    public void methodC1() { System.out.println("Implementing methodC1."); }
    public void methodC2() { System.out.println("Implementing methodC2."); }
    public void newCombinedMethod() { System.out.println("Implementing newCombinedMethod."); } }
public class three_interfaces_each_with_two_methods {
    public static void useInterfaceA(InterfaceA a) {
        a.methodA1();
        a.methodA2(); }
    public static void useInterfaceB(InterfaceB b) {
        b.methodB1();
        b.methodB2(); }
    public static void useInterfaceC(InterfaceC c) {
        c.methodC1();
        c.methodC2(); }
    public static void useCombinedInterface(CombinedInterface ci) {
        ci.newCombinedMethod(); }
    public static void main(String[] args) {
        ImplementationClass obj = new ImplementationClass();
        useInterfaceA(obj);
        useInterfaceB(obj);
        useInterfaceC(obj);
        useCombinedInterface(obj);
        obj.concreteMethod(); }
}
