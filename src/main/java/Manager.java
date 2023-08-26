public class Manager extends SalaryEmployee {
    private double bonuses;

    public void setBonuses(double bonuses) {
        if (bonuses <= maxBonuses)
            this.bonuses = bonuses;
        else this.bonuses = maxBonuses;
    }

    public double getBonuses() {
        return bonuses;
    }


    public Manager(int id, String name, int age, double salary, double bonuses) {
        super(id, name, age, salary);
        setBonuses(bonuses);
    }


    @Override
    public double calcSalary() {
        return getSalary()+ getSalary()*bonuses;
    }

    @Override
    public String toString() {
        return super.toString()+ "Salary " + calcSalary();
    }
}



