import java.io.*;
public class Login{
	public static void main(String[] args) {
		String nim = "";
		String password = "";
		

		BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			System.out.print("Masukan ID.User = ");
			
			try{
				nim = dataInput.readLine();
			}catch (IOException ex){
				System.out.println("Error " + ex);
			}

			System.out.print("Masukan Password = ");

			try{
				password = dataInput.readLine();
			}catch (IOException ex){
				System.out.println("Error " + ex);
			}

			if (nim.equals("171530003") && password.equals("mahasiswa123") ) {
				System.out.println("Selamat Datang " + nim);
				break;
			}else if (nim.equals("171530003") == false) {
				System.out.println("Id. User Salah");
			}else if (password.equals("mahasiswa123") == false) {
				System.out.println("Password Salah");
			}
		}
	}
}