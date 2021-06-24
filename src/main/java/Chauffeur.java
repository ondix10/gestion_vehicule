public class Chauffeur {

    private String idChauffeur;
    private String nom;
    private String prenom;
    private String anneeEmbauche;
    private String adresse;


    public Chauffeur(String idChauffeur, String nom, String prenom, String anneeEmbauche, String adresse) {
        this.idChauffeur = idChauffeur;
        this.nom = nom;
        this.prenom = prenom;
        this.anneeEmbauche = anneeEmbauche;
        this.adresse = adresse;
    }

    public String getIdChauffeur() {
        return idChauffeur;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAnneeEmbauche() {
        return anneeEmbauche;
    }

    public String getAdresse() {
        return adresse;
    }
}
