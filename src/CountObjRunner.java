public class CountObjRunner {
    public static void main(String[] args) {
        CountObjects a = new CountObjects();
        CountObjects b = new CountObjects(2);
        CountObjects c = new CountObjects(3);
        CountObjects d= new CountObjects(4);
        CountObjects e = new CountObjects(5);
        System.out.println("Number of objects created before deleting: "+ CountObjects.getObj());
        CountObjects.destroy();
        System.out.println("Number of objects created after deleting: "+ CountObjects.getObj());

    }
}
