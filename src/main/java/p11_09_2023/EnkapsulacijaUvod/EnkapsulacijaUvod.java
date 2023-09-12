package p11_09_2023.EnkapsulacijaUvod;

public class EnkapsulacijaUvod {
    public static void main(String[] args) {

        User m = new User();
        m.setIme("Dusan");
        m.setEmail("dusan@gmail.com");
        m.setStarost(28);

        User n = new User("Nikola", "nikola@gmail.com", 30);

        m.stampaj();
        System.out.println();
        n.stampaj();

    }
}
