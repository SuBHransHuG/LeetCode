
public class Solution {
    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        HashMap<Integer, String> numberMap = new HashMap<>();
        numberMap.put(1, "One");
        numberMap.put(2, "Two");
        numberMap.put(3, "Three");
        numberMap.put(4, "Four");
        numberMap.put(5, "Five");
        numberMap.put(6, "Six");
        numberMap.put(7, "Seven");
        numberMap.put(8, "Eight");
        numberMap.put(9, "Nine");
        numberMap.put(10, "Ten");
        numberMap.put(11, "Eleven");
        numberMap.put(12, "Twelve");
        numberMap.put(13, "Thirteen");
        numberMap.put(14, "Fourteen");
        numberMap.put(15, "Fifteen");
        numberMap.put(16, "Sixteen");
        numberMap.put(17, "Seventeen");
        numberMap.put(18, "Eighteen");
        numberMap.put(19, "Nineteen");
        numberMap.put(20, "Twenty");
        numberMap.put(30, "Thirty");
        numberMap.put(40, "Forty");
        numberMap.put(50, "Fifty");
        numberMap.put(60, "Sixty");
        numberMap.put(70, "Seventy");
        numberMap.put(80, "Eighty");
        numberMap.put(90, "Ninety");
        numberMap.put(100, "Hundred");
        numberMap.put(1000, "Thousand");
        numberMap.put(1000000, "Million");
        numberMap.put(1000000000, "Billion");

        return convertToWords(num, numberMap).trim();
    }

    private String convertToWords(int num, HashMap<Integer, String> numberMap) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return numberMap.get(num) + " ";
        } else if (num < 100) {
            return numberMap.get(num - num % 10) + " " + convertToWords(num % 10, numberMap);
        } else if (num < 1000) {
            return numberMap.get(num / 100) + " Hundred " + convertToWords(num % 100, numberMap);
        } else if (num < 1000000) {
            return convertToWords(num / 1000, numberMap) + "Thousand " + convertToWords(num % 1000, numberMap);
        } else if (num < 1000000000) {
            return convertToWords(num / 1000000, numberMap) + "Million " + convertToWords(num % 1000000, numberMap);
        } else {
            return convertToWords(num / 1000000000, numberMap) + "Billion " + convertToWords(num % 1000000000, numberMap);
        }
    }
}

