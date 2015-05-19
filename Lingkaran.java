/**
 * Created by dindha on 5/19/2015.
 */
public class Lingkaran
{
    int jari;
    int diameter;

    public void CetakKeLayar()
    {
        System.out.println("Jari-Jari: " + jari);
        System.out.println("diameter: " + diameter);

    }

    public  void ubahProperty(int r, int d)
    {
        jari = r;
        diameter = d;

    }

    public double hitungLuas()
    {
        double luas;
        luas = 3.14 * jari * jari;
        return luas;
    }

    public double hitungKeliling()
    {
        double keliling;
        keliling = 3.14 * diameter;
        return keliling;
    }
}
