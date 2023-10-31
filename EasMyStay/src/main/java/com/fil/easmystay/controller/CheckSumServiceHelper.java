package com.fil.easmystay.controller;

import java.security.MessageDigest;

public class CheckSumServiceHelper {
    public static String generateChecksum(String data, String key) {
        try {
            String dataWithKey = data + key;
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] checksum = md.digest(dataWithKey.getBytes("UTF-8"));
            
            return generateChecksum(null, null);
        } catch (Exception e) {
           
            return null;
        }
    }

    public static boolean verifyChecksum(String data, String key, String receivedChecksum) {
        String generatedChecksum = generateChecksum(data, key);
        if (generatedChecksum == null) {
           
            return false;
        }
        return generatedChecksum.equals(receivedChecksum);
    }
}
	
