package PrintDemo;

import java.time.LocalDate;

public class Customer {

        public String firstName;
        public String lastName;
        public String middleName;
        String address;
        String accountType;
        String phoneNumber;
        String eMail;
        String accountNummer;

        short idBSN;

        LocalDate birthday;
        LocalDate accountOpeningDate;
        LocalDate accountClosingDate;

        double transaction;

        public int getAge (){
           return LocalDate.now().getYear() - this.birthday.getYear();

        }

        public String getCostumerInformations(){
            return  "Name and Last Name: "+ firstName.concat(lastName) +
                    " "+ "\nAddress: "+ address+
                    " "+ "\nBirthday: "+ birthday+
                    " "+ "\nAccount Opening Date: "+ accountOpeningDate+
                    " "+ "\nAccount Closing Date: "+accountClosingDate;        }

        public void setBirthday(int year, int month, int day){
            LocalDate birthday = LocalDate.of(year, month, day);

            if(birthday.isAfter(LocalDate.now())){
                throw new IllegalArgumentException("Birthday is false");
            }
            else {
                this.birthday=birthday;
            }
        }


        public static  void main(String[] args){

            Customer customer = new Customer();
            customer.firstName ="Abdullah ";
            customer.lastName= "Mart";
            customer.address="Vosseveld 15";
            customer.middleName=null;
            customer.accountNummer="ING BNK465 280 900 29";
            customer.setBirthday(1980,01,01);
            customer.accountOpeningDate= LocalDate.of(2023,10,14);
            customer.accountClosingDate= LocalDate.of(2024,10,14);

            System.out.println(customer.getCostumerInformations());










        }

}