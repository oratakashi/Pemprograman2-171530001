import java.io.*;

public class CaseLogin{
    public static void main(String[] args) throws IOException{
        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
        String id_user, password;
        boolean status = true;

        do{
            System.out.print("Masukan ID. User : ");
            id_user = dataInput.readLine();

            System.out.print("Masukan Password : ");
            password = dataInput.readLine();

            if(!id_user.equals("171530001")){
                System.out.println("ID User anda salah");
            }else{
                if(!password.equals("mahasiswa123")){
                    System.out.println("ID User anda salah");
                }else{
                    status = false;
                }
            }
        }while(status);

        System.out.println("Selamat Datang : "+id_user);
    }
}