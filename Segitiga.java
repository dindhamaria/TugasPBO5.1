/**
 * Created by dindha on 5/19/2015.
 */
public class Segitiga
{
    int alas;
    int tinggi;
    int sisi;

    public void CetakKeLayar()
    {
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi: " + sisi);

    }

    public  void ubahProperty(int a, int b, int c)
    {
        alas = a;
        tinggi = b;
        sisi = c;
    }

    public double hitungLuas()
    {
        double luas;
        luas = ((0.5) * alas * tinggi);
        return luas;
    }

    public int hitungKeliling()
    {
        int keliling;
        keliling = (sisi + sisi + sisi);
        return keliling;
    }
}
