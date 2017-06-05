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
			String[] parseo = linea.split(" ");
			if (parseo[0].equals(tipo)){
				respuesta = SeguridadUtils.descifrar(parseo[1]);
			}
        }
        b.close();
        f.close();
        return respuesta;
    }
    
    static String respuesta;
    		
}
