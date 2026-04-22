public class CamionDeReparto extends Transporte {
    private boolean tieneRefrigeracion;

    public CamionDeReparto(String id, double combustible, double capacidad, boolean tieneRefrigeracion) {
        super(id, combustible, capacidad);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public void viajar(int distancia) {
        double consumo;

        if (tieneRefrigeracion) {
            consumo = (distancia / 10.0) * 2; // doble consumo
        } else {
            consumo = distancia / 10.0;
        }

        double nuevoCombustible = getCombustible() - consumo;
        if (nuevoCombustible < 0) nuevoCombustible = 0;

        setCombustible(nuevoCombustible);
    }
}
