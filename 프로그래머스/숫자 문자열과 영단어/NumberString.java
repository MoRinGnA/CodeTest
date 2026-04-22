class Solution {
    public int solution(String s) {
        String[] array = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        for (int i = 0; i < array.length; i++) {
            s = s.replaceAll(array[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}