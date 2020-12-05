package kuis1;

public class tas {
    private int harga;
    private String merk,tipe;

    public tas() {

        }

    public tas(String merk, int harga,String tipe) {
        this.merk = merk;
        this.harga = harga;
        this.tipe = tipe;
      }

    public void setMerk(String merk) {
        this.merk = merk;
       }

    public String getMerk() {
        return merk;
    }

    public void setTipe(String tipe) {
        if (tipe == "A") {
            tipe = "20 Liter";
        } else if (tipe == "B") {
            tipe = "10 Liter";
        } else {
            tipe = "5 Liter";
        }
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void info() {
        System.out.println("Merek tas : " + merk);
        System.out.println("Harga : " + harga);
        if (tipe == "A") {
            tipe = "20 Liter";
            System.out.println("Tipe : " + tipe);
        } else if (tipe == "B") {
            tipe = "10 Liter";
            System.out.println("Tipe : " + tipe);
        } else {
            tipe = "5 Liter";
            System.out.println("Tipe : " + tipe);
        }
        
        print();
    }

    public void print() {
        print();
    }
}
