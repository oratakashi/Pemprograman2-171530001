public class ExContinueLabel{
	public static void main(String[] args) {
		outeloop:
		for (int i=0;i<5 ;i++ ) {
			for (int j=0;j<5 ;j++ ) {
				//message1
				System.out.println("Inside for(j) loop");
				if (j==2) continue outeloop;
			}
			//message2
			System.out.println("Inside for(i) loop");
		}
	}
}

/* Analisa
	1. Looping berjalan sebanyak 12 kali
	2. baris ke-11 tidak tercetak
	3. jika kondisi if bernilai true maka statement continue label outeloop akan dijalankan jika bernilai false maka akan menjalankan j++
*/