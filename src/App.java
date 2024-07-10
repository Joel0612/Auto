public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dealer de Autos alta gama!");

        Auto auto = new Auto("Mercedes Benz","AMG", "A2834-09",null, "Trasera", 2024, 4);
        Auto auto2 = new Auto("Buggati", "Sport", "A3744-7", null, "Trasera", 2024, 4);
          //Imprimir auto 1
         System.out.println("Auto 1");
        auto.mostrarInfo();
        System.out.println(auto.mercede());

        //imprimir auto 2

        
        System.out.println("Auto 2");
        auto2.mostrarInfo();
        System.out.println(auto2.mostrar());
    }
}
