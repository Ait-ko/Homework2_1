public class Main2 extends Main1{
    private Work work;
    public Main2(int yearOld,  String name, ComplexType complexType, Work work) {
        super(yearOld,  name,complexType);
        this.work = work;

    }

    public Work getWork() {
        return work;
    }

    public void someMethod() {
        System.out.println("Метод, который можно перегрузить");
    }
    public void someMethod(int value) {
        System.out.println("Перегруженный метод с int: " + value);
    }

    public void someMethod(String value) {
        System.out.println("Перегруженный метод с String: " + value);
    }

    public final void constanta() {
        System.out.println("Этот метод нельзя переопределить");
    }

}
