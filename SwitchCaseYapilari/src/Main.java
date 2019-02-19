
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berkay
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Lürfen bir işlem giriniz:");
        Scanner scanner=new Scanner(System.in);
        int islem=scanner.nextInt();
        
        switch(islem){
            case 1:
               System.out.println("1.İslem");
               break;
            case 2:
               System.out.println("2.islem");
               break;
            case 3:
                System.out.println("3.İslem");
                break;
            default:
                System.err.println("Hatalı işlem yaptınız..");
                break;
        }
            
        
        
        
    }
    

}
