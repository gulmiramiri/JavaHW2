package q3;

public class MyInteger {
    
     private int value;

   
    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public boolean equals(int value) {
        return this.value == value;
    }

   
    public boolean equals(MyInteger other) {
        return this.value == other.value;
    }

   
    public static int parseInt(char[] charArray) {
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            sb.append(c);
        }
        return Integer.parseInt(sb.toString());
    }

   
    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
    
}
