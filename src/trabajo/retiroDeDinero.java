package trabajo;

public class retiroDeDinero {
    public static void main(String[] args) {
        //retiro de dinero
       
        //suponiendo que el mes tiene 4 semanas
        int initialMoney = 1000 , retreat = 200, weak = 4;

        int surplusMoney = initialMoney - (retreat*weak);
        //imprimimos el resultado
        System.out.println("su dinero resultante es de: "+surplusMoney);
    }

}
