package com.example.demospringhibernate;

import com.example.demospringhibernate.magazynierzy.repozytorium.MagazynierzyRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
       })*/

/*com.example.demospringhibernate.magazyn.MagazynierzyService*/


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = MagazynierzyRepository.class)
//@ComponentScan(basePackages = {"com.example.demospringhibernate.magazynierzy.Service"}) // ???
public class DemospringhibernateApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemospringhibernateApplication.class, args);
    }


    ///////////////////////////////


       /* int [] numbers = new int [2];
        System.out.println(Arrays.toString(numbers));*/


    /*ZarzadzamMagazynem*/

    /*spring.datasource.url=jdbc:sqlserver:LAPTOP-34U12RCA/SQLEXPRESS2019://localhost;databaseName=ZarzadzamMagazynem*/

    /*spring.datasource.url=jdbc:sqlserver://localhost;databaseName=ZarzadzamMagazynem*/
    /*//localhost1433;databaseNameZarzadzamMagazynem*/

    /* MagazynierzyId int IDENTITY (1,1) NOT NULL
        ,MagazynierzyNazwisko varchar (255) NULL
        ,MagazynierzyNr varchar (255) NULL
        ,RegalyId int NULL
        ,ProgramyTypyId int NULL
        ,DostawcyId int NULL
        ,KupcyNazwa varchar (255) NULL
        ,OrganizacjaId int NULL
        ,RodzajeTowarowId int NULL*/

}

