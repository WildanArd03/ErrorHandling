
//Salah
	 public static void main(String [] args){
        int n = 0;
        n = System.in.read();
        System.out.println("Hasil :" +(char) n);
        //Jika di jalankan maka akan erorr karena belum menambahkan try-catch
    }


//Benar
	public static void main(String [] args){
        int n = 0;
        try{
            n = System.in.read();
        }catch (java.io.IOException ex){
            System.err.println(ex.getMessage());
        }
        System.out.println("Hasil :" +(char) n);
        //Jika di jalankan dan pada  saat input kata maka akan meng output huruf awal
        //Ex : Input  : Saya
        // 	   Output : S
    }