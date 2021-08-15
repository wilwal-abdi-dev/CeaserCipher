import org.junit.Test;


import static junit.framework.TestCase.assertEquals;


public class CeaserTest {

    // test input to be string
    @Test
    public void  testEncoding_testWord_String(){
        Encrypt testEncrypt = new Encrypt();
        assertEquals(2 , 2);
    }

    @Test
    public void decryptTest_testWord_String(){

        Decrypt decryptTest = new Decrypt();
        assertEquals(true, decryptTest instanceof Decrypt);
    }

    @Test
    public void rotateCharacter_ShiftsCharacterCorrectNumberofTimesAtEndOfAlphabet_char(){
        char input='x';
        char expectedOutput='h';
        assertEquals(expectedOutput, CeaserCipher.cipher(input, 10));
    }

    @Test
    public void rotateCharacter_ShiftsCharacterCorrectNumberofTimes_char(){
        char input='b';
        char expectedOutput='i';

        assertEquals(expectedOutput, CeaserCipher.cipher(input, 7));
    }
}



