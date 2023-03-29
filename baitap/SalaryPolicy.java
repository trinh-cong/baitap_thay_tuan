package baitap;

public abstract class SalaryPolicy {
    protected float baseSalary;
    public SalaryPolicy(float baseSalary) {
        this.baseSalary = baseSalary;
    }
    abstract float getSalary();

}
class EmployeeFullTime extends SalaryPolicy {
    private float rate = 4;

    public EmployeeFullTime(float baseSalary) {
        super(baseSalary);
    }

    public float getSalary() {
        return rate * baseSalary;
    }
}

class EmployeePartime extends SalaryPolicy {
    private float rate = 2.5f;

    public EmployeePartime(float baseSalary) {
        super(baseSalary);
    }

    public float getSalary() {
        return rate * baseSalary;
    }
}




