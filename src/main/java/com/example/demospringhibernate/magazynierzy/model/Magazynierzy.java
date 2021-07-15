package com.example.demospringhibernate.magazynierzy.model;

import javax.persistence.*;
import java.util.List;


/*CREATE TABLE [dbo].[Magazynierzy](
	[magazynierzy_id] [int] IDENTITY(1,1) NOT NULL,
	[magazynierzy_nazwisko] [varchar](255) NULL,
	[magazynierzy_nr] [varchar](255) NULL,
	[regaly_id] [int] NULL,
	[programyTypy_id] [int] NULL,
	[dostawcy_id] [int] NULL,
	[kupcy_nazwa] [varchar](255) NULL,
	[organizacja_id] [int] NULL,
	[rodzajeTowarow_id] [int] NULL,
 CONSTRAINT [PK_Magazynierzy] PRIMARY KEY CLUSTERED
(
*/

@Entity // Model - zgodnie z Dabrowskim - Klasa Post.
@Table(name = "Magazynierzy")
public class Magazynierzy {

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


  @OneToMany(mappedBy = "post") // z Dabrowskiego - Post.
    private List<Regaly> commentsList;
    public List<Regaly> getCommentsList() {
        return commentsList;
    }
    public void setCommentsList(List<Regaly> commentsList) {
        this.commentsList = commentsList;
    }

    public String getMagazynierzyNr(String s) {
        return MagazynierzyNr;
    }
    public void setMagazynierzyNr(String magazynierzyNr) {
        MagazynierzyNr = magazynierzyNr;
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


    @Override
    public String toString() {
        return "Magazynierzy{" +

                ", magazynierzynazwisko='" + MagazynierzyNazwisko + '\'' +
                ", magazynierzynr='" + MagazynierzyNr +
                '}';
    }

}
