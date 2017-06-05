package qev;

public class JavaQEVExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user="";
		String pass="";
		
		try{
			user=LeerArchivo.dameInfo("/home/hacostaj/Documents/Repositorio/develop_wme/shells-archivos/QEVs/properties.cfg","user");
			pass=LeerArchivo.dameInfo("/home/hacostaj/Documents/Repositorio/develop_wme/shells-archivos/QEVs/properties.cfg","pass");
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		//System.out.println(user + " " + pass);
		if (args[0].equals("wls")){
		EjecutarBash comando = new EjecutarBash("./iam_weblogic_extract.pl", user, pass, args[1], args[2]);
		comando.iniciar();
		}
		
		if (args[0].equals("was")){
		EjecutarBash comando = new EjecutarBash("./iam_was_extract.sh", user, pass, args[1]);
		comando.iniciar();
		}
		
		if (args[0].equals("oas")){
		EjecutarBash comando = new EjecutarBash("./iam_oracle_extract.sh");
		comando.iniciar();
		}

	}

}
