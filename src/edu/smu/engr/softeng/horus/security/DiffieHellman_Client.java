package edu.smu.engr.softeng.horus.security;

import java.io.*;
import java.net.*;            // For Socket, etc.
import java.math.*;           // For BigInteger

public class DiffieHellman_Client {

	public static void main (String arg[]) {
		InputStreamReader isr;
		BufferedReader in;
		PrintWriter out;

		try {
			DiffieHellman_Exchange dh = new DiffieHellman_Exchange("DHKey");

			// Connect to the server
			Socket connect = new Socket("localhost", 8284);
			isr = new InputStreamReader(connect.getInputStream());
			in = new BufferedReader(isr);
			out = new PrintWriter(connect.getOutputStream(), true);

			dh.computeSecret(in,out);

			System.out.println("Client: secret = "+dh.s_secret);
		} catch (Exception e) {
			System.out.println("Yikes!");
		}
	}

}
