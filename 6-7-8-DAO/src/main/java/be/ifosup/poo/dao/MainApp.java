package be.ifosup.poo.dao;

import be.ifosup.poo.dao.beans.Employee;
import be.ifosup.poo.dao.beans.Language;
import be.ifosup.poo.dao.beans.Society;
import be.ifosup.poo.dao.dao.h2.H2EmployeeDAO;
import be.ifosup.poo.dao.dao.h2.H2SocietyDAO;
import org.fluttercode.datafactory.impl.DataFactory;


public class MainApp {
    private H2SocietyDAO societyDAO = new H2SocietyDAO();
    private H2EmployeeDAO employeeDAO = new H2EmployeeDAO();

    public static void main(String[] args) {
        MainApp app = new MainApp();
        DataFactory factory = new DataFactory();

        app.show();

        System.out.println("*******************Ajouter une société************************");
        Society society = new Society(factory.getBusinessName());
        society = app.societyDAO.save(society);
        System.out.println(society);

        System.out.println("*******************Ajouter un employé************************");
        Employee employee = new Employee();
        employee.setFirstName(factory.getFirstName());
        employee.setLastName(factory.getLastName());
        employee.setBirthday(factory.getBirthDate());
        employee.addLanguage(new Language("Python"));
        employee.addLanguage(new Language("C#"));
        employee.setSociety(society);
        employee = app.employeeDAO.save(employee);

        society.addEmployee(employee);
        app.show();
    }

    private void show() {
        System.out.println("*******************Affichage des sociétés*********************");
        societyDAO.findAll().forEach(System.out::println);
    }

}
