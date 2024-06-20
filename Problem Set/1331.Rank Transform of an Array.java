class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = arr.clone();
        
        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> Map = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            if (!Map.containsKey(num)) {
                Map.put(num, rank++);
            }
        }
        
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Map.get(arr[i]);
        }
        
        return result;
    }

    }
