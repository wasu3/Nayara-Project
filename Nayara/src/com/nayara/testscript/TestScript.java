package com.nayara.testscript;

import org.testng.annotations.Test;

import com.nayara.generic.BaseClass;
import com.nayara.pom.userPage;

public class TestScript extends BaseClass{
	
    @Test 
    public void testUserPage() throws InterruptedException {
    	userPage a=new userPage(driver);
    	a.setAddUser();
    	
    }
    
}
