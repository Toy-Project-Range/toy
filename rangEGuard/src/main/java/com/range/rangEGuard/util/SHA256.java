package com.range.rangEGuard.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
	public String getHash(String msg) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(msg.getBytes());
		return byteToHex(md.digest());
	}
	private String byteToHex(byte[] bytes) {
		StringBuilder builder = new StringBuilder();
		for(byte b : bytes)
			builder.append(String.format("%02x", b));
		return builder.toString();
	}
}