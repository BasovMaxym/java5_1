package main;

import employees.Employee;

import manager.Manager;

public class Main
{

    public static void main(String[] args)
    {


        Employee first = new Employee(1,"Max");

        Employee second = new Employee(2, "Bohdan");

        Employee third = new Employee(3, "Misha");

        Employee fourth = new Employee(4,"Yura");

        Manager firstmang = new Manager(400,1,"Donald");

        Manager secondmang = new Manager(200,2,"Frenk");

        Manager thirdmang = new Manager(500,3,"Flash");

        firstmang.addEmployee(third);

        secondmang.setManager(firstmang);

        secondmang.addEmployee(first);

        secondmang.addEmployee(second);

        first.setManager(secondmang);

        second.setManager(secondmang);

        third.setManager(firstmang);

        String result = secondmang.toString();

        System.out.println(result);

        Manager fourthmang = new Manager(500,4,"Andrey");

        Manager fifthmang = new Manager(500,5,"Ehor");

        Manager sixthmang = new Manager(500,6,"Clark");

        fourth.setManager(sixthmang);

        sixthmang.addEmployee(fourth);

        sixthmang.setManager(fifthmang);

        fifthmang.setManager(fourthmang);

        fourthmang.setManager(thirdmang);

        result = sixthmang.toString();

        System.out.println(result);

    }

}
