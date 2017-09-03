
public class Practica3l
{
        public static void main(String[] args)
        {
                String mensaje = "Divide y venceras";

                System.out.println("Longitud de mensaje: "+mensaje.length());
                //otra forma de crear un objeto tipo String con constructor
                String mensaje2 = new String("Y los que vamos a morir te saludamos");
                String mensaje3= mensaje.concat(mensaje2);

                int IndiceSeparador=mensaje3.indexOf(mensaje2); //guarda el indice de donde empieza la segunda cadena

                char [] caracteres=mensaje3.toCharArray();
                StringBuffer  nuevo=new StringBuffer();


                for(int i=0;i<mensaje3.length();i++)
                {
                        nuevo.append(caracteres[i]);
                        if(i==IndiceSeparador-1)
                        {
                                nuevo.append("-");
                        }
                }
                System.out.println(nuevo);
          
                System.out.println("Mensaje en mayusculas: "+nuevo.toString().toUpperCase());
          
                System.out.println("Mensaje en arrays: "+nuevo.toString().toCharArray());
                char [] nuevoArray=nuevo.toString().toCharArray();
                for(int i=0;i<nuevo.length();i++)
                {
                        System.out.println("nuevo["+i+"]="+nuevoArray[i]);
                }

                StringBuffer MensajeInverso = new StringBuffer();
                for(int i=nuevo.toString().length()-1;i>=0;i--)
                {
                        MensajeInverso.append(nuevoArray[i]);
                }       
                System.out.println("Mensaje inverso: "+MensajeInverso);
                StringBuffer ObjetoStringBuffer = new StringBuffer(MensajeInverso);
          
        //Otra forma de disfrutar de los atributos de la clase String sin crear una variable de tipo String 
          //inicializandola o usando su constructor es usando toString en cualquier otra variable e inmediatamente 
          //se podran usar los metodos de la clase String                                                              
        }
