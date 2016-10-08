/**
 * Created by chawki on 03/10/16.
 */
public class TriangleEtoile {
    private int nombreLine;
    private int espace;
    private String etoile = "";

    public TriangleEtoile(int x) {
        nombreLine = x;
    }

    public void affichage() {
        for (int i = 0; i < nombreLine; i++) {
            espace = nombreLine - i;
            for (int j = 0; j < espace; j++) {
                System.out.print(" ");
            }
            etoile = etoile + " *";
            System.out.print(etoile + "\n");

        }
    }
}
/* ton programme est juste sauf que cr¦er une classe pour chaque partie n'est pas une bonne conception je veux dire que un triangle peut etre vu comme une classe qui aura pour methode dessiner_triangle () sinon c'est T Bien*/

