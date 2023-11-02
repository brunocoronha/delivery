package com.mycompany.deliverycontrol.view;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

    public class GeradorMD5 {

        public static String gerarMD5(String senha) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] messageDigest = md.digest(senha.getBytes());

                StringBuilder hexString = new StringBuilder();
                for (byte b : messageDigest) {
                    hexString.append(String.format("%02x", b));
                }

                return hexString.toString();
            } catch (NoSuchAlgorithmException e) {
                // Trate a exceção ou lance-a novamente conforme necessário
                e.printStackTrace();
                return null;
            }
        }
}
