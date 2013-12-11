import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import edu.smu.engr.softeng.horus.security.*;


public class securityTests {

	public securityTests() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		ByteArrayInputStream input = new ByteArrayInputStream(null);

		DiffieHellman dh = new DiffieHellman();
		
		CryptionManager.decrypt(input);
		CryptionManager.encryptData(input);
		
	}

}
