


 public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;
    
    public Transporte (String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        setCombustible(combustible);
        setCapacidadCarga(capacidadCarga);
    }

    public void setCapacidadCarga(double capacidadCarga) {
        if (capacidadCarga < 0) {
            this.capacidadCarga = 0;
        }
        else {
            this.capacidadCarga = capacidadCarga;
        }
    }
    

    public void setIdTransporte(String idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public double getCombustible() {
        return combustible;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCombustible( double nivel){
        if (nivel < 0) {
            this.combustible = 0;
        }
        else if (nivel > 100) {
            this.combustible = 100;
        }
        else {
            this.combustible = nivel;
        }
    }
    public void viajar (int distancia){
        double consumo = distancia / 10.0;
        combustible -= consumo;

        if (combustible < 0) {
            combustible = 0;
        }
    }
 }