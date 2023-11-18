public class CincoDigitos {

	public static void main (String[] args) {

		for (int j=0;j<10;j++){
			for (int i=0;i<10;i++) {
				for (int k=0;k<10;k++){
					for (int n=0;n<10;n++){
						for (int m=0;m<10;m++){
							if (j==3) {
								System.out.print ('E' + " "+ i + " " + k  + " " + n  + " " + m  + " ");
								System.out.println ();
							}
							if (i==3) {
								System.out.print (j + " "+ 'E' + " " + k  + " " + n  + " " + m  + " ");
								System.out.println ();
							}
							if (k==3) {
								System.out.print (j + " "+ i + " " + 'E'  + " " + n  + " " + m  + " ");
								System.out.println ();
							}
							if (n==3) {
								System.out.print (j + " "+ i + " " + k  + " " + 'E'  + " " + m  + " ");
								System.out.println ();
							}
							if (m==3) {
								System.out.print (j + " "+ i + " " + k  + " " + n  + " " + 'E'  + " ");
								System.out.println ();
							}
							else {
								System.out.print (j + " "+ i + " " + k  + " " + n  + " " + m  + " ");
								System.out.println ();
							}
							
						}
						System.out.println ();
					}
					System.out.println ();
				}
				System.out.println ();	
			}
			System.out.println ();
		}
		System.out.println ();		
	}
}
