/**polymorphic example
*@author keviness
*@version 2020/9/19
*/

import java.util.*;

public class Polymorphic
{
    public static void main(String[] args)
    {
        Income[] incomes = new Income[] {
            new Income(3000),
            new Salary(8000),
            new StateCouncilSpecialAllowance(12000)
        };
        showResult(incomes);
    }
    public static void showResult(Income... incomes)
    {
        double total = 0.0;
        for (Income element : incomes)
        {
            total += element.getTax();
            System.out.println(element.getTax());
        }
        System.out.println("The result:"+total);
    }
}

class Income
{
    protected double income;

    public Income(double income)
    {
        this.income = income;
    } 

    public double getTax()
    {
        return this.income*0.1;
    }
}

class Salary extends Income
{
    public Salary(double income)
    {
        super(income);
    }

    @Override
    public double getTax()
    {
        if (this.income < 5000)
            return 0;
        return (this.income-5000)*0.2;
    }
}

class StateCouncilSpecialAllowance extends Income
{
    public StateCouncilSpecialAllowance(double income)
    {
        super(income);
    }

    @Override 
    public double getTax()
    {
        return 0;
    }
}