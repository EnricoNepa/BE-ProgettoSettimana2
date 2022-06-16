package Blog;

import java.time.LocalDate;
import java.util.Date;

public class Articolo {

    //ATTRIBUTI
    private int id;
    private String titolo;
    private LocalDate data = LocalDate.now();
    private String categoria;
    private String testo;
    private Autore autore;
    private Tags tags;


    //COSTRUTTORE
    public Articolo(int id, String titolo, LocalDate data, String categoria, String testo, Autore autore, Tags tags) {
        this.id = id;
        this.titolo = titolo;
        this.data = data;
        this.categoria = categoria;
        this.testo = testo;
        this.autore = autore;
        this.tags = tags;
    }

    public Articolo(int id, String titolo, LocalDate data, String categoria, String testo, Tags tags) {
        this.id = id;
        this.titolo = titolo;
        this.data = data;
        this.categoria = categoria;
        this.testo = testo;
        this.tags = tags;
    }

    //GETTER & SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return  "Articolo: " + titolo + "\n" +
                "Data: " + data + "\n" +
                "Categoria: " + categoria + "\n" +
                "Testo: " + testo + "\n" +
                "Autore: " + autore + "\n" +
                "Tags: " + tags;
    }
}
