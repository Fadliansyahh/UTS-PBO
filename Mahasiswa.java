public class Mahasiswa {
    private String nama;
    private String nim;
    private int usia;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, String nim, int usia, String jurusan, double ipk) {
        this.setNama(nama);
        this.setNim(nim);
        this.setUsia(usia);
        this.setJurusan(jurusan);
        this.setIpk(ipk);
    }

    public void setNama(String nama) {
        this.nama = nama;
        
    }

    public void setNim(String nim) {
        this.nim = nim;
        
    }

    public void setUsia(int usia) {
        this.usia = usia;
        
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
        
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
        
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getUsia() {
        return usia;
    }

    public String getJurusan() {
        return jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    public void displayInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
    }

    public String hitungPredikat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungPredikat'");
    }

}