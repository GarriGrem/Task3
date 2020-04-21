public class Task3 {

    public static int solutions (int a, int b, int c) {
        double D = b * b - 4 * a * c;
        if (D > 0)
            return 2;
        else if (D == 0)
            return 1;
        else
            return 0;
    }

    public static int findZip (String str) {
        int index = str.indexOf("zip");
        index = str.indexOf("zip", index + 1);
        if (index != -1)
            return index;
        return -1;
    }

    public static boolean checkPerfect (int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0)
                sum += i;
            if (sum == num)
                return  true;
            else return false;
    }

    public static String flipEndChars (String str) {
        if (str.length() < 2)
            return "Incompatible";
        else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            if (first == last)
                return "Two's a pair";
            else {
                StringBuilder strNew = new StringBuilder(str);
                strNew.setCharAt(0, last);
                strNew.setCharAt(strNew.length() - 1, first);

                return strNew.toString();
            }
        }
    }

    public static boolean isValidHexCode (String code) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        if (code.indexOf(0) == '#')
            flag1 = false;
        if (code.length() != 7)
            flag2 = false;
        for (int i = 1; i < code.length(); i++) {
            if (!(Character.isDigit(code.charAt(i)) || code.charAt(i) >= 65 && code.charAt(i) <= 70 || code.charAt(i) >= 97 && code.charAt(i) <= 102))
                flag3 = false;
        }
        if ((flag1 && flag2 && flag3) == true )
            return true;
        else
            return false;
    }

    public static boolean same (int[] arr1, int[] arr2) {
        int count = 0;
        int countUnique = 0;
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            countUnique++;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] == arr1[i]) {
                    count++;
                    break;
                }
            }
        }
        result1 = countUnique - count;

        count = 0;
        countUnique = 0;

        for (int i = 0; i < arr2.length; i++) {
            countUnique++;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] == arr2[i]) {
                    count++;
                    break;
                }
            }
        }
        result2 = countUnique - count;
        if (result1 == result2)
            return true;
        else
            return false;
    }

    public static boolean isKaprekar (int num) {
        int quad = num * num;
        int left = 0;
        int right = 0;
        String str = String.valueOf(quad);
        if (str.length() % 2 == 0) {
            int m = str.length() / 2;
            String str1 = str.substring(0,m);
            String str2 = str.substring(m);
            left = Integer.parseInt(str1);
            right = Integer.parseInt(str2);
        }
        else {
            int m = str.length() / 2;
            String str1 = str.substring(0, m);
            String str2 = str.substring(m);
            try {
                left = Integer.parseInt(str1);
            }
            catch (Exception ex) {
                left = 0;
            }
            right = Integer.parseInt(str2);
        }
        if (left + right == num)
            return true;
        else
            return false;
    }

    public static String longestZero (String str) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count++;
            }
            else if (count > max) {
                max = count;
                count = 0;
            }
        }
        String longest = "";
        while (max > 0) {
            longest += '0';
            max--;
        }
        return longest;
    }

    public static int nextPrime (int n) {
        for (int i = 2; i < n; i++){
            if  (n % i == 0) {
                n++;
                i = 2;
                nextPrime(n);
            }
        }
        return n;
    }

    public static boolean rightTriangle (int x, int y, int z) {
        int max = 0;
        if (x > max)
            max = x;
        if (y > max)
            max = y;
        if (z > max)
            max = z;
        if (max * max == x * x + y * y ||
        max * max == x * x + z * z ||
        max * max == y * y + z * z)
            return true;
        else
            return false;
    }
}
