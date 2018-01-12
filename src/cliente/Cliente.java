/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author laris_000
 */
public class Cliente {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) throws IOException {
      // TODO code application logic here
      Socket s = new Socket("127.0.0.1", 4444);
      DataInputStream in = new DataInputStream(s.getInputStream());
      DataOutputStream out = new DataOutputStream(s.getOutputStream());
      
      out.writeUTF("Ola Servidor");
      System.out.println(in.readUTF());
      
      in.close();
      out.close();
      s.close();
   }
   
}
