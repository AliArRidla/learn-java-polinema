package tugasKeenam.tugas;

public class DaftarGaji {
    public Pegawai listPegawai[];
    public int a = 0;

DaftarGaji(int listPegawai){
this.listPegawai=new Pegawai[listPegawai]; }

public void addPegawai(Pegawai listPegawai){ this.listPegawai[a]=listPegawai;
    a++;
}

public void printSemuaGaji(){
    for(int i=0; i<this.listPegawai.length ; i++){
        System.out.println((i + 1) + " NIP : " + listPegawai[i].nip);
        System.out.println("NAMA : "+listPegawai[i].nama);
        System.out.println("ALAMAT :"+listPegawai[i].alamat);
        System.out.println("GAJI : " + listPegawai[i].getGaji());
System.out.println("============================================== ");
} }
}
