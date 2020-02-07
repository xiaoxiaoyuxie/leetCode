class Objec{
    int a;
    int b;
}
public class TestIntance{
    public void test() {
        Objec obj = new Objec();
        Objec obj2 = obj;
        obj2.a = 10;
        System.out.println(obj.a);
    }
    public static void main(String[] args) {
        TestIntance intance = new TestIntance();
        intance.test();
    }
}