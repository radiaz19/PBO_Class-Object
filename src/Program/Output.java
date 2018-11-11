package program;

public class Output extends Mahasiswa{
    
    public void tampilData() {
        if (Mahasiswas.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            
            System.out.println("-------------------------");
            int counter = 1;
            for (Mahasiswa mahasiswa : Mahasiswas) {
                System.out.println("Data ke-" + counter);
                System.out.println("NIM : " + mahasiswa.getNim());
                System.out.println("Nama: " + mahasiswa.getNama());
                System.out.println("IPK : " + mahasiswa.getIpk());
                counter++;
            }
        }
    }
}
