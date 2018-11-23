
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "account.Common.Login"(
    	String username	
     , 	String password	) {
    (new account.Common()).Login(
        	username
         , 	password)
}

def static "account.AdminManagement.NavigateToAccountsModule"() {
    (new account.AdminManagement()).NavigateToAccountsModule()
}

def static "account.AdminManagement.createAdmin"() {
    (new account.AdminManagement()).createAdmin()
}
