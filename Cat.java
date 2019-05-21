public class Cat {
       String nombre; 
       String color;
       int    edad;
       int    peso;
       
       public String talk() {
                return "miau";
       }


       public void eat(String food){
              System.out.println("El gato va a comer: " + food);
              System.out.println(toString());
       } 


       public String toString(){
              return "El gato se llama: " + nombre
                     + "y es de color: " + color;
      }

       public static void main(String[] args) {
               Cat gato = new Cat();
               gato.nombre = args[0];
               gato.color = args[1];
               gato.peso = Integer.parseInt(args[2]);

               if(gato.peso < 500) {
                     System.out.println("El gato pasa a la sala de cuidados especiales");
                }
              if (gato.color.equals("negro")){
                     System.out.println("El gato es timido,tranquilo, intuitivo y cariñoso");
              } else {
                     System.out.println("El color del gato indica su personalidad");
                      }
       }
 }

       //Asignar valores a variables
       //Imprimir los atriutos de Rayo
       //System.out.println(Rayo.talk());


