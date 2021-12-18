
package bloodDonation;

class user {
   
    private String FirstName, Surname,LastDate, Gender,BloodGroup, BloodDonor, Email, DateofBirth,Number,Password;
    
    public user(String FirstName,String Surname,String Gender,String BloodGroup,String Number,String BloodDonor ,String LastDate,String Email,String DateofBirth, String Password ){
    
         this.FirstName= FirstName;
          this.Surname= Surname;
           this.Gender= Gender;
            
             this.BloodGroup= BloodGroup;
              this.Number= Number;
               this.BloodDonor= BloodDonor;
               this.LastDate=LastDate;
               this.Email= Email;
                this.DateofBirth= DateofBirth;
                 this.Password= Password;
                  
        
    }

    user(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    public String getFirstName(){
        return FirstName;
    }
    public String getSurname(){
        return Surname;
    }
    public String getGender(){
        return Gender;
    }
    
    public String getBloodgroup(){
        return BloodGroup;
    }
    public String getNumber(){
        return Number;
    }
    public String getBloodDonor(){
        return BloodDonor;
    }
     public String getLastDate(){
        return LastDate;
    }
    public String getEmail(){
        return Email;
    }
    public String getDateofBirth(){
        return DateofBirth;
    }
    public String getPassword(){
        return Password;
    }

    
}
