package qev;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
   
    public static String dameInfo(String archivo, String tipo) throws Exception {
    	String linea;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((linea = b.readLine())!=null) {
        	System.out.println("la linea a parsear es: "+linea);
			String[] parseo = linea.split(" ");
			System.out.println("El indice es: "+parseo[0]);
			if (parseo[0].equals(tipo)){
				respuesta = SeguridadUtils.descifrar(parseo[1]);
				System.out.println("La respuesta es: "+respuesta);
			}
        }
        b.close();
        f.close();
        return respuesta;
    }
    
    static String respuesta;
    public static void main(String[] args) throws Exception {
        dameInfo("/home/hacostaj/Documents/Repositorio/develop_wme/shells-archivos/QEVs/properties.cfg","pass");
    }
	   
		
}
