package com.example.demospringhibernate.magazynierzy;

import javax.persistence.*;

@Entity
@Table(name = "Magazynierzy")
public class Magazynierzy {
    /*CREATE TABLE dbo.Magazynierzy(
        MagazynierzyId int IDENTITY (1,1) NOT NULL
        ,MagazynierzyNazwisko varchar (255) NULL
        ,MagazynierzyNr varchar (255) NULL
        ,RegalyId int NULL
        ,ProgramyTypyId int NULL
        ,DostawcyId int NULL
        ,KupcyNazwa varchar (255) NULL
        ,OrganizacjaId int NULL
        ,RodzajeTowarowId int NULL
    */

    @Id
    @SequenceGenerator(
            name = "magazynierzy_sequence",
            sequenceName = "magazynierzy_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "magazynierzy_sequence"
    )
    @Column(name = "magazynierzy_id", nullable = false, unique = true)
    private int MagazynierzyId;

    /* @Column(name = "rodzaje", nullable = true)
     private int    RodzajeTowarowId;*/
    @Column(name = "magazynierzy_nazwisko")
    private String MagazynierzyNazwisko;
    @Column(name = "magazynierzy_nr", nullable = true)
    private String MagazynierzyNr;


    /*magazynierzy_id
magazynierzy_nazwisko
magazynierzy_nr*/

    // @Column(name = "RegalyId")  // nie musze dopisywac nullable, bo jest default.
   /* private int    RegalyId;
    @Column(name = "ProgramyTypyId")
    private int    ProgramyTypyId;
    @Column(name = "DostawcyId")
    private int    DostawcyId;
    @Column(name = "KupcyNazwa")
    private String KupcyNazwa;
    @Column(name = "OrganizacjaId")
    private int    OrganizacjaId;*/


        public int getMagazynierzyId() {
        return MagazynierzyId;
    }

    public void setMagazynierzyId(int magazynierzyId) {
        MagazynierzyId = magazynierzyId;
    }

    public String getMagazynierzyNazwisko() {
        return MagazynierzyNazwisko;
    }

    public void setMagazynierzyNazwisko(String magazynierzyNazwisko) {
        MagazynierzyNazwisko = magazynierzyNazwisko;
    }

    public String getMagazynierzyNr() {
        return MagazynierzyNr;
    }

    public void setMagazynierzyNr(String magazynierzyNr) {
        MagazynierzyNr = magazynierzyNr;
    }


    @Override
    public String toString() {
        return "Magazynierzy{" +

                ", MagazynierzyNazwisko='" + MagazynierzyNazwisko + '\'' +
                ", MagazynierzyNr='" + MagazynierzyNr +

                '}';
    }

}
