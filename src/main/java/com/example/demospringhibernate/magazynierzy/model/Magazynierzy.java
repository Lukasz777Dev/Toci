package com.example.demospringhibernate.magazynierzy.model;

import javax.persistence.*;
import javax.xml.stream.events.Comment;
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
    // @Column – informuje, że pole to jest kolumną w bazie danych.
    @Column(name = "magazynierzy_id", nullable = false, unique = true)
    private int MagazynierzyId;

    @Column(name = "magazynierzy_nazwisko")
    private String MagazynierzyNazwisko;
    @Column(name = "magazynierzy_nr", nullable = true) // nie musze dopisywac nullable, bo jest default.
    private String MagazynierzyNr;




    @ManyToMany(mappedBy = "post")
    private List<Comment> commentsList;


    public List<Comment> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comment> commentsList) {
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

    public String getMagazynierzyNr() {
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
