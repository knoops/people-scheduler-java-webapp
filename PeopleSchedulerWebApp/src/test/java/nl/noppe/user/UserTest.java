/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.noppe.user;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hpnoppe
 */
public class UserTest {

    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testGetUser() {
         User user = new User();
         
         user.setLastName("Noppe");
         user.setFirstName("Henk");
         user.setEmail("hnoppe@gmail.com");
         user.setTelephone("0612345678"); //char to preserve leading zero
         
         Assert.assertNotNull(user);
         
     }
}
