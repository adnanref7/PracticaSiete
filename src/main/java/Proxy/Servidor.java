package Proxy;

public class Servidor implements IServidor {

    CargayDescarga cargayDescarga;
    public Servidor(CargayDescarga cargaydescarga){
        this.cargayDescarga= cargaydescarga;
    }
    @Override
    public void verificarFormato() {
        System.out.println("Transfiriendo archivo "+this.cargayDescarga.getExtension());
    }
}
