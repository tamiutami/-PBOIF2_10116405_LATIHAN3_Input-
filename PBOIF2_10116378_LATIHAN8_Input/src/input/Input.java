/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;
import java.util.Scanner;
package Variable;

/**
 *
 *  @author  @author Sri Utami Ningsih
 * Nama  : Sri Utami Ningsih
 * Kelas : PBO-2
 * Nim   : 10116378
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
