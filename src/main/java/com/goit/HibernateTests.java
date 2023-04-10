package com.goit;

import org.flywaydb.core.Flyway;

public class HibernateTests {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure().dataSource("jdbc:h2:file:./src/main/resources/db/module10db", "sa", null).load();
        flyway.migrate();

    }
}