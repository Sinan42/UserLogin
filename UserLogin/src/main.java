import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String userName,password;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter UserName");
        userName= input.nextLine();
        System.out.print("Enter Password");
        password= input.nextLine();
        if(userName.equals("sinan")&&password.equals("java101")){
            System.out.println("Basarili giris");
        }else{
            System.out.println("Sifre hatalı sıfırlama istermisiniz e/h");
            String answer=input.nextLine();
            if(answer.equalsIgnoreCase("e")){
                while(true){
                    System.out.println("Yeni sifre");
                    String newPassword= input.nextLine();
                    if(!password.equals(newPassword)&&!newPassword.equals("java101")){
                        System.out.println("Sİfre Olursturuldu.");


                    }else{
                        System.out.println("Sİfre olustrulmadı.");
                        break;
                    }
                }
            }else{
                System.out.println("Islem Bitti.");
            }



        }




    }


}
