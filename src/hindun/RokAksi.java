/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hindun;

/**
 *
 * @author ACER
 */
public class RokAksi {
    public static void main(String[] args) {
        Rok a = new Rok();
        Rok b = new Rok();
        Rok c = new Rok();
        
        a.Bahan="Jeans";
        a.Merk="Cressida";
        a.Ukuran="L";
        a.Warna="Biru";
        a.Motif="Polos";
        
        b.Bahan="Katun";
        b.Merk="Cardinal";
        b.Ukuran="XL";
        b.Warna="Hitam";
        b.Motif="Batik";
        
        c.Bahan="Satin";
        c.Merk="Nepada";
        c.Ukuran="M";
        c.Warna="Biru";
        c.Motif="Polkadot";
        
        a.tampildata();
        b.tampildata();
        c.tampildata();
    }
}
