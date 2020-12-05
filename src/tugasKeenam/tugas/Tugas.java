package tugasKeenam.tugas;

public class Tugas {
public static void main(String[] args) { 
    DaftarGaji pegawai=new DaftarGaji(2);

    Dosen data1=new Dosen("1931710046","Sahira Rana","Surabaya"); 
    pegawai.addPegawai(data1);
    data1.setSKS(20);

    Dosen data2=new Dosen("1931710047","Belinda Tasya","Surabaya"); 
    pegawai.addPegawai(data2);
    data2.setSKS(22);

    System.out.println("==============================================");
    System.out.println(" PEGAWAI ");
    System.out.println("==============================================");
    pegawai.printSemuaGaji();
}
}
