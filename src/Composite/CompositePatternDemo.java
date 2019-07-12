package Composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employer CEO=new Employer("John","CEO",300000);

        Employer headSales=new Employer("Robert","Head Seals",200000);

        Employer headMarking =new Employer("Michel","Head marking",1000);

        Employer clerk1=new Employer("Laura","Marking",10000);
        Employer clerk2=new Employer("Bob","Marking",10000);

        Employer saleExecutive1=new Employer("Richard","Sales",10000);
        Employer saleExecutive2=new Employer("Rob","Sales",10000);

        CEO.add(headSales);
        CEO.add(headMarking);

        headSales.add(saleExecutive1);
        headSales.add(saleExecutive2);

        headMarking.add(clerk1);
        headMarking.add(clerk2);

        System.out.println(CEO);
        for(Employer headEmployee:CEO.getSubordinates()){
            System.out.println(headEmployee);
            for(Employer employer:headEmployee.getSubordinates()){
                System.out.println(employer);
            }
        }
    }
}
