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
