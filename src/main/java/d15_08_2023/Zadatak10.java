package d15_08_2023;

public class Zadatak10 {

    public static void main(String[] args) {

        String file = "synaptics_touchpad_driver.exe";
        int size = 15, downSpeed = 5, estimatedTime = 0;
        estimatedTime = size / downSpeed;

        System.out.println("File: " + file);
        System.out.println("Size: " + size + "Mb");
        System.out.println("Download speed: " + downSpeed + "Mb/s");
        System.out.println("Estimated time: " + estimatedTime + "s");


        //10.	Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se skine fajl.
        // Program od informacija cuva naziv fajla, velicinu fajla i brzinu skidanja.
        // Velicina fajla je u Mb a brzina skidana u Mb/s (megabajt u sekundi)
        //Primer izvrsenja
        //File: profile-image.log
        //Size: 25Mb
        //Download speed: 3Mb/s
        //Estimated time: 8s
    }
}
