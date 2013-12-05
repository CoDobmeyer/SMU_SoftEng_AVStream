package edu.smu.engr.softeng.horus.security;

import java.io.*;
import java.math.BigInteger;
import java.net.*;

public class DiffieHellman_Server {

	public static void initiate(Socket connect) {
		InputStreamReader isr;
		BufferedReader in;
		PrintWriter out;

		try {
			DiffieHellman_Exchange dh = new DiffieHellman_Exchange("DHKey");

			// Wait for a connection from a client then connect
			//ServerSocket socket = new ServerSocket(4444);
			//Socket connect = socket.accept();
			
			isr = new InputStreamReader(connect.getInputStream());
			in = new BufferedReader(isr);
			out = new PrintWriter (connect.getOutputStream(), true);

			// Receive public key from the client
			BigInteger pkey = new BigInteger(in.readLine());
			System.out.println("Server: client's public key = "+pkey.toString());
			dh.s_secret = pkey.modPow(dh.x, dh.key.p);  
			
			out.println(dh.x_pub.toString());
			
			System.out.println("Server: server's public key = "+dh.x_pub.toString());
			System.out.println("Server: secret = "+dh.s_secret);

			// Leave
			in.close();
			out.close();
			
			//socket.close();
		} catch (Exception e) {
			System.out.println("Whoops! - no network");
		}
	}

}
