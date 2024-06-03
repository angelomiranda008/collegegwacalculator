
package cgwac.main;

import java.util.ArrayList;

public class Register {
        
    private String username;
    private String password;
    private String confirmPass;

    ArrayList <String> messageToEnableRegister = new ArrayList<>();

        Register(String username,String password, String confirmPass){
            this.password = password;
            this.username = username;
            this.confirmPass = confirmPass;
        }
        public String getUsername(){
            return username;
        }
        public void setUsername(){
            this.username = username;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public String getConfirmPass(){
            return confirmPass;
        }
        public void setConfirmPass(){
            this.confirmPass = confirmPass;
        }

    public ArrayList <String> getMessageToEnableRegister() {
        return messageToEnableRegister;
    }
 
    public void setMessageToEnableRegister(ArrayList <String> messageToEnableRegister) {
        this.messageToEnableRegister = messageToEnableRegister;
    }
        
        
}
