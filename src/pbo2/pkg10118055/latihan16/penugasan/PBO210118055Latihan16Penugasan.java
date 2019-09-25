/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan16.penugasan;

/**
 *
 *@author User
 * NAMA:REZA PRATAMA
 * KELAS:PBO2
 * NIM:10118055
 * Deskripsi:program ini berisi program untuk menampilkan
 * jenis jenis data bilangan bulat
 */
public class PBO210118055Latihan16Penugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a=10;
       int b=20;
       int c=0;
       
       System.out.println("nilai a ="+a);
       System.out.println("nilai b ="+b);
       System.out.println("nilai c ="+c+"\n");
       c = a+b;   
       System.out.println("c = a+b ="+c);
       c+=a;
       System.out.println("c += a ="+c);
       c-=a;
       System.out.println("c -= a ="+c);
       c*=a;
       System.out.println("c *= a ="+c);
       a=10;
       c=15;
       c/=a;
       System.out.println("c /= a ="+c);
       a=10;
       c=15;
       c%=a;
       System.out.println("c %= a ="+c);
       c<<=2;
       System.out.println("c <<=2 ="+c);
       c>>=2;
       System.out.println("c >>= 2="+c);
       c>>=2;
       System.out.println("c >>= a="+c);
       c&=a;
        System.out.println("c &= 2="+c);
       c^=a;
        System.out.println("c ^= a="+c);
        c|=a;
         System.out.println("c |= a="+c);
    }
    
}
