public class Main1 {
    private int yearOld ;

    private ComplexType complexType;

    private String name ;

    public Main1(int yearOld, String name,ComplexType complexType) {
        this.yearOld = yearOld;
        this.name = name;
        this.complexType= complexType;
    }

    public int getYearOld() {
        return yearOld;
    }


    public String getName() {
        return name;
    }

    public ComplexType getComplexType() {
        return complexType;
    }
}
