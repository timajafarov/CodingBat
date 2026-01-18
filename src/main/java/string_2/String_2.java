package string_2;

public class String_2 {

    public String doubleChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }

        return result;
    }

    public int countHi(String str) {
        int len = str.length()-1;
        int times = 0;
        for(int i = 0; i < len; i++)
        {
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
                times++;
        }
        return times;
    }

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            String part = str.substring(i, i + 3);

            if (part.equals("cat")) {
                catCount++;
            }

            if (part.equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }

    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.charAt(i) == 'c' &&
                    str.charAt(i + 1) == 'o' &&
                    str.charAt(i + 3) == 'e') {
                count++;
            }
        }

        return count;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }


    public boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {

            if (str.substring(i, i + 3).equals("xyz")) {

                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }

        return false;
    }


    public boolean bobThere(String str) {
        int len = str.length() - 2;
        for(int i = 0; i < len; i++)
        {
            if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
                return true;
        }
        return false;
    }


    public boolean xyBalance(String str) {
        int len = str.length() - 1;
        char ch;
        for(int i = len; i >= 0; i--)
        {
            ch = str.charAt(i);
            if(ch == 'x')
                return false;
            else if(ch == 'y')
                return true;
        }
        return true;
    }

    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();

        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        result.append(a.substring(minLength));
        result.append(b.substring(minLength));

        return result.toString();
    }

    public String repeatEnd(String str, int n) {
        String part = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(part);
        }

        return result.toString();
    }


    public String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {
            result.append(str.substring(0, i));
        }

        return result.toString();
    }


    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(word);

            if (i < count - 1) {
                result.append(sep);
            }
        }

        return result.toString();
    }


    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);

        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }

        return false;
    }


    public boolean xyzMiddle(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {

            if (str.substring(i, i + 3).equals("xyz")) {

                int left = i;
                int right = str.length() - (i + 3);

                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }

        return false;
    }


    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == -1 || first == last) {
            return "";
        }

        return str.substring(first + 5, last);
    }


    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }


    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= str.length() - 3; i += 3) {
            result.append(str.charAt(i + 1));
            result.append(str.charAt(i + 2));
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public String zipZap(String str) {
        int len = str.length();
        int lim = len - 2;
        int i = 0;
        char ch;
        StringBuilder stbuild = new StringBuilder(len);
        while(i < len)
        {
            ch = str.charAt(i);
            if(ch == 'z' && i < lim && str.charAt(i+2) == 'p')
            {
                stbuild.append("zp");
                i += 3;
            }
            else
            {
                stbuild.append(ch);
                i++;
            }
        }
        return stbuild.toString();
    }


    public String starOut(String str) {
        int len = str.length();
        int[] indexes = new int[len];
        char ch;
        StringBuilder stbuild = new StringBuilder(len);
        for(int i = 0; i < len; i++)
        {
            if(str.charAt(i) == '*')
            {
                indexes[i] = 1;
                if(i >= 1)
                    indexes[i-1] = 1;
                if(i < (len-1))
                    indexes[i+1] = 1;
            }
        }
        for(int i = 0; i < len; i++)
        {
            if(indexes[i] == 0)
                stbuild.append(str.charAt(i));
        }
        return stbuild.toString();
    }

    public String plusOut(String str, String word) {
        int len = str.length();
        int wLen = word.length();
        int pos = str.indexOf(word);
        int i = 0;
        StringBuilder stbuild = new StringBuilder(len);
        while(pos != -1)
        {
            while(i < pos)
            {
                stbuild.append('+');
                i++;
            }
            stbuild.append(word);
            i = pos + wLen;
            pos = str.indexOf(word, i);
        }
        for(; i < len; i++)
            stbuild.append('+');
        return stbuild.toString();
    }



}
