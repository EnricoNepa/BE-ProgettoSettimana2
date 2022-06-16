package Blog.SottoClassi;

import Blog.Articolo;
import Blog.Autore;
import Blog.Tags;

import java.time.LocalDate;

public class ArticoloFantasy extends Articolo {

    //ATTRIBUTI
    private String descrizione;

    //COSTRUTTORE

    public ArticoloFantasy(int id, String titolo, LocalDate data, String categoria, String testo, Autore autore, Tags tags, String descrizione) {
        super(id, titolo, data, categoria, testo, autore, tags);
        this.descrizione = descrizione;
    }
}
