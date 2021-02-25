package stiva;

import java.util.Scanner;
/**
 *
 * @author boral
 */
class Operatii {
    
    static  int max=100;
    static int[] a= new int[max];
    static int vf;//varful stivei
    
    public Operatii(int n){
        int opt;
        
        this.vf=0;
        do{
            System.out.println("1. Adaugare unui element in stiva");
            System.out.println("2. Stergerea unui element in stiva");
            System.out.println("3. Afisare stiva");
            System.out.println("4. Exit");
            
            System.out.println("Dati optiunea dorita");
            
            Scanner input = new Scanner(System.in);
            opt=input.nextInt();
            
            if(opt==1) adaugare();
            if(opt==2) stergere();
            if(opt==3) afisare();
            
        }while(opt!=4);
    }
    
    private static void adaugare()
    {
        int val;
        
        if(vf==max) System.out.println("Stiva este plina");
        else{
            System.out.println("Dati valoarea de adaugare");
            Scanner input = new Scanner(System.in);
            val = input.nextInt();
            
            vf++;//se incrementeaza varful stivei
            a[vf] = val;// valoarea de adaugare se pune in varful stivei
        }
    }
    
    private static void stergere(){
        
        int e;
        if(vf == 0) System.out.println("Stiva este goala");
        else{
            e=a[vf];//valoarea din varful stivei se depune in e
            vf--;//varful stivei se scade cu o unitate
            
            System.out.println("Valoarea stearsa este "+e);
        }
    }
    
    private static void afisare()
    {
        int i;
        
        if(vf == 0) System.out.println("Stiva este vida !");
        else{
            
            System.out.println("Stiva este: ");
            
            for(i=vf; i>=1;i--)
            {
                System.out.println(a[i]);
            }
        }
    }
}
