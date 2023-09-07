public class Main {
    public static void main(String[] args) {
        ComplexType complexType= new ComplexType("Работаю ");
        Main2 objectA = new Main2(42,"Anna", complexType, Work.Teacher);
        Main3 objectB = new Main3(23,"Roger",complexType,Work.Driver);
        Main3 objectC = new Main3(30,"Mike",complexType, Work.Cook);
        System.out.println("Свойства объекта objectA:");
        System.out.println("intValue: " + objectA.getYearOld());
        System.out.println("complexType: " + objectA.getComplexType().getText());
        System.out.println("enumValue: " + objectA.getWork());
        System.out.println();

        objectA.someMethod();
        objectA.constanta();
        System.out.println();

        System.out.println("Свойства объекта objectB:");
        System.out.println("stringValue: " + objectB.getStringValue());
        System.out.println("getComplexType: " + objectB.getComplexType());
        System.out.println();

        System.out.println("Свойства объекта objectC:");
        System.out.println("stringValue: " + objectC.getStringValue());
        System.out.println("getComplexType: " + objectC.getComplexType());
    }

}