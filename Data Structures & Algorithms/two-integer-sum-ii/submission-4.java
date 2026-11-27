class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0; i < numbers.length;i++){
            int tmp = target - numbers[i];
            if(mp.containsKey(tmp)){
                return new int[]{mp.get(tmp), i + 1};
            }
            mp.put(numbers[i], i + 1);
        }
    
        return new int[0];
        // only exist for java compiler to not return any errors,    returns and empty array as this stage is never reached.
    }
}
