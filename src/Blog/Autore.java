package Blog;

import Blog.Interface.Scrittore;

public class Autore implements Scrittore {

    //ATTRIBUTI
    private int id;
    private String nome;
    private String cognome;

    //COSTRUTTORE
    public Autore(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    //GETTER & SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return  nome + " " + cognome;
    }

    //METODI
    @Override
    public Articolo scriviArticolo(Articolo articolo) {
        articolo.setAutore(this);
       return articolo;
    }
}
