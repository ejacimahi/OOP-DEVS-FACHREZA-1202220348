public class TelUExpress extends Ekspedisi{
    protected boolean antarInter;

    public TelUExpress (int jumlahCabang, String pusat, float tarif,boolean antarInter){
        super(jumlahCabang, pusat, tarif);
        this.antarInter=antarInter;
    }    
        
    @Override
    public void informasi(){ 
        System.out.println("Ekspedisi TelUExpress dengan jumlah cabang"+jumlahCabang+ "dan berpusat" +pusat + "mempunyai tarif sebesar" +tarif +"perkilogram");
    }

    public void ambil(String tempat){
        System.out.println("TelUxpress berhasil mengambil paket ke"+tempat);
    }
    
    public void ambil(int resi){
        System.out.println("TelUxpress berhasil mengambil paket ke"+antarInter);
    }
        public void ambil (int resi_1, int resi_2){
        System.out.println("TelUxpress berhasil mengambil paket ke"+antarInter);
    }
}
