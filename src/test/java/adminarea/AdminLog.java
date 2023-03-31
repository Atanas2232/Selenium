package adminarea;


import org.testng.annotations.Test;

public class AdminLog {

    @Test
    public void adminLog(){
        AdminLogin.login("admin", "parola123!");

    }


}
