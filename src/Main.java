import Blog.Articolo;
import Blog.Autore;
import Blog.Blog;
import Blog.SottoClassi.ArticoloFantasy;
import Blog.SottoClassi.ArticoloNoir;
import Blog.Tags;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** TAGS **/
        String[] tagGuerra = {"guerra", "ucraina", "morti", "feriti"};
        String[] tagCucina = {"cucina", "italia", "ricette", "mediterranea"};
        String[] tagFantasy = {"magia", "fantasy", "harrypotter", "stregoneria"};
        String[] tagNoir = {"giallo", "londra", "thriller", "investigativo"};
        Tags tagsGuerra = new Tags(tagGuerra);
        Tags tagsCucina = new Tags(tagCucina);
        Tags tagsFantasy = new Tags(tagFantasy);
        Tags tagsNoir = new Tags(tagNoir);

        /** AUTORI **/
        Autore jkrowling = new Autore(1,"J.K.","Rowling");
        Autore malcomblack = new Autore(2,"Malcom","Black");
        Autore carlocracco = new Autore(3,"Carlo","Cracco");
        Autore mariorossi = new Autore(4,"Mario","Rossi");


        /** ARTICOLI **/
        Articolo GuerraUcraina = new Articolo(1,"Guerra in Ucraina", LocalDate.of(2022,06,6),"Guerra","Gli ultimi aggiornamenti sulla guerra in Ucraina",tagsGuerra);
        Articolo CucinaItaliana = new Articolo(2,"Cucina Italiana", LocalDate.of(2020,8,6),"Cucina","Le migliori ricette mediterranee!", tagsCucina);
        Articolo HarryPotter = new ArticoloFantasy(3,"Harry Potter e la pietra filosofale", LocalDate.of(1997,6,26),"Fantasy","Il primo capitolo della saga", jkrowling, tagsFantasy,"L'inizio delle avventure di Harry e i suoi amici!");
        Articolo IlDelitto = new ArticoloNoir(4,"Il Delitto", LocalDate.of(1954,1,19),"Giallo","Il caso a Londra", malcomblack, tagsNoir, "Investigazione e delitti a Londra");

        GuerraUcraina.setAutore(mariorossi);
        CucinaItaliana.setAutore(carlocracco);

        Articolo[] articoliBlog = {GuerraUcraina, CucinaItaliana, HarryPotter, IlDelitto};


        /** BLOG **/
        Blog blog = new Blog(articoliBlog);

        executeBlog(blog);

    }

    public static void executeBlog(Blog blog){
        System.out.println("\nBenvenuto nel Blog!\nPremi 1 per vedere tutti gli Articoli o premi 2 per effettuare la ricerca per ID!\n1) Mostra tutti gli articoli\n2) Ricerca Articolo per ID");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        switch (x){

            case 1: blog.stampaArticoli();
                break;

            case 2: System.out.println("Selezione l'ID del tuo Articolo: "); int y = scanner.nextInt(); if(y > blog.getArticoli().length || y <= 0){ System.out.println("Articolo inesistente!"); }
            else{
                blog.stampaArticoloPerId(y);
            }
                break;

            default: System.out.println("Opzione non valida!");
        }
    }
}
