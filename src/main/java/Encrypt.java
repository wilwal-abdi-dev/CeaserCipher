//public class Encrypt {
//
//    public static StringBuffer encrypting(String plainText, int key){
//
//        //Encode the text
//        StringBuffer encrypt = new StringBuffer();
//        for (int i = 0; i < plainText.length(); i++){
//
//            //Check if text is upper case
//            if (Character.isUpperCase(plainText.charAt(i))){
//                char c = (char) (((int)plainText.charAt(i) + key -65) % 26 + 65);
//                encrypt.append(c);
//
//                //Check if text is lower case
//            } else {
//                char c = (char) (((int)plainText.charAt(i) + key -97) % 26 + 97);
//                encrypt.append(c);
//
//            }
//        }
//
//        return encrypt;
//
//    }
//
//
//}
//
