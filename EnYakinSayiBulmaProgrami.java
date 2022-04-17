
package enyakinsayibulmaprogrami;
import java.util.*;
public class EnYakinSayiBulmaProgrami {

    public static void main(String[] args) {
     
       int[] dizi = {15,12,788,1,-1,-778,2};
       Scanner input = new Scanner(System.in);
       System.out.println("Bir değer giriniz:");
       int sayi = input.nextInt();
       
       int kucukEnYakin = sayi;
       int buyukEnYakin = sayi;
       
       Arrays.sort(dizi);
       
       for(int i=0; i<dizi.length; i++)
       {
           if(sayi < dizi[i])
           {
               kucukEnYakin = dizi[i-1];
               buyukEnYakin = dizi[i];
               break;
           }
       }
       
       System.out.println("Girilen sayıdan küçük en yakın sayı:" + kucukEnYakin);
       System.out.println("Girilen sayıdan büyük en yakın sayı:" + buyukEnYakin);
       
               
       
   
       
    

                
        
    }
    
}