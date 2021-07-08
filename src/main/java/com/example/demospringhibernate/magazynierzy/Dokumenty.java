package com.example.demospringhibernate.magazynierzy;

import com.example.demospringhibernate.magazynierzy.model.Magazynierzy;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;



/*
Dokumenty
dokumenty_id
	dokumenty_doMagazData
		dokumenty_doMagazTytul	dokumenty_zMagazynData	dokumenty_zMagazynTytul	dokumenty_nazwa	dostawcy_id	magazynierzy_id	kupcy_id	rodzajeTowarow_id

2*/



public class Dokumenty {
    /*@Entity
    @Table(name = "Dokumenty")*/
    @Id
    @Column(name = "dokumenty_id", nullable =false, unique = true)
    private int DokumentyId;

    @Column(name = "dokumenty_doMagazData")
    private LocalDateTime Dokumenty_doMagazData;
    @Column(name = "dokumenty_doMagazTytul")
    private  String Dokumenty_doMagazTytul;
    @Column(name = "dokumenty_zMagazynData")
    private  LocalDateTime Dokumenty_zMagazynData;
    @Column(name = "dokumenty_zMagazynTytul")
    private String Dokumenty_zMagazynTytul;
    @Column(name = "dokumenty_nazwa")
    private  String Dokumenty_nazwa;
    @Column(name = "dostawcy_id")
    private  int Dostawcy_id;
    @Column(name = "magazynierzy_id")
    private  int Magazynierzy_id;
    @Column(name = "kupcy_id")
    private int Kupcy_id;
    @Column(name = "rodzajeTowarow_id")
    private int RodzajeTowarow_id;
    @ManyToMany(fetch = FetchType.LAZY)
    private Magazynierzy magazyn;


    public int getDokumentyId() {
        return DokumentyId;
    }

    public void setDokumentyId(int dokumentyId) {
        DokumentyId = dokumentyId;
    }

    public LocalDateTime getDokumenty_doMagazData() {
        return Dokumenty_doMagazData;
    }

    public void setDokumenty_doMagazData(LocalDateTime dokumenty_doMagazData) {
        Dokumenty_doMagazData = dokumenty_doMagazData;
    }

    public String getDokumenty_doMagazTytul() {
        return Dokumenty_doMagazTytul;
    }

    public void setDokumenty_doMagazTytul(String dokumenty_doMagazTytul) {
        Dokumenty_doMagazTytul = dokumenty_doMagazTytul;
    }

    public LocalDateTime getDokumenty_zMagazynData() {
        return Dokumenty_zMagazynData;
    }

    public void setDokumenty_zMagazynData(LocalDateTime dokumenty_zMagazynData) {
        Dokumenty_zMagazynData = dokumenty_zMagazynData;
    }

    public String getDokumenty_zMagazynTytul() {
        return Dokumenty_zMagazynTytul;
    }

    public void setDokumenty_zMagazynTytul(String dokumenty_zMagazynTytul) {
        Dokumenty_zMagazynTytul = dokumenty_zMagazynTytul;
    }

    public String getDokumenty_nazwa() {
        return Dokumenty_nazwa;
    }

    public void setDokumenty_nazwa(String dokumenty_nazwa) {
        Dokumenty_nazwa = dokumenty_nazwa;
    }

    public int getDostawcy_id() {
        return Dostawcy_id;
    }

    public void setDostawcy_id(int dostawcy_id) {
        Dostawcy_id = dostawcy_id;
    }

    public int getMagazynierzy_id() {
        return Magazynierzy_id;
    }

    public void setMagazynierzy_id(int magazynierzy_id) {
        Magazynierzy_id = magazynierzy_id;
    }

    public int getKupcy_id() {
        return Kupcy_id;
    }

    public void setKupcy_id(int kupcy_id) {
        Kupcy_id = kupcy_id;
    }

    public int getRodzajeTowarow_id() {
        return RodzajeTowarow_id;
    }

    public void setRodzajeTowarow_id(int rodzajeTowarow_id) {
        RodzajeTowarow_id = rodzajeTowarow_id;
    }

    public Magazynierzy getMagazyn() {
        return magazyn;
    }

    public void setMagazyn(Magazynierzy magazyn) {
        this.magazyn = magazyn;
    }



    public Dokumenty(int dokumentyId, String dokumenty_doMagazTytul) {
        DokumentyId = dokumentyId;
        Dokumenty_doMagazTytul = dokumenty_doMagazTytul;
    }

}
