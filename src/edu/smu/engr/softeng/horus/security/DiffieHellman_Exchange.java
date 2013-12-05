package edu.smu.engr.softeng.horus.security;

import java.security.*;
import java.math.*;
import java.io.*;

public class DiffieHellman_Exchange {

	   int keysize;
	   DHKey key;
	   BigInteger x, x_pub, s_secret;

	   // Get the numbers p,g from file (in "key" object)
	   // Generate a secure random number and create a public key from p,g
	   public DiffieHellman_Exchange (String filename) throws Exception {  
	      keysize = 512;  
	      FileInputStream fis = new FileInputStream(filename);
	      ObjectInputStream oin = new ObjectInputStream(fis);
	      key = (DHKey)oin.readObject();
	      oin.close();
	      SecureRandom sr = new SecureRandom();  // Get a secure random number
	      x = new BigInteger(keysize, sr);  // Generate the secure secret key
	      x_pub = key.g.modPow(x, key.p);   // Compute the public key from p,g
	   }

	   public BigInteger getPublicKey (String filename) { return x_pub; }

	   // Send the client's public key to the server,
	   // Get the server's public key
	   // Compute the secret
	   public BigInteger computeSecret (BufferedReader in, PrintWriter out) 
	      throws IOException {  
	      out.println(x_pub.toString());
	      BigInteger pkey = new BigInteger(in.readLine());
	      s_secret = pkey.modPow(x, key.p);
	      return s_secret;
	   }
}
