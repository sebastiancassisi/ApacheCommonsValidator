/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.apachecommonsvalidator;

import org.apache.commons.validator.EmailValidator;

/**
 *
 * @author ANTI
 */
public class ApacheCommonsValidator {
 
    public static void main(String[] args) {
     
     String mail = "sebastiancassisi@gmail.com";
     String resultadoValidacio = (isValidMail(mail)) ? "El mail es correcto" : "El mail es incorrecto";
     System.out.println(resultadoValidacio);   
    }
    
    private static boolean isValidMail(String email) {
	if (email == null || "".equals(email))
		return false;
	
	email = email.trim();
	
	EmailValidator ev = EmailValidator.getInstance();
	return ev.isValid(email);
	
}
    
}
