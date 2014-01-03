/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.noppe.user;

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
public class UserListTest {
    
    public UserListTest() {
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
     public void testGetUserList() {
         Userlist userlist = new Userlist(2);
         User userlistArr[] = userlist.getUserlist();
         User user = new User();
         
         assertNotNull(userlist);
         assertTrue("Unexpected length of userlist. Actual length:" + userlistArr.length,userlistArr.length == 2);
               
         user.setLastName("Noppe");
         user.setFirstName("Henk");
         user.setEmail("hnoppe@gmail.com");
         user.setTelephone("0612345678"); //char to preserve leading zero

         userlist.AddUser(user);
         
         user.setLastName("Knoops");
         user.setFirstName("Jochem");
         user.setEmail("jknoops@gmail.com");
         user.setTelephone("0687654321"); 
   
         userlist.AddUser(user);
         
         assertEquals("Unexpected MaxUsedIndex: Actual value: " + userlist.getMaxUsedIndex(),1,userlist.getMaxUsedIndex());
         assertEquals("Unexpected email address Actual Email address: " + userlistArr[1].getEmail(),"jknoops@gmail.com",userlistArr[1].getEmail());
         
         
         user.setLastName("Puk");
         user.setFirstName("Piet");
         user.setEmail("piet@gmail.com");
         user.setTelephone("0301234567"); 
   
         userlist.AddUser(user);
         
         assertTrue("Unexpected length of userlist. Actual length:" + userlistArr.length,userlistArr.length == 2);
         
     }
}
