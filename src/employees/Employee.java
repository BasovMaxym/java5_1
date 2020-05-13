package employees;

import manager.Manager;

public class Employee
{

    public Employee()
    {



    }

    public Employee(int id, String name)
    {

        this.id = id;

        this.name = name;

        this.salary = 1000;

    }

    public int getID()
    {

        return this.id;

    }

    public void setID(int id)
    {

        this.id = id;

    }

    public String getName()
    {

        return this.name;

    }

    public void setName(String name)
    {

        this.name = name;

    }

    public double getSalary()
    {

        return this.salary;

    }

    public void setSalary(double salary)
    {

        this.salary = salary;

    }

    final public Manager getManager()
    {

        return this.manager;

    }

    public void setManager(Manager manager)
    {

        this.manager = manager;

    }

    final public void increaseSalary(double percent)
    {

        this.salary = this.salary * (1 - (percent / 100));

    }

    @Override
    public String toString ()
    {

        return "Employee " + this.id + "\n" + "Name: " + this.name + "\n" + "Salary: " + this.salary + "\n" + "Manager " + this.manager.getName();

    }

    private int id;

    private String name;

    private double salary;

    private Manager manager;

}
