import java.io.*;

import edu.smu.engr.softeng.horus.security.*;

public class SecurityTestClass {

	public SecurityTestClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ByteArrayInputStream in = new ByteArrayInputStream(null);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		DiffieHellman dh = new DiffieHellman();
		
		CryptionManager.decrypt(in);
		CryptionManager.encryptData(in);

	}

}
