package com.codegen.core.plateform.coreapplication;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base64;

public class FileCodecBase64 {

	public static void main(String args[]) throws Exception {
		String byteData = "";
		String sourceFile = "src//main//resources//SampleData.xlsx";
		String destFile = "src//main//resources//output//SampleData.xlsx";

		byteData = encodeFileToBaseData(sourceFile);

		decodeBaseDataToFile(destFile, byteData);
	}

	private static String encodeFileToBaseData(String sourceFile) throws Exception {

		byte[] base64EncodedData = Base64.encodeBase64(loadFileAsBytesArray(sourceFile));

		return new String(base64EncodedData, StandardCharsets.UTF_8);

	}

	public static void decodeBaseDataToFile(String targetFile, String byteData) throws Exception {

		byte[] decodedBytes = Base64.decodeBase64(byteData);

		writeByteArraysToFile(targetFile, decodedBytes);
	}

	public static byte[] loadFileAsBytesArray(String fileName) throws Exception {

		File file = new File(fileName);
		int length = (int) file.length();
		BufferedInputStream reader = new BufferedInputStream(new FileInputStream(file));
		byte[] bytes = new byte[length];
		reader.read(bytes, 0, length);
		reader.close();
		return bytes;

	}

	public static void writeByteArraysToFile(String fileName, byte[] content) throws IOException {

		File file = new File(fileName);
		BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file));
		writer.write(content);
		writer.flush();
		writer.close();

	}
}
