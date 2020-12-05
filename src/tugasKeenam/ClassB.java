package tugasKeenam;

public class ClassB extends ClassA{
    public int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("nilai Z : " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah : " + (x + y + z));
    }
}

// public int z;

// public void getNilaiZ(){
// System.out.println("nilai z:" + z);
// }

// public void getJumlah() {
// System.out.println("jumlah :" + (x+y+z));
// }