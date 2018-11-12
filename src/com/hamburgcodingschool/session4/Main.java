package com.hamburgcodingschool.session4;

public class Main {

    public static void main(String[] args) {
        Employee alice = new Employee("Alice", "Altmann");
        Employee bob = new Employee("Bob", "Bauer");
        Employee chris = new Employee("Chris", "Cunningham");
        Employee doris = new Employee("Doris", "Dwight");
        Employee eric = new Employee("Eric", "Eberhardt");
        Employee frank = new Employee("Frank", "Fuhrmann");
        Employee gretha = new Employee("Gretha", "Grieg");
        Employee holger = new Employee("Holger", "Hundt");
        Employee ian = new Employee("Ian", "Ingerson");
        Employee jonas = new Employee("Jonas", "Johnson");
        Employee karl = new Employee("Karl", "Karstad");
        Employee lukas = new Employee("Lukas", "Lehmann");
        Employee mike = new Employee("Mike", "Mueller");
        Employee nils = new Employee("Nils", "Nilsson");

        Employee rachel = new Employee("Rachel", "Rutherford");
        Employee teresa = new Employee("Teresa", "Tucker");

        Department finance = new Department("Finance", frank);
        finance.addEmployee(alice);
        finance.addEmployee(bob);

        Department rAndD = new Department("R&D", rachel);
        rAndD.addEmployee(chris);
        rAndD.addEmployee(doris);

        Department tech = new Department("Tech", teresa);
        tech.addEmployee(eric);
        tech.addEmployee(ian);
        tech.addEmployee(jonas);
        tech.addEmployee(lukas);
        tech.addEmployee(mike);
        tech.addEmployee(nils);

        Department hr = new Department("HR", holger);
        hr.addEmployee(gretha);
        hr.addEmployee(karl);

        Company company = new Company("SuperGiga GmbH");
        company.addDepartment(finance);
        company.addDepartment(rAndD);
        company.addDepartment(tech);
        company.addDepartment(hr);

        company.printDepartments();
    }
}
