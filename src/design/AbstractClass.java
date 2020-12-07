package design;

public class AbstractClass implements Employee{
    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }

    protected void benefits() {
        System.out.println("There is no benefits in abstract class");
    }
}
