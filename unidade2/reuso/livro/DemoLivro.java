package unidade2.reuso.livro;

public class DemoLivro {
    public static void main(String[] args){
        Livro l = new Livro("O Dono", "Tom Iwn");

        LivroLivraria ll = new LivroLivraria("O Dono", "Ton Iwn", 3, 150.00F);

        LivroBiblioteca lb = new LivroBiblioteca("O Dono", "Tom Iwn", 5, "Prateleira 3, fileira D");

        System.out.println(l);
        System.out.println(ll);
        System.out.println(lb);
    }
}
