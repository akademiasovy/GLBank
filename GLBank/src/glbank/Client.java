/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glbank;

/**
 *
 * @author client
 */
public class Client {
    private int idc;
    private String lastname;
    private String firstname;
    private String email;
    private String street;
    private int housenumber;
    private String postcode;
    private String username;
    private boolean disable;
    private boolean blocked;

    public Client(int idc, String lastname, String firstname, String email, String street, int housenumber, String postcode, String username, boolean disable, boolean blocked) {
        this.idc = idc;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.street = street;
        this.housenumber = housenumber;
        this.postcode = postcode;
        this.username = username;
        this.disable = disable;
        this.blocked = blocked;
    }
    
    
}
