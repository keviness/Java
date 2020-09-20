/**Inherit example: manage system
*@author keviness
*@version 2020/9/20
*/

package InheritSalaryManage;

import java.util.*;

public class InheritManageTest
{
    public static void main(String[] args)
    {
        Manager boss = new Manager("keviness", 8000, 1987, 12, 3);
        boss.SetBonus(5000);

        Employee[] employees = new Employee[3];
        employees[0] = boss;
        employees[1] = new Employee("Bob", 4500, 1994, 11, 3);
        employees[2] = new Employee("Nancy", 3500, 1998, 8, 7);

        for (Employee employee : employees)
        {
            System.out.printf("The name: %s  get salary:%f ",
                              example.GetName(), employee.GetSalary());
        }
    }
}