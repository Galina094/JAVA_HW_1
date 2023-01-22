// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

import java.util.Scanner;

public class HW1_Task2 {

    static int NumBit(int n){

        int rez =0;
        while (n!=1) {           
            n=n-1;
            int ost=n%2;
            if (ost==0) {
                int bit=n;
                while (bit!=1) {
                    bit=bit/2;
                    if (bit==1) {                        
                        rez = n;                        
                    }
                    if (bit%2!=0) {
                        break;                        
                    } 
                }
            } else {
                continue;                
            }
            if (rez>0) {
                break;
            }                                 
        }
        return n;
    }

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter yor number: ");
        Integer name = iScanner.nextInt();
        iScanner.close();
        
        System.out.printf("Answer: " + NumBit(name)); 
    }    
}

