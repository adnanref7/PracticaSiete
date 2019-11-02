package Proxy;

public class Proxy implements IServidor {
    private CargayDescarga cargaydescarga;
    private Servidor servidor = null;

    public Proxy (CargayDescarga request){
        this.cargaydescarga= request;

    }

    @Override
    public void verificarFormato() {

        if (servidor == null)
            servidor = new Servidor(cargaydescarga);
        if (cargaydescarga.getExtension().contains(".rar") || cargaydescarga.getExtension().contains(".zip")) {
            this.servidor.verificarFormato();
        }else{
            System.out.println("el archivo no se pudo encontrar.");
        }
    }
}
