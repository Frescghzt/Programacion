package trabajo;

public class tienda {
    public static void main(String[] args) {
        //tienda
        int shirt = 25 , pants = 30 ;
        double firstDiscount = 0.85 , secondDiscount = 0.95;
    
        //priemer total
        double firstTotal = (double) shirt * firstDiscount + pants * firstDiscount;
        System.out.println("El precio de una camiseta y un pantalon con el descuento es de: " + firstTotal);
    
        //segundo total
        double secondTotal = (double) shirt * 2 * firstDiscount * secondDiscount + pants * firstDiscount;
        System.out.println("el precio de 2 camisetas y un pantalon con el descuento es de: " + secondTotal);



        }

    

}
