package mx.edu.uttt.generic;

import mx.edu.uttt.view.frmLogin;

/**
 *
 * @author Karlos Cruz
 */
public class SingletonLogin {

    public SingletonLogin() {
    }
   
    public static frmLogin  getInstance(){
    
        return ObjectLoginInstance.INSTANCE_LOGIN;
    }
    
    private static class ObjectLoginInstance{
            private static final frmLogin INSTANCE_LOGIN = new frmLogin();
    }
    
}
