import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

/**
 * Created by chawki on 03/10/16.
 */
public class Menu {
    static Scanner sc = new Scanner(System.in);

    public void affichageMenu() {

        System.out.print("Veuillez donner le nombre de ligne de votre triangle : ");
        int nombre = sc.nextInt();
        /* TODO : tester tous les cas possible avec des exeption ou metre une boucle de controle */
        TriangleEtoile T = new TriangleEtoile(nombre);
        T.affichage();
    }
}
