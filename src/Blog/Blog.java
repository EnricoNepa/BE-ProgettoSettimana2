package Blog;

public class Blog {

    //ATTRIBUTI
    private Articolo[] articoli;

    //COSTRUTTORE
    public Blog(Articolo[] articoli) {
        this.articoli = articoli;
    }

    //GETTER & SETTER
    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }

    //METODI
    public void stampaArticoloPerId(int id){
        for (int i =0; i < articoli.length; i++){
            if (articoli[i].getId() == id){
                System.out.println("\n -- Articolo " + (i+1) + " --" + "\nTitolo: " + articoli[i].getTitolo() + "\nCategoria: " + articoli[i].getCategoria() + "\nAutore: " + articoli[i].getAutore() + "\nCategoria: " + articoli[i].getCategoria() + "\nDescrizione: " + articoli[i].getTesto());

            }
        }
    }

    public void stampaArticoli(){
        for (int i = 0; i < articoli.length; i++){
            System.out.println("\n -- Articolo " + (i+1) + " --" + "\nTitolo: " + articoli[i].getTitolo() + "\nCategoria: " + articoli[i].getCategoria() + "\nAutore: " + articoli[i].getAutore() + "\nCategoria: " + articoli[i].getCategoria() + "\nDescrizione: " + articoli[i].getTesto());
        }
    }
}
