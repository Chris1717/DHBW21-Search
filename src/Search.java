class Search {

    static int[] data = { 2, 3, 5, 7, 11, 13, 17, 19 };

    static char[] dataC = { 'A', 'D', 'E', 'Q', 'R', 'S' };

    public static void main(String[] args) {
        int position = binarySearchR('A', 0, dataC.length - 1);
        System.out.println("Der Wert findet sich an Position: " + (position == -1 ? "nicht enthalten" : position));
    }

    public static int simpleSearch(int derGesuchteWert) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Runde: " + i + " der gesuchte Wert: " + derGesuchteWert + " das aktuelle Element: " + data[i]);
            if (data[i] == derGesuchteWert) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int searchValue) {

        int middleIdx = 0;
        int lowIdx = 0;
        int highIdx = data.length - 1;
        int i = 0;

        while(lowIdx <= highIdx) {
            middleIdx = (lowIdx + highIdx) / 2;
            System.out.println("Runde: " + i++ +  " green: " + middleIdx + " aktuelle Element: " + data[middleIdx] + " zu suchender Wert: " + searchValue);
            if (data[middleIdx] == searchValue) {
                return middleIdx;
            } else if (data[middleIdx] < searchValue) {
                lowIdx = middleIdx + 1;
                System.out.println("  red to the right");
            } else {
                highIdx = middleIdx - 1;
                System.out.println("  blue to the left");
            }
        }
        return -1;
    }

    public static int binarySearch(char searchValue) {

        int middleIdx = 0;
        int lowIdx = 0;
        int highIdx = dataC.length - 1;
        int i = 0;

        while(lowIdx <= highIdx) {
            middleIdx = (lowIdx + highIdx) / 2;
            System.out.println("Runde: " + i++ +  " green: " + middleIdx + " aktuelle Element: " + dataC[middleIdx] + " zu suchender Wert: " + searchValue);
            if (dataC[middleIdx] == searchValue) {
                return middleIdx;
            } else if (dataC[middleIdx] < searchValue) {
                lowIdx = middleIdx + 1;
                System.out.println("  red to the right");
            } else {
                highIdx = middleIdx - 1;
                System.out.println("  blue to the left");
            }
        }
        return -1;
    }


    public static int binarySearchR(char searchValue, int lowIdx, int highIdx) {
    
        int middleIdx = (lowIdx + highIdx) / 2;
        System.out.println(" green: " + middleIdx + " aktuelle Element: " + dataC[middleIdx] + " zu suchender Wert: " + searchValue);
        if (lowIdx > highIdx) {
            return -1;
        } else if (dataC[middleIdx] == searchValue) {
            return middleIdx;
        } else if (dataC[middleIdx] < searchValue) {
            return binarySearchR(searchValue, middleIdx + 1, highIdx);
        } else {
            return binarySearchR(searchValue, lowIdx, middleIdx - 1);    
        }
    
    }

}