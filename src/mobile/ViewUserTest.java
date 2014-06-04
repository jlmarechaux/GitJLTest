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
import mobile.ViewUser;

public class ViewUserTest extends TestCase {
    public void testGetMessage() {
    	ViewUser viewer = new ViewUser();
        assertEquals("Success", viewer.getMessage());
    }
}