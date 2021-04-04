public class CountObjects {
    private static int obj;
    private int a;
    public CountObjects() {
        a = 4;
        obj++;
    }
    public CountObjects(int a) {
        obj++;
    }
    public void setA(int a) {
        this.a = a;
        obj++;
    }
    public int getA() {
        return a;
    }
    public static int getObj() {
        return obj;
    }
    public static void destroy() {
        obj--;
    }
}
