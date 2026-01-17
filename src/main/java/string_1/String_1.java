package string_1;

public class String_1 {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        String start = out.substring(0, 2);
        String end = out.substring(2);
        String result = start + word + end;
        return result;
    }

    public String extraEnd(String str) {
        if(str.length() < 2){
            return null;
        }
        String str1 = str.substring(str.length()-2);
        return str1 + str1 +str1;
    }

    public String firstTwo(String str) {
        if (str.length() < 2){
            return str;

        }
        return str.substring(0,2);

    }

    public String firstHalf(String str) {

        int half = str.length() / 2;
        String result = str.substring(0, half);
        return result;

    }

    public String withoutEnd(String str) {
        if (str.length() < 2){
            return str;

        }
        return str.substring(1,str.length()-1);

    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()){
            return a+b+a;
        } else{
            return b+a+b;
        }

    }


    public String nonStart(String a, String b) {
        String aWithoutFirst = a.substring(1);
        String bWithoutFirst = b.substring(1);

        return aWithoutFirst + bWithoutFirst;
    }

    public String left2(String str) {
        String firstTwo = str.substring(0, 2);
        String rest = str.substring(2);

        return rest + firstTwo;
    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }


    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public String withouEnd2(String str) {
        if (str.length() < 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }

    public boolean endsLy(String str) {
        int len = str.length();
        if(len >= 2)
            return (str.substring(str.length()-2).equals("ly"));
        return false;
    }

    public String nTwice(String str, int n) {
        return (str.substring(0, n) + str.substring(str.length()-n));
    }

    public String twoChar(String str, int index) {
        if(index <= str.length()-2 && index >= 0)
            return str.substring(index, index+2);
        return str.substring(0, 2);
    }

    public String middleThree(String str) {
        int len = str.length()/2;
        return str.substring(len-1,len+2);
    }

    public boolean hasBad(String str) {
        int len = str.length();
        if(len == 3 && str.equals("bad"))
            return true;
        else if(len >= 4)
        {
            if(str.substring(0, 3).equals("bad"))
                return true;
            return str.substring(1, 4).equals("bad");
        }
        else
            return false;
    }

}
