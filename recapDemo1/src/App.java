public class App {
    public static void main(String[] args) throws Exception {
        int sayi1 = 265;
        int sayi2 = 25;
        int sayi3 = 231;

        int enbuyuk = sayi1;

        if (enbuyuk < sayi2) 
        {
            enbuyuk = sayi2;    
        }
        if (enbuyuk < sayi3)
        {
            enbuyuk = sayi3;    
        }
        System.out.println("en buyuk "+ enbuyuk);
    }
}
