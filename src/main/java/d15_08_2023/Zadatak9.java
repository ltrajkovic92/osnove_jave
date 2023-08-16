package d15_08_2023;

import java.sql.SQLOutput;

public class Zadatak9 {

    public static void main(String[] args) {

        String nazivFajla = "video1018566640.mp4";
        double velicinaFajla = 330, velicinaSkinutogFajla = 132;
        double procenat = (velicinaSkinutogFajla / velicinaFajla) * 100;

        System.out.println(nazivFajla + " " + velicinaFajla + "Mb/" + velicinaSkinutogFajla + "Mb");
        System.out.println("*****************************");
        System.out.println("*********** " + procenat + "%");
        System.out.println("*****************************");

        //Napisati program koji vrsi procentualnu procenu u fazi skidanja fajla.
        // Program od informacija cuva naziv originalnog fajla, velicinu originalnog fajla u Mb (megabajtima) i velicinu skunutog dela fajla takodje u Mb. Na kraju programa racuna i ispisuje koji je deo fajla skinut.Stampanje se vrsi u formatu
        //naziv fajla velicina originalnog fajla Mb/velicina skinutog dela fajla Mb
        //*****************************
        //***********procenat %
        //*****************************
        //Primer izvrsenja:
        //profile-image.png 7Mb/2Mb
        //*****************************
        //*********** 28%
        //*****************************

    }
}
