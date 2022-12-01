paket  UTS ;

impor  UTS . com . JalanPanjang ;
impor  UTS . com . Setengah Lingkaran ;

 kelas  publik Utama {
    public  static  void  main ( String [] args ) {
        ganda  luas_arsir ;
        persegiPanjang  persegiPanjang1 = persegiPanjang baru  ( 12 , 7 );
        SetengahLingkaran  setengahLingkaran1 = SetengahLingkaran baru  ( 12 );

        persegiPanjang1 . luas ();
        setengahLingkaran1 . luas ();
        luas_arsir = persegiPanjang1 . getLuas () - setengahLingkaran1 . getLuas ();
        Sistem . keluar . println ( "Luas Persegi Panjang = " + persegiPanjang1 . getLuas ());
        Sistem . keluar . println ( "Luas Setengah Lingkaran = " + setengahLingkaran1 . getLuas ());
        Sistem . keluar . println ( "" );
        Sistem . keluar . println ( "Luas Arsir = " + luas_arsir );
    }
}
