import java.util.List;

public class Tema {
    String titulo;
    List<Tema> subtema;
    public Tema(){

    }

    public Tema(String titulo, List<Tema> subtema) {
        this.titulo = titulo;
        this.subtema = subtema;
    }
}
