
//Salah
	public static void main(String [] args){
		byte[] b = new byte[5];
		try{
			System.in.read(b);
		}catch (java.io.IOException e);//Seharusnya menggunakan kurung kurawal {}
		System.out.println("Hasil :" + (char) b[0] + (char) b[1] + (char) b[2]);
	}


//Benar
	public static void main(String [] args){
        byte[] b = new byte[5];
		try{
			System.in.read(b);
		}catch (java.io.IOException e){
			System.err.println(e.getMessage());
		}
		System.out.println("Hasil :" + (char) b[0] + (char) b[1] + (char) b[2]);
		//Jika di jalankan dan meng input kata maka  program  hanya mengambil 3 huruf
		//Ex : Input  : Saya
		//     Output : Say
    }