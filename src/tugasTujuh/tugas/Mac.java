package tugasTujuh.tugas;

public class Mac extends Laptop {
    public String security;

    public Mac() {
    }

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }

    public void tampilMac() {
        System.out.println("====================== MAC ======================");
        super.tampilLaptop();
        System.out.println("Security \t\t: " + security);
    }
}