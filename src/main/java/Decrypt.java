public class Decrypt {

    public static StringBuffer decrypting(String cipherText, int shift){

        //Decrypt the text
        StringBuffer decrypt= new StringBuffer();
        for (int j = 0; j < cipherText.length(); j++){

            //Check if text is upper case
            if (Character.isUpperCase(cipherText.charAt(j))){
                char d = (char) (((int)cipherText.charAt(j) - shift -65) % 26 + 65);
                decrypt.append(d);

                //Check if text is lower case
            } else {
                char d = (char) (((int)cipherText.charAt(j) - shift -97) % 26 + 97);
                decrypt.append(d);

            }
        }

        return decrypt;

    }
}


