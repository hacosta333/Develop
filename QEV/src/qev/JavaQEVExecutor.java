package qev;

public class JavaQEVExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user="";
		String pass="";
		
		String userDir = System.getProperty("user.dir");
		
		try{
			
			user=LeerArchivo.dameInfo(userDir + "/properties.cfg","user");
			pass=LeerArchivo.dameInfo(userDir + "/properties.cfg","pass");
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		if (args[0].equals("wls")){
		EjecutarBash comando = new EjecutarBash(userDir +"/iam_weblogic_extract.pl", user, pass, args[1], args[2]);
		comando.iniciar();
		}
		
		if (args[0].equals("was")){
		EjecutarBash comando = new EjecutarBash(userDir + "./iam_was_extract.sh", user, pass, args[1]);
		comando.iniciar();
		}
		
		if (args[0].equals("oas")){
		EjecutarBash comando = new EjecutarBash(userDir + "./iam_oracle_extract.sh");
		comando.iniciar();
		}

	}

}
