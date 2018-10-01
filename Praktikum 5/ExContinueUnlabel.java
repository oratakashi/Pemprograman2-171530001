public class ExContinueUnlabel{
	public static void main(String[] args) {
		String names[] = {"Beah", "Bianca", "Lance", "Beah"};
		int count=0;

		for (int i=0;i<names.length;i++ ) {
			if (!names[i].equals("Beah")) {
				continue; //skip
			}
			count++;
		}

		System.out.println("There are " + count + " Beahs in the list");
	}
}

/* Analisa
	1. Looping berjalan sebanyak 4 kali
	2. jika konsisi if bernilai true maka statement continue akan dijalankan jika tidak maka akan mengeksekusi count++
*/