package simplepassword;

/**
 *
 * @author xanth
 */
public class SimplePassword  {
    
    private String password;

    private boolean upperCase = false;

    private boolean lowerCase = false;

    private boolean isANumber = false; 

    private boolean minChar = false;
    
    public void setPassword(String password){this.password = password;}
    
    
    public String getPassword(){return this.password;}
    
