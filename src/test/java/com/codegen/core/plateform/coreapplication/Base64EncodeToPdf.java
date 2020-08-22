/**
 * 
 */
package com.codegen.core.plateform.coreapplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

/**
 * @author PRAVEEN
 * ClientCredentialProvider authProvider = new ClientCredentialProvider(
            this.clientId,
            this.scopes,
            this.clientSecret,
            this.tenantId,
            this.endpoint);
IGraphServiceClient graphClient = GraphServiceClient
            .builder()
            .authenticationProvider(authProvider)
            .buildClient();
 *
 */
public class Base64EncodeToPdf {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("E:\\Development\\coreapplication\\src\\main\\resources\\GAS_5.pdf");
	    try ( FileOutputStream fos = new FileOutputStream(file); ) {
	      byte[] decoder = Base64.getDecoder().decode(b64);
	      fos.write(decoder);
	      System.out.println("PDF File Saved");
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
		
//		String stringBase64 = "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";
//		byte[] decodedBytes = Base64.getDecoder().decode(stringBase64);
//		Files.write(Paths.get("E:\\Development\\coreapplication\\src\\main\\resources\\GAS_Conn3LL.doc"), decodedBytes);
//		
//		System.out.println("DOCX File Saved");
	}

}