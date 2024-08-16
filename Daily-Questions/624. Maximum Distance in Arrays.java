class Solution{
public int maxDistance(List<List<Integer>> arrays) {
    int minVal = Integer.MAX_VALUE;
    int maxVal = Integer.MIN_VALUE;
    int secondMinVal = Integer.MAX_VALUE;
    int secondMaxVal = Integer.MIN_VALUE;

    int minIndex = -1;
    int maxIndex = -1;

    for (int i = 0; i < arrays.size(); i++) {
        int currentMin = arrays.get(i).get(0);
        int currentMax = arrays.get(i).get(arrays.get(i).size() - 1);

        if (currentMin < minVal) {
            secondMinVal = minVal;
            minVal = currentMin;
            minIndex = i;
        } else if (currentMin < secondMinVal) {
            secondMinVal = currentMin;
        }

        if (currentMax > maxVal) {
            secondMaxVal = maxVal;
            maxVal = currentMax;
            maxIndex = i;
        } else if (currentMax > secondMaxVal) {
            secondMaxVal = currentMax;
        }
    }

    if (minIndex != maxIndex) {
        return maxVal - minVal;
    } else {
        return Math.max(maxVal - secondMinVal, secondMaxVal - minVal);
    }
}
}
