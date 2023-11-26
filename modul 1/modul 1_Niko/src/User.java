public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute



    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message


    private String Nama;
    private String NoHandphone;

  
    public void setNama(String nama) {
        Nama = nama;
    }
   
    public void setNoHandphone(String noHandphone) {
        NoHandphone = noHandphone;
    }

    public void register(){
        System.out.println(this.Nama);
        System.out.println(this.NoHandphone);
        System.out.println("Register berhasil dilakukan");
    }
    
    
      
    
}
