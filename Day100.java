package day100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day100 {
    public static void main(String[] args) throws IOException{
    InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        
        System.out.println("Nama : ");
        String nama = br.readLine();
        
        System.out.println("Prodi : ");
        String prodi = br.readLine();
        
        System.out.println("Fakultas : ");
        String fakultas = br.readLine();
        
        System.out.println("Universitas : ");
        String universitas = br.readLine();
        
        br.close();
    
    }
    
}
