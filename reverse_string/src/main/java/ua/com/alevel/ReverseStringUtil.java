package ua.com.alevel;

import java.util.StringJoiner;

public final class ReverseStringUtil {
    private ReverseStringUtil(){}
    public static String Reverse (String str1) {
    String str = str1;
    char[] mass = str.toCharArray();
    char[]mass2 = new char[mass.length];
    int iter = 0;
    for (int i = mass.length-1; i >= 0; i--){
        mass2[iter] = mass[i];
        iter++;
    }
    String res = String.valueOf(mass2);
    String[] array = res.split(" ");
    String []arrayRes = new String[array.length];
    int count = 0;
    for (int i =array.length-1; i >= 0; i-- ){
        arrayRes[count] = array[i];
        count++;
    }
    StringJoiner joiner = new StringJoiner(" ");
    for(int i = 0; i < arrayRes.length; i++) {
        joiner.add(arrayRes[i]);
    }
    String out = joiner.toString();
    return out;
}
    public static String reverseBySupstring(String str1, String str2){
        String str = str1;
        String podStr = str2;
        char[] mass = str.toCharArray();
        char[] podstrMass = podStr.toCharArray();
        char[]massPerevert = new char[podStr.length()];
        char[]massResult = new char[mass.length];
        int iter = 0;
        for (int i =podstrMass.length-1; i >= 0; i-- ){
            massPerevert[iter] = podstrMass[i];
            iter++;
        }
        int key = 0;
        int count = 0;
        int count2 = 0;
        int m = 0;
        for (int i = 0; i < mass.length; i++){

            if(mass[i]==podstrMass[count]){
                if(i==mass.length-1){
                    while (i!=mass.length){
                        massResult[i] = mass[i];
                        i++;
                    }
                    break;
                }
                else if(i==mass.length-2){
                    while (i!=mass.length){
                        massResult[i] = mass[i];
                        i++;
                    }
                    break;
                }
                else for (int j = 0; j < podstrMass.length; j++ ) {
                        if (mass[i] == podstrMass[count]) {
                            key++;
                        }
                        i++;
                        count++;
                        if(i > mass.length-1)
                            break;
                    }
                if(key !=podstrMass.length){
                    i = i - count;
                    count = 0;
                }
                if(key == podstrMass.length){
                    count = 0;
                    i = i - key;
                }
            }
            if(key==podstrMass.length ){
                for (int a = 0; a < massPerevert.length; a++){
                    massResult[i] = massPerevert[a];
                    count2++;
                    i++;
                }
                key = 0;
                m = 0;
            }
            count2 = 0;
            if(massPerevert[massPerevert.length-1]==podstrMass[m]){
                m++;
                i--;
                continue;
            }
            if ( i!= mass.length  ) {
                massResult[i] = mass[i];
                int y;
                key = 0;
            }
        }
        String res = String.valueOf(massResult);
        return res;
    }
    public static String ReverseById (String str1, int number1, int number2) {
        String str = str1;
        char[] mass = str.toCharArray();
        int count1 =  number1;
        int count1Copy = count1;
        int count2 =  number2;
        count2++;
        int iter = 0;
        char []  massRes = new char[count2-count1];
        for (int i = 0; i < massRes.length; i++) {
            massRes[i] = mass[count1Copy];
            count1Copy++;
        }
        String strOut = String.valueOf(massRes);
        char[] arrayResChar = Reverse(strOut).toCharArray();
        int schet2 = 0;
        char []result = new char[mass.length];
        for(int g =0; g < mass.length; g++){
            if(g == count1){
                for (int t = 0; t < arrayResChar.length; t++) {
                    result[g] = arrayResChar[schet2];
                    schet2++;
                    g++;
                }
            }
            if(g == mass.length){
                break;
            }
            result[g] = mass[g];
        }
        String strSuperOut = String.valueOf(result);
        return strSuperOut;
    }
}
