public class MahasiswaAksi {
    public static void main(String[] args) {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Fadli", "2210010507", 21, "Teknik Informatika", 3.75);
        Mahasiswa mahasiswa2 = new Mahasiswa("Gege", "2210010500", 22, "Sistem Informasi", 3.85);
        Mahasiswa mahasiswa3 = new Mahasiswa("Lisa", "2210010584", 20, "Teknik Informatika", 3.95);

       
        mahasiswa1.setNama("Fadli");
        mahasiswa1.setNim("2210010507");
        mahasiswa1.setUsia(21);
        mahasiswa1.setJurusan("Teknik Informatika");
        mahasiswa1.setIpk(3.75);
        
        System.out.println("Informasi Mahasiswa:");
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("NIM: " + mahasiswa1.getNim());
        System.out.println("Usia: " + mahasiswa1.getUsia());
        System.out.println("Jurusan: " + mahasiswa1.getJurusan());
        System.out.println("IPK: " + mahasiswa1.getIpk());
        
    }

}
