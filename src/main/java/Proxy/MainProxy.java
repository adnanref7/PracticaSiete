package Proxy;

public class MainProxy {

    public static void main (String [] args){
        IServidor proxy1 = new Proxy(new CargayDescarga("Halsey_nightmare.rar"));
        IServidor proxy2 = new Proxy(new CargayDescarga("perritosbailando9382974.jgp"));
        IServidor proxy3 = new Proxy(new CargayDescarga("gatos_jugando.zip"));
        
        proxy1.verificarFormato();        
        proxy2.verificarFormato();
        proxy3.verificarFormato();
        
        
    }
}

