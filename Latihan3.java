
//Salah
	public static void main(String [] args){
		byte[] b = new byte[5];
		System.out.println("Input Bilangan Bulat :");
		try{
			System.in.read(b);
		}catch (java.io.IOException e);//Tikom seharusnya di ganti dengan kurung kurawal {}
		int N = Integer.valueOf(b).intValue();//valueOf(b) Error karena tidak bisa bertype Byte.
		System.out.println("Hasil :" + (N+2));
	}


//Benar
	public static void main(String [] args){
        byte[] b = new byte[5];
		System.out.println("Input Bilangan Bulat :");
		try{
			System.in.read(b);
		}catch (java.io.IOException e){}
		int N = Integer.valueOf(b[1]).intValue();
		String string = new string (b);
		System.out.println("Hasil  :" + (N+2));
		System.out.println("String :" +string);
    }