package qev;

public class JavaQEVExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user="";
		String pass="";
		
		String userDir = System.getProperty("user.dir");
		
		try{
			if (args[0].equals("wls")){
				user=LeerArchivo.dameInfo(userDir + "/properties.cfg","userwls");
				pass=LeerArchivo.dameInfo(userDir + "/properties.cfg","passwls");
			}
			if (args[0].equals("was")){
				//user=LeerArchivo.dameInfo("/home/hacostaj/Documents/Repositorio/develop_wme/shells-archivos/QEVs/properties.cfg","userwas");
				//pass=LeerArchivo.dameInfo("/home/hacostaj/Documents/Repositorio/develop_wme/shells-archivos/QEVs/properties.cfg","passwas");
				
				//System.out.println(user);
				//System.out.println(pass);
				
				user=LeerArchivo.dameInfo(userDir + "/properties.cfg","userwas");
				pass=LeerArchivo.dameInfo(userDir + "/properties.cfg","passwas");
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		if (args[0].equals("wls")){
		EjecutarBash comando = new EjecutarBash(userDir +"/iam_weblogic_extract.pl", user, pass, args[1], args[2]);
		comando.iniciar();
		}
		
		if (args[0].equals("was")){
		EjecutarBash comando = new EjecutarBash(userDir + "/iam_was_extract.sh", user, pass, args[1]);
		comando.iniciar();
		}
		
		if (args[0].equals("oas")){
		EjecutarBash comando = new EjecutarBash(userDir + "./iam_oracle_extract.sh");
		comando.iniciar();
		}

	}

}
