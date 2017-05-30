package qev;

public class JavaQEVExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user="";
		String pass="";
		
		try{
			user=SeguridadUtils.descifrar("{DES}p91HRPpymJBtDD9f1GUhpw==");
			pass=SeguridadUtils.descifrar("{DES}xyza1erQCNiKxKch42jMrg==");
			System.out.println(SeguridadUtils.descifrar("{DES}p91HRPpymJBtDD9f1GUhpw=="));
			System.out.println(SeguridadUtils.descifrar("{DES}xyza1erQCNiKxKch42jMrg=="));
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println(user + " " + pass);
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
