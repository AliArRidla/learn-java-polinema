package tugasKesebelas.praktikum;

import tugasKedua.praktikum.mahasiswa;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR,memberikan sertifikat cumlaude");
        System.out.println("Selamat! silahkan perkenalan diri anda");

        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-----------------------------------");
    }

    public void nersertifikatMawapres(IBerprestasi mahasiswa) {
        System.out.println("Saya REKTOR,memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! bagaimana anda berprestasi ?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("-----------------------------------");
    }
}
