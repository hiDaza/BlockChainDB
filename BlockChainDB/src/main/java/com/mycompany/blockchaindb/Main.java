/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blockchaindb;

import Database.DBFunctions;

/**
 *
 * @author gerson.lucas_unesp
 */
public class Main {

   public static void main(String[] args){
        DBFunctions db = new DBFunctions();
        db.connection("postgres", "postgres","");
    }
}
