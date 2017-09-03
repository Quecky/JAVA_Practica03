import java.util.Random;
class Practica32
{
        public static void main(String [] args)
        {
                System.out.println(RegresarAleatorio());
                System.out.println(RegresarAleatorio());
                System.out.println(RegresarAleatorio());
        }
        public static int RegresarAleatorio()
        {
                Random Aleatorio = new Random();
                return Aleatorio.nextInt(15)+5;
        }
}
~                                                                                                         
~       
