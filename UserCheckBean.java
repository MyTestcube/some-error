package beans;

public class UserCheckBean {
    private String usermame=null;
    private String password=null;
    public UserCheckBean(){}

    public void setUsermame(String value){usermame=value;}
    public String getUsermame(){return usermame;}
    public void setPassword(String value){password=value;}
    public String getPassword(){return password;}

    public boolean check(){
        if (usermame.equals("admin")&& password.equals("12345")){
            return true;
        }
        else
            return false;
    }
}
