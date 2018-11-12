package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String caesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift%26;

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);
           
            //sb.append(currentChar);
            if (currentChar > 'z' || currentChar < 'a' && currentChar != 32) {
                return "invalid";
            } else if(currentChar == 32){
                currentChar = 32;
            } else if ((char) (currentChar + shift) > 'z') {
                currentChar = (char) (currentChar + shift - 26);
            } else if ((char) (currentChar + shift) < 'a'){
                currentChar = (char) (currentChar + shift + 26);
            } else{
                currentChar = (char) (currentChar + shift);
            }
            sb.append(currentChar);
        }

        return sb.toString();
    }
}
