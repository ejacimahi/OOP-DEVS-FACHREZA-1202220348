public class User  {
   private String nama;
   private String noHandphone;
   public User(String nama, String noHandphone) {
      this.nama = nama;
      this.noHandphone = noHandphone;
   }
   public String getNama() {
      return nama;
   }
   public void setNama(String nama) {
      this.nama = nama;
   }
   public String getNoHandphone() {
      return noHandphone;
   }
   public void setNoHandphone(String noHandphone) {
      this.noHandphone = noHandphone;
   }
   public void register(){

      System.out.println("Register Berhasil");
      System.out.println("Nama= Metta");
      System.out.println("Masukan Nomor Telephon=08566488629");
   }
   

   
   

 
}






  