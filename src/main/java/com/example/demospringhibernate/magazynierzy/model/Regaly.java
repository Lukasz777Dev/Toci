package com.example.demospringhibernate.magazynierzy.model;

import javax.persistence.*;


/*CREATE TABLE [dbo].[Regaly](
	[regaly_id] [int] IDENTITY(1,1) NOT NULL,
	[regaly_nr] [varchar](255) NULL,
	[magazynierzy_id] [int] NULL,
	[rodzajeTowarow_id] [int] NULL,
	[programyTypy_id] [int] NULL,
 CONSTRAINT [PK_Regaly] PRIMARY KEY CLUSTERED
(*/

// zgodnie z Dabrowskim - Comment.
public class Regaly {
    //  // FetchType.LAZY  – pobieramy dane dopiero wtedy, gdy ich potrzebujemy. W praktyce wtedy, gdy użyjemy gettera na powiązanej kolekcji, Hibernate wykonuje zapytanie do bazy danych.
    @ManyToOne(fetch = FetchType.LAZY)
    private Magazynierzy magazynierzy;
    @Id
      @SequenceGenerator(
            name = "regaly_sequence",
            sequenceName = "regaly_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "regaly_sequence"
    )
    @Column(name = "regaly_id", nullable = false, unique = true)
    private int regaly_id;
    @Column(name = "regaly_nr")
    private String regaly_nr;
    @Column(name = "magazynierzy_id")
    private int magazynierzy_id;


    public Magazynierzy getMagazynierzy() {
        return magazynierzy;
    }

    public void setMagazynierzy(Magazynierzy magazynierzy) {
        this.magazynierzy = magazynierzy;
    }

    public int getRegaly_id() {
        return regaly_id;
    }

    public void setRegaly_id(int regaly_id) {
        this.regaly_id = regaly_id;
    }

    public String getRegaly_nr() {
        return regaly_nr;
    }

    public void setRegaly_nr(String regaly_nr) {
        this.regaly_nr = regaly_nr;
    }

    public int getMagazynierzy_id() {
        return magazynierzy_id;
    }

    public void setMagazynierzy_id(int magazynierzy_id) {
        this.magazynierzy_id = magazynierzy_id;
    }

}









