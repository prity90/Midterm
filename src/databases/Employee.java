package databases;

public class Employee {

    private String empName;
    private String empID;
    private String empDOB;

    public Employee(){}
    public Employee(String empName, String empID, String empDOB) {
        this.empName = empName;
        this.empID = empID;
        this.empDOB = empDOB;
    }
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOB(String empDOB) {
        this.empDOB = empDOB;
    }
}
