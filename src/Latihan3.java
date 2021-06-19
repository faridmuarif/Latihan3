Public class Latihan3 {
 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String [] menu = new String[10];//Array List
        String namaMenu = "";
        int [] porsi = new int[10];
        int [] subTotal = new int[10];
        int [] harga = new int[10];
        int hargaSatuan =0,totalHarga = 0,pilihan,i=0,sTotal,julmalhPorsi;
        String tambah ="y";
        while(tambah.equals("y")){
            System.out.println("Menu Makanan : Silahkan Dipilih");
            System.out.println("===============================");
            System.out.println("1. Ayam Bacem \t: Rp15.000");
            System.out.println("2. Ayam Sinjay \t: Rp17.000");
            System.out.println("3. Ayam Goreng \t: Rp13.000");
            System.out.println("4. Ayam Geprek \t: Rp15.000");
            System.out.print("Silahkan Pilih Menu (1-4): ");pilihan= input.nextInt();
            System.out.print("Jumlah Porsi : ");julmalhPorsi= input.nextInt();
            if (pilihan==1){
                hargaSatuan =15000;
                namaMenu="Ayam Bacem";
            }
            else if (pilihan==2){
                hargaSatuan =17000;
                namaMenu="Ayam Sinjay";
            }
            else if (pilihan==3){
                hargaSatuan =13000;
                namaMenu="Ayam Goreng";
            }
            else if (pilihan==4){
                hargaSatuan =15000;
                namaMenu="Ayam Geprek";
            }
            else System.out.println("Menu Tidak Tersedia");
            sTotal=hargaSatuan*julmalhPorsi;
            totalHarga=totalHarga+hargaSatuan*julmalhPorsi;
            menu[i]=namaMenu;
            porsi[i]=julmalhPorsi;
            subTotal[i]=sTotal;
            harga[i]=hargaSatuan;
            System.out.print("Tambah Menu Lagi ?(y/n) : ");
            tambah= input.next();
            i++;
        }
        System.out.println(" ");
        System.out.println("Nota Transaksi  ");
        System.out.println("+-----------+-----------+--------------+-------------+");
        System.out.println("| Nama Menu |   Harga   | Jumlah Porsi |  Sub Total  |");
        System.out.println("+-----------+-----------+--------------+-------------+");
        int c =0;
        while(menu[c]!=null){
            System.out.print(menu[c]);
            System.out.print("\t\t");
            System.out.print(harga[c]);
            System.out.print("\t\t\t");
            System.out.print(porsi[c]);
            System.out.print("\t\t\t");
            System.out.println(subTotal[c]);

            c++;
        }
        System.out.println("======================================================");
        System.out.print("Total Harga  \t\t\t\t\t\t\t\t"+totalHarga);
    }
}
