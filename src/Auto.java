public class Auto implements Auto1 , Mercedes {

    //Atributos
   private String marca;
   private String modelo;
   private String placa;
   private String color;
   private String trasmicion;
   private int ano;
   private int rueda;
   
    

      //Getter y Setter de los Atributos
    public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public String getPlaca() {
    return placa;
}

public void setPlaca(String placa) {
    this.placa = placa;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public String getTrasmicion() {
    return trasmicion;
}

public void setTrasmicion(String trasmicion) {
    this.trasmicion = trasmicion;
}

public int getAno() {
    return ano;
}

public void setAno(int ano) {
    this.ano = ano;
}

public int getRueda() {
    return rueda;
}

public void setRueda(int rueda) {
    this.rueda = rueda;
}
     //Contructores de los atributos
    public Auto(String marca, String modelo,String placa, String color, String trasmicion, int ano, int rueda){
     this.marca = marca;
     this.modelo = modelo;
     this.placa = placa;
     this.color = color;
     this.trasmicion = trasmicion;
     this.ano = ano;
     this.rueda = rueda;

    }

     
 public void mostrarInfo(){
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Placa: " + getPlaca());
    System.out.println("Color: " + getColor());
    System.out.println("Transmicion: " + getTrasmicion());
    System.out.println("Año: " + getAno());
    System.out.println("Ruedas: " + getRueda());
 }

   //interfas de Auto2
  @Override
  public String mostrar(){
    String descripcion = "El Buggati Sport puede llegar a correr hasta 500 km/h.";
    return descripcion;
  }
  //interfas de Auto1
@Override
public String mercede() {
    String descripcion = "El mercedes benz AMG es unos de los carros alta gama de esta marca.";
    return descripcion;
}

   
}
