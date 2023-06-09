package com.goit;

import com.goit.CrudServices.ClientCrudService;
import com.goit.CrudServices.PlanetCrudService;
import org.flywaydb.core.Flyway;

public class HibernateTests {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure().dataSource("jdbc:h2:file:./src/main/resources/db/module10db", "sa", null).load();
        flyway.migrate();

        System.out.println("ClientCrudService.create = " + ClientCrudService.create("Elise"));
        System.out.println("ClientCrudService.getById = " + ClientCrudService.getById(10));
        ClientCrudService.setName(9, "Alicia");
        ClientCrudService.deleteById(3);
        System.out.println("ClientCrudService.listAll = " + ClientCrudService.listAll());

        System.out.println("PlanetCrudService.create = " + PlanetCrudService.create("KAM", "Kamino"));
        System.out.println("PlanetCrudService.getById = " + PlanetCrudService.getById("JED"));
        PlanetCrudService.setName("KRON", "Qo'noS");
        PlanetCrudService.deleteById("TATOO");
        System.out.println("PlanetCrudService.listAll = " + PlanetCrudService.listAll());
    }
}