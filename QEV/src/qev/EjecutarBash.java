package qev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjecutarBash {
	
	private String comando[];
	private String appserver="";
	private String path="";
	private String ip_domain="";
	private String user="";
	private String pass="";
	
	
	public EjecutarBash(String comando, String user, String pass, String path, String ip_domain){
		this.comando = new String[]{comando,"-user",user,"-password",pass,"-weblogicPath",path,"-hostname",ip_domain};
		this.user = user;
		this.pass = pass;
		this.ip_domain = ip_domain;
		this.path = path;
	}
	
	public EjecutarBash(String comando, String user, String pass, String path){
		this.comando = new String[]{comando,"-user",user,"-password",pass,"-wasPath",path};
		this.user = user;
		this.pass = pass;
		this.path = path;
	}
	
	public EjecutarBash(String comando){
		this.comando = new String[]{comando};
	}	
	
	
	
	public void iniciar(){
		try{
			ProcessBuilder pb = new ProcessBuilder(comando);
			Process p = pb.start();     // Start the process.
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    String s;
			while ((s = br.readLine()) != null){
				System.out.println(s);
				//p.waitFor();                // Wait for the process to finish.
				
			}
		}catch (Exception e){
				e.printStackTrace();
		}
	}
}


