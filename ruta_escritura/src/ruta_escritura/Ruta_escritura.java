package ruta_escritura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import config.MenuConfiguration;
import config.MenuConfigurationItem;




public class Ruta_escritura {

	public static void main(String[] args) throws Exception {
		
		String server;
		//String managed;
		String revision;
		
		Scanner entrada = new Scanner(System.in);
		Scanner eleccion = new Scanner(System.in);
		
		MenuConfiguration menuCfg = null;
		XStream xstream = null;
		
	    try {
			xstream = new XStream(new DomDriver());
			xstream.processAnnotations(MenuConfiguration.class);
			xstream.processAnnotations(MenuConfigurationItem.class);
			menuCfg = (MenuConfiguration) xstream.fromXML(new BufferedReader(new InputStreamReader(Ruta_escritura.class.getResourceAsStream("/config/menu.xml"))));
			
			for (Object item: menuCfg.getOptions()){
				MenuConfigurationItem menu = (MenuConfigurationItem)item;
				System.out.println(menu.getName());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		int opcion = eleccion.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Ingrese el servidor:");
			server = entrada.nextLine();
			//System.out.println("Ingrese el manejado:");
			//managed = entrada.nextLine();
			System.out.println("Ingrese la revision:");
			revision = entrada.nextLine();
			
	        BufferedWriter escritor = null;
	        try {
	            File archivo_rutas = new File("dist/ruta_escritura/"+server);
	            escritor = new BufferedWriter(new FileWriter(archivo_rutas));
	            escritor.write("server=" + server + "\n");
	            //escritor.write("managed=" + managed + "\n");
	            escritor.write("revision=" + revision + "\n");
	            
	        } catch ( IOException e ) {
	            e.printStackTrace();
	        } finally {
	          if ( escritor != null ) {
	            escritor.close();
	            entrada.close();
	            eleccion.close();
	          }
	        }

			break;
		case 3:
			try{
				String linea;			
				server="";
				revision="";
				final File folder = new File("dist/ruta_escritura/");
				System.out.println(folder.getName());
				for (final File fileEntry : folder.listFiles()) {
			        if (fileEntry.isFile()) {
						BufferedReader buffer = new BufferedReader(new FileReader("dist/ruta_escritura/"+fileEntry.getName()));
						System.out.println("es un archivo "+fileEntry.getName());
						while ((linea = buffer.readLine()) != null) {
							System.out.println("la linea a parsear es: "+linea);
							String[] parseo = linea.split("=");
							System.out.println("El indice es: "+parseo[0]);
							if (parseo[0].equals("server")){
								server = parseo[1];
								System.out.println("El server es: "+server);
							}else{
								revision = parseo[1];
								System.out.println("la revision es: "+revision);
							}						
						}
						
						System.out.println("../shells-archivos/administracion/command-executer/RemoteRunScript.sh" + " prueba.sh " + server);
						ProcessBuilder pb = new ProcessBuilder("../shells-archivos/administracion/command-executer/RemoteRunScript.sh", "prueba.sh", server);
						Process p = pb.start();     // Start the process.
						BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
					    String s;
						while ((s = br.readLine()) != null){
							System.out.println(s);
							p.waitFor();                // Wait for the process to finish.
							
						}
						System.out.println("La salida del comando fue: "+p.exitValue());

			        } else {
			            System.out.println("Final de lectura del contenido");
			        }
			    }
				
				/* Process p = Runtime.getRuntime().exec("ls -aF");
	            BufferedReader br = new BufferedReader(
	                new InputStreamReader(p.getInputStream()));
	            String s;
				while ((s = br.readLine()) != null)
	                System.out.println("line: " + s);
	            p.waitFor();
	            System.out.println ("exit: " + p.exitValue());
	            p.destroy();*/
				
			}catch (IOException e){
				e.printStackTrace();
			}
			break;
		case 4:
			final File folder = new File("dist/ruta_escritura/");
			for (final File fileEntry : folder.listFiles()) {
		        if (fileEntry.isFile()) {
					try {
						BufferedReader buffer = new BufferedReader(new FileReader("dist/ruta_escritura/"+fileEntry.getName()));
						String linea;
						while ((linea = buffer.readLine()) != null) {
							System.out.println(linea);
						}
						
					}catch (IOException e){
						e.printStackTrace();
					}
		        } else {
		            System.out.println("Final de lectura del contenido");
		        }
		    }
			break;
		default:
			System.out.println("opcion por defecto");

		}
				
	}

}
