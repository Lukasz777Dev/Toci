package com.example.demospringhibernate.magazynierzy;

import com.example.demospringhibernate.magazynierzy.model.Magazynierzy;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;


public class Comment {
    /*@Entity
    @Table(name = "Dokumenty")*/
    @Id
    @Column
    private int DokumentyId;
    private String Dokumenty_doMagazTytul;
@ManyToMany(fetch = FetchType.LAZY)
private Magazynierzy magazyn;

    public Comment(int dokumentyId, String dokumenty_doMagazTytul) {
        DokumentyId = dokumentyId;
        Dokumenty_doMagazTytul = dokumenty_doMagazTytul;
    }




}
