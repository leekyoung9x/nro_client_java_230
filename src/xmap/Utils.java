/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmap;

import java.io.InputStream;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author FPTShop
 */
public class Utils {

    private static Random random;

    public static long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static String readTextFromFile(String path) {
        String text = "";
        try {
            InputStream inputStream = "".getClass().getResourceAsStream(path);
            int len = inputStream.available();
            byte[] buffer = new byte[len];
            inputStream.read(buffer, 0, len);
            text = new String(buffer, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }

    public static int[] toIntArray(String[] strArray) {
        int[] array = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i].trim());
        }
        return array;
    }

    public static String[] split(String str, String splitter) {
        StringBuffer sb = new StringBuffer(str);
        String[] strs = new String[sb.length()];
        int splitterLength = splitter.length();
        int initialIndex = 0;
        int indexOfSplitter = indexOf(sb, splitter, initialIndex);
        int count = 0;
        if (-1 == indexOfSplitter) {
            return new String[]{sb.toString()};
        }
        while (-1 != indexOfSplitter) {
            char[] chars = new char[indexOfSplitter - initialIndex];
            sb.getChars(initialIndex, indexOfSplitter, chars, 0);
            initialIndex = indexOfSplitter + splitterLength;
            indexOfSplitter = indexOf(sb, splitter, indexOfSplitter + 1);
            strs[count] = new String(chars);
            count++;
        }
        if (initialIndex + splitterLength <= sb.length()) {
            char[] chars = new char[sb.length() - initialIndex];
            sb.getChars(initialIndex, sb.length(), chars, 0);
            strs[count] = new String(chars);
            count++;
        }
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = strs[i];
        }
        return result;
    }

    public static int indexOf(StringBuffer sb, String str, int start) {
        int index = -1;
        if (start >= sb.length() || start < -1 || str.length() <= 0) {
            return index;
        }
        char[] tofind = str.toCharArray();
        for (; start < sb.length(); start++) {
            char c = sb.charAt(start);
            if (c == tofind[0]) {
                if (1 == tofind.length) {
                    return start;
                }
                for (int i = 1; i < tofind.length; i++) {
                    char find = tofind[i];
                    int currentSourceIndex = start + i;
                    if (currentSourceIndex < sb.length()) {
                        char source = sb.charAt(start + i);
                        if (find == source) {
                            if (i == tofind.length - 1) {
                                return start;
                            }
                        } else {
                            start++;
                            break;
                        }
                    } else {
                        return -1;
                    }
                }
            }
        }
        return index;
    }

    public static Vector toVectorObject(int[] array) {
        Vector vector = new Vector();
        for (int i = 0; i < array.length; i++) {
            vector.addElement(new Integer(array[i]));
        }
        return vector;
    }

    public static Vector reverseVector(Vector vec) {
        Vector vector = new Vector();
        for (int i = vec.size() - 1; i >= 0; i--) {
            vector.addElement(vec.elementAt(i));
        }
        return vector;
    }

    public static void writeLog(String s) {
        System.out.println(s);
    }

    public static Random getRnd() {
        if (random == null) {
            random = new Random();
        }
        return random;
    }

    public static int randomInt(int minValue, int maxValue) {
        return minValue + getRnd().nextInt(maxValue - minValue) + 1;
    }

    public static int distance(int x1, int y1, int x2, int y2) {
        return (int) Math.sqrt(((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
    }

    public static String roundDouble(double doubleNumber, int afterDot) {
        String numberString = String.valueOf(doubleNumber);
        int dotIndex = numberString.indexOf('.');

        if (dotIndex != -1 && dotIndex + afterDot + 1 < numberString.length()) {
            String result = numberString.substring(0, dotIndex + afterDot + 1);
            return result;
        }
        return numberString;
    }
}
