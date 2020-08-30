
import java.util.Scanner;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         TODO code application logic here

//        Persona pe = new Persona("William", 25,"M",15,1.75);
//        System.out.println(pe.toString());

        Scanner sc = new Scanner(System.in);
        System.out.println("ESCRIBA SU NOMBRE");
        String nombre = sc.nextLine();
        System.out.println("ESCRIBA SU EDAD");
        int edad = sc.nextInt();
        System.out.println("ESCRIBA SU GENERO");
        String sexo = sc.nextLine();
        System.out.println("ESCRIBA SU PESO");
        double peso = sc.nextDouble();
        System.out.println("ESCRIBA SU ALTURA");
        double altura = sc.nextDouble();
        
        Persona pl = new Persona(nombre,edad,sexo,peso,altura);
        System.out.println(pl.toString());
        System.out.println(pl.esMayor());
        
        
        Persona pll = new Persona(pl.getNombre(),pl.getEdad(),pl.getSexo());
        System.out.println(pll.toString());
        System.out.println(pll.esMayor());
              
        Persona plll = new Persona();
        plll.setNombre(nombre);
        plll.setEdad(edad);
        plll.setSexo(sexo);
        plll.setPeso(peso);
        plll.setAltura(altura);
        System.out.println(plll.toString());
        System.out.println(plll.esMayor());



    }

}
