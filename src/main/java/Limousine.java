public class Limousine {

    private String immatriculation;
    private int capaciteReservoir;
    private String couleur;

    public Limousine(String immatriculation, int capaciteReservoir, String couleur) {
        this.immatriculation = immatriculation;
        this.capaciteReservoir = capaciteReservoir;
        this.couleur = couleur;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public int getCapaciteReservoir() {
        return capaciteReservoir;
    }

    public String getCouleur() {
        return couleur;
    }

}
