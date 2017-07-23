//Muestra el primer argumento ingresado por el usuario al ejecutar.
import java.io.*;
public class args_v1 
{ 
	public static void main(String... args) throws FileNotFoundException, IOException, NullPointerException {
		System.out.println("args[0]: "+args[0].toString());
		System.out.println("args[1]: "+args[1].toString());
		System.out.println("args[2]: "+args[2].toString());
		integrar(args[0]);
	}
	public static void integrar(String integrar) throws FileNotFoundException, IOException, NullPointerException {
		System.out.println("Dentro de funcion, integrar (solo primer arg): "+ integrar);
	}
}

/*
**
**Ahora agregamos un comentario al final del archivo
**
**
*/