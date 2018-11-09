package tudelft.roman;

import java.util.HashMap;

public class RomanToNum {

    static HashMap<Character,Integer> mapRoman;

    static{
        mapRoman = new HashMap();
        mapRoman.put('I',1);
        mapRoman.put('V',5);
        mapRoman.put('X',10);
        mapRoman.put('L',50);
        mapRoman.put('C',100);
        mapRoman.put('D',500);
        mapRoman.put('M',1000);
    }

    public static void main(String[] args){
        System.out.println(RomanToNum.convert("IXIV"));
    }


    public static int convert(String roman){
        char[] romanSplitted = roman.toCharArray();
        int number = 0;
        boolean substraction = false;
        for(int i=0; i<romanSplitted.length; i++){
            int actualVal = mapRoman.get(romanSplitted[i]);
            int nextVal = i+1 < romanSplitted.length ? mapRoman.get(romanSplitted[i+1]) : 0;
            if(actualVal<nextVal)
                number -= actualVal;
            else
                number += actualVal;
        }

        return number;
    }
}
