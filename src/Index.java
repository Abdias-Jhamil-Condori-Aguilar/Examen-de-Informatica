import java.util.Date;

public class Index {
    Boolean hash;
    Integer tamaño;
    Date fecha;
    Documento documentos;
    public Index(){

    }

    public Index(Boolean hash, Integer tamaño, Date fecha, Documento documentos) {
        this.hash = hash;
        this.tamaño = tamaño;
        this.fecha = fecha;
        this.documentos = documentos;
    }
}
