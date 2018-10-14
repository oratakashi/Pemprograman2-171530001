import javax.swing.JOptionPane;

public class GetInputJOptionPane{
    public static void main(String[] args) {
        String nim="", nama="", tempat="", tgllahir="";
        nama = JOptionPane.showInputDialog("Masukan Nama Anda : ");
        nim = JOptionPane.showInputDialog("Masukan NIM Anda : ");
        tempat = JOptionPane.showInputDialog("Masukan Tempat Lahir Anda : ");
        tgllahir = JOptionPane.showInputDialog("Masukan Tgl Lahir Anda : ");
        /*JOptionPane.showMessageDialog(null, "Selamat Datang "+nama);
        JOptionPane.showMessageDialog(null, "NIM : "+nim);
        JOptionPane.showMessageDialog(null, "Tempat Lahir : "+tempat);
        JOptionPane.showMessageDialog(null, "Tgl Lahir : "+tgllahir);*/
        JOptionPane.showMessageDialog(null, "Data Diri \n"+"Nama : "+nama+"\n"+"NIM : "+nim+"\n"+"Tempat Lahir : "+tempat+"\n"+"Tgl Lahir : "+tgllahir);
    }
}