package smoketestcase;

import Allpagespageobjectmodel.loginPage;
import BaseP.BaseC;

public class TC01_login extends loginPage {
	
        public static void main(String[] args) 
        {    	
          browserInitzation(BaseC.browser,BaseC.url);
          Enter_email("Testing@mail.com",loginPage.EMailInput);
          Enter_password("P2332423",loginPage.EMailpassword);
          Button_login();
//          GenericMethodC.JavascriptExecutor_click(Buttonlogin);
         browser_close();
          
}
        
}

