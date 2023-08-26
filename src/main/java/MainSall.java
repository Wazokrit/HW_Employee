public class MainSall {

    public static void main(String[] args) {
        SalaryEmployee s1 = new SalaryEmployee(1345,"Bob",23,32678);
        SalaryEmployee s2 = new SalaryEmployee(1445,"Bobm",33,3678);

        WageEmployee w1 = new WageEmployee(6547,"Chac",56,12,75);
        WageEmployee w2 = new WageEmployee(65467,"Chkc",44,24,125);

        Manager m1 = new Manager(34567,"Luk",23,12543,20);
        Manager m2 = new Manager(376567,"Lfk",29,14543,27);

Employee [] employees = {s1, s2, w1, w2,m1, m2};

print(employees);

    }

    public static void print(Employee[] employees)
    {for (Employee emp : employees)
        System.out.println(emp);}
}
