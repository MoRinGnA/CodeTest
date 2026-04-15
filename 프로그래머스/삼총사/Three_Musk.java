// class Solution {
//     public int solution(int[] number) {
//         int answer = 0;
//         int N = number.length;

//         for (int i = 0; i < N - 2; i++) {
//             for (int j = i + 1; j < N - 1; j++) {
//                 for (int k = j + 1; k < N; k++) {
//                     if (number[i] + number[j] + number[k] == 0) {
//                         answer++;
//                     }
//                 }
//             }
//         }
//         return answer;
//     }
// }

class Solution {
    int answer = 0;

    public int solution(int[] number) {
        Three(number, 0, 0, 0);
        return answer;

    }

    public void Three(int[] number, int index, int s, int c) {
        if (c == 3) {
            if (s == 0) {
                answer++;
            }
            return;
        }

        for (int i = index; i < number.length; i++) {
            Three(number, i + 1, s + number[i], c + 1);
        }
    }
}