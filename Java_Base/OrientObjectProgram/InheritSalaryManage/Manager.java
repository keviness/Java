/**Inherit example: Salary manage
*@author keviness
*@version 2020/9/20
*/

package InheritSalaryManage;

public class Manager extends Employee
{
    private double bonus;
    
    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month);
        this.bonus = 0.0;
    }

    @override
    public double GetSalary()
    {
        double baseSalary = super.GetSalary();
        return baseSalary+bonus;
    }

    public void SetBonus(double bonus)
    {
        this.bonus = bonus;
    }
}