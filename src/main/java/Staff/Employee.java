package Staff;

public abstract class Employee {



    private String name;
    private String nINumber;
    private int salary;

    public  Employee(String name, String nINumber, int salary){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }
    public String getNINumber() {
        return this.nINumber;
    }
    public int getSalary() {
        return this.salary;
    }

    public String raiseSalary(int salaryIncrease){
        if (salaryIncrease > 0) {
            this.salary += salaryIncrease;
            return "Valid Input";
        } else return "Fuck You";
    }

    public double bonus(){
        return this.salary * 0.01;
    }

}
