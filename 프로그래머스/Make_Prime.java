class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 2; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean prime = true;
                    if (sum == 1) {
                        prime = false;
                    }

                    for (int o = 2; o < Math.sqrt(sum); o++) {
                        if (sum % o == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}