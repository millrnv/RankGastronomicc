import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class RankGastronomic {



    public static void main(String[] args) {



    }


    //En base a los tipos de comida que quiera el usuario, te mostrara los restaurantes
    class TiposDeComida {


        //Aquí hacemos el menu para que el usuario elija con una opcion el menú que prefiera
        public void MenuGeneral() {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Hola, te damos la bienvenida a RankGastronomic!");

            while (true) {
                System.out.println("--------------------------------------------------");
                System.out.println("1) Sushi. ");
                System.out.println("2) Pizza. ");
                System.out.println("3) Comida Rápida. ");
                System.out.println("4) Comida Casera. ");
                System.out.println("5) Comida China. ");
                System.out.println("6) Comida Japonesa. ");
                System.out.println("7) Salir. ");
                System.out.println("--------------------------------------------------");
                System.out.print("Digite la opción de su preferencia: ");

                int opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {

                    case 1:
                        //mostrar restaurantes de Sushi
                        break;

                    case 2:
                        //mostrar restaurantes de pizza
                        break;

                    case 3:
                        //mostrar restaurantes de comida rapida
                        break;

                    case 4:
                        //mostrar restaurantes de comida casera
                        break;

                    case 5:
                        //mostrar restaurantes de comida china
                        break;

                    case 6:
                        //mostrar restaurantes de comida japonesas
                        break;

                    case 7:
                        System.out.println("Hasta luego!! ");
                        return;

                    default:
                        System.out.println("La opción es inválida, por favor elija una opción válida. ");

                }
            }
        }


    }



    //Clase restaurante que nos dirá todos los datos de los restaurantes
    class Restaurante{

        private List<String> rSushi;
        private List<String> rPizza;
        private List<String> rComidaRapida;
        private List<String> rComidaCasera;
        private List<String> rComidaChina;
        private List<String> rComidaJaponesa;

        private String nombre;
        private String ubicacion;
        private List<menuComida> menu;
        private List<Reseña> reseñas;




        public void mostrarRestaurantes(){

        }




        //Nos muestra los menus que ofrecen los restaurantes
        class menuComida{

            private String nombrePlato;
            private String descripcionPlato;
            private double precio;



        }








    }




    class Usuario{

        private String nombreUsuario;
        private String correoElectronico;




        public void buscarRestaurantes(){



        }


        public void hacerPedido(){



        }

        public void dejarReseñas(){


        }

        public void dejarCalificacion(){


        }





    }

    class Reseña{
        private int calificacion;
        private String comentario;
        private Usuario usuario;
        private LocalDate fechaReseña;





        public String obtenerUsuario(){
            return


        }


        public String obtenerReseña(){
            return
        }




        public String obtenerCalificacion(){
            return

        }

        public Date obtenerFechaReseña(){
            return

        }

        public void mostrarReseña(){



        }




    }
    
}