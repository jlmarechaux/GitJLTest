/*******************************************************************************
 *Licensed Materials - Property of IBM
 *(c) Copyright IBM Corporation 2008. All Rights Reserved.
 *
 *Note to U.S. Government Users Restricted Rights:  
 *Use, duplication or disclosure restricted by GSA ADP Schedule 
 *Contract with IBM Corp. 
 *******************************************************************************/
package mobile;

import junit.framework.TestCase;
import mobile.ChangePassword;

public class ChangePasswordTest extends TestCase {
    public void testGetMessage() {
    	ChangePassword pwdChanger = new ChangePassword();
        assertEquals("Success", pwdChanger.getMessage());
    }
}