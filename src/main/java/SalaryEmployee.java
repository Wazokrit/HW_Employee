public class SalaryEmployee extends Employee implements Salary{
    private double salary;

    public SalaryEmployee(int id, String name, int age, double salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calcSalary() {
        return minSalary;
    }

    @Override
    public String toString() {
        return super.toString()+ " Salary"+ calcSalary() ;
    }
}
