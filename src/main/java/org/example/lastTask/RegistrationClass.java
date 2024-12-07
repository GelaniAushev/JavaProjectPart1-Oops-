package org.example.lastTask;

public class RegistrationClass {

    private String email;
    private String userName;
    private String password;

    protected void usersEmail(String email){
        this.email=email;
        System.out.println("Email: "+email);
    }

    protected void usersName(String userName){
        this.userName=userName;
        System.out.println("UserName: "+userName);
    }

    protected void usersPassword(String password){
        this.password=password;
        System.out.println("Password: "+password);
    }

}

class Yahoo extends RegistrationClass{
    public static void main(String[] args) {

        RegistrationClass re=new RegistrationClass();
        re.usersEmail("laracroft1337@yahoo.com");
        re.usersName("Lara Croft");
        re.usersPassword("SuperWoman1337");

    }
}
