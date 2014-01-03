/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.noppe.user;

import nl.noppe.user.User;

/**
 *
 * @author hpnoppe
 */
class Userlist {
    private final User[] userlist ;
    private int MaxUsedIndex = 0;
    
    /**
     * Constants
     */
    public final static String NOFREEINDEX = "No free indexes available in user list";
   
    
    /**
     * initializes a user list according to the given number of users
     * @Param numberUsers number of user the array userlist will be set.
     */
    
    public Userlist(int numberUsers) {
        this.userlist = new User[numberUsers];
        
    }

    public User[] getUserlist() {
        return userlist;
    }
    
    public int getMaxUsedIndex(){
        return MaxUsedIndex;
    }
    
    public String AddUser(User user) {
        String errmsg = new String();
        
        if (MaxUsedIndex+1 <userlist.length) {
          this.userlist[MaxUsedIndex+1] = user;  
          MaxUsedIndex++;
        } else {
            errmsg = NOFREEINDEX;            
        }
        
        return errmsg;
    }
    
}
