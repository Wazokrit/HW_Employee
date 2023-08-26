public class WageEmployee  extends Employee implements Salary{
    private double hourWage;
    private int hours;
    public void setHourWage(double hourWage) {
        if (hourWage>=minHourWage)
        this.hourWage = hourWage;
        else this.hourWage = minHourWage;
    }

    public void setHours(int hours) {
       if (hours<=maxHours)
        this.hours = hours;
       else this.hours= (int) maxHours;
    }



    @Override
    public double calcSalary() {
        return hours*hourWage;
    }

    @Override
    public String toString() {
        return super.toString() + "Salary=  " + calcSalary();
    }

    public WageEmployee(int id, String name, int age, double hourWage, int hours) {
        super(id, name, age);
       setHourWage(hourWage);
       setHours(hours);
    }
}
