public class Jarra { //atributos
 private int cantidad;
 private int capacidad;
 //constructor
 public Jarra(int capacidadInicial){
 if(capacidadInicial<=0){
 throw new RuntimeException("ERROR: no se pueden crear jarras
 con capacidad menor o igual que cero.");
 }
 this.capacidad=capacidadInicial;
 }
 // metodos
 // 1
 // 2
 // 3
}
public String toString(){
return("("+this.capacidad+","+this.cantidad+")");
}

 public void metodoComunitario(){
 // Comentario incluido para pruebas
 System.out.println("Juan Carlos Vergara Ruz - 2");
 }