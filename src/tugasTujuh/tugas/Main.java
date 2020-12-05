package tugasTujuh.tugas;

public class Main {
    public static void main(String[] args) {
        PC PC = new PC("Apple iMac Pro", 3, 32, "Intel 10 Core", 14);
        PC.tampilPc();
        System.out.println("");
        Mac Mac = new Mac("Apple Macbook Pro 13", 2, 16, "Intel Core i5", "Baterai lithium-polymer",
                "Sophos Home for MAC");
        Mac.tampilMac();
        System.out.println("");
        Windows win = new Windows("Acer Aspire ES1-131", 2, 4, "Intel Celeron N3050", "Lithium Ion (Li-Ion)",
                "Find My Device");
        win.tampilWindows();
        System.out.println("");
    }
}