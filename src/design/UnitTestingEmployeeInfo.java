package design;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

        System.out.println(EmployeeInfo.companyName);
        EmployeeInfo employeeInfo = new EmployeeInfo(1);
        EmployeeInfo employeeInfo1 = new EmployeeInfo("Daljeet", 1);

        EmployeeInfo.calculateEmployeeBonus(3,20000,"best");

        EmployeeInfo.calculateEmployeePension(3000);
    }
}
