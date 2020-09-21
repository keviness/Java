/**Inherit manage test
*@author keviness
*@version 2020/9/20
*/

package InheritSalaryManage;

import java.time.*;

public class Employee
{
    private String name;
    private double salary;
    private LocalDate hireday;

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        this.hireday = LocalDate.of(year, month, day);
    }

    public String GetName()
    {
        return this.name;
    }

    public double GetSalary()
    {
        return this.salary;
    }

    public LocalDate GetHireday()
    {
        return this.hireday;
    }

    public double RaiseSalary(double percentage)
    {
        double raise = this.salary * percentage/100;
        this.salary += raise;
        return this.salary;
    }
}
