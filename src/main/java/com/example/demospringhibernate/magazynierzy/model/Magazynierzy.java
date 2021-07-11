package com.example.demospringhibernate.magazynierzy.model;

import com.example.demospringhibernate.magazynierzy.MagazynierzyController;

import javax.persistence.*;
import java.util.List;


@Entity // Model
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
    public Magazynierzy() {
    }

    public Magazynierzy(String magazynierzyNazwisko, String magazynierzyNr) {
        MagazynierzyNazwisko = magazynierzyNazwisko;
        MagazynierzyNr = magazynierzyNr;
    }

    public Magazynierzy(int magazynierzyId, String magazynierzyNazwisko, String magazynierzyNr) {
        MagazynierzyId = magazynierzyId;
        MagazynierzyNazwisko = magazynierzyNazwisko;
        MagazynierzyNr = magazynierzyNr;
    }

    // @JsonView
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
    // @Column – informuje, że pole to, jest kolumną w bazie danych.
    // magazynierzy_id mają annotation @Id - w 36.
    @Column(name = "magazynierzy_id", nullable = false, unique = true)
    private int MagazynierzyId;

    @Column(name = "magazynierzy_nazwisko")
    private String MagazynierzyNazwisko;
    @Column(name = "magazynierzy_nr", nullable = true) // nie musze dopisywac nullable, bo jest default.
    private String MagazynierzyNr;

    // FetchType.LAZY  – pobieramy dane dopiero wtedy, gdy ich potrzebujemy. W praktyce wtedy, gdy użyjemy gettera na powiązanej kolekcji, Hibernate wykonuje zapytanie do bazy danych.


  @OneToMany(mappedBy = "post") // z Dabrowskiego - Post.
    private List<MagazynierzyController> commentsList;
    public List<MagazynierzyController> getCommentsList() {
        return commentsList;
    }
    public void setCommentsList(List<MagazynierzyController> commentsList) {
        this.commentsList = commentsList;
    }


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

    public String getMagazynierzyNr(String s) {
        return MagazynierzyNr;
    }

    public void setMagazynierzyNr(String magazynierzyNr) {
        MagazynierzyNr = magazynierzyNr;
    }


    @Override
    public String toString() {
        return "Magazynierzy{" +

                ", magazynierzynazwisko='" + MagazynierzyNazwisko + '\'' +
                ", magazynierzynr='" + MagazynierzyNr +
                '}';
    }

}
