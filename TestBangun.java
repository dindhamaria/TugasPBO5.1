public class TestBangun
{
    public static void main(String[] args)
    {
        Segitiga bangun1 = new Segitiga();

        bangun1.alas = 20;
        bangun1.tinggi = 15;
        bangun1.sisi = 20;

        bangun1.CetakKeLayar();

        Lingkaran bangun2 = new Lingkaran();

        bangun2.jari= 14;
        bangun2.diameter= 20;

        bangun2.CetakKeLayar();

        System.out.println("Luas Segitiga: " + bangun1.hitungLuas());
        System.out.println("Keliling Segitiga: " + bangun1.hitungKeliling());

        System.out.println("Luas Lingkaran: " + bangun2.hitungLuas());
        System.out.println("Keliling Lingkaran: " + bangun2.hitungKeliling());




    }
}
