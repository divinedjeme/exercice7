import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {


//    instances
    public String nom;
    public Date dateNaissance;
    public double taille;


//    constructeur
    public Personne(String nom, Date dateNaissance, double taille){
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.taille = taille;
    }
    public void afficherElements() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nom: " + nom);
        System.out.println("Date de naissance: " + dateFormat.format(dateNaissance));
        System.out.println("Taille: " + taille);
    }


//    tostring
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Personne [Nom: " + nom + ", Date de naissance: " + dateFormat.format(dateNaissance) + ", Taille: " + taille + "]";
    }
}

