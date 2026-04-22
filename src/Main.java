
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CamionDeReparto camion = new CamionDeReparto("C1", 50, 200,true);
        BuqueCarga buque = new BuqueCarga("B1", 80, 1000, 50);

        camion.setCombustible(-20);
        System.out.println("Combustible del camión: " + camion.getCombustible());

        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);

        for (Transporte t : flota) {
            t.viajar(100);
            System.out.println("Combustible restante de " + t.getIdTransporte() + ": " + t.getCombustible());
        }
        buque.atracarEnPuerto();
        buque.mostrarDatos();
    }
}
