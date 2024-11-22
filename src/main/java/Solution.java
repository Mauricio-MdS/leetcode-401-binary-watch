import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> times = new ArrayList<>();

        int[] hourBitCounts = new int[12];
        for (int i = 0; i < 12; i++) {
            hourBitCounts[i] = Integer.bitCount(i);
        }

        int[] minuteBitCounts = new int[60];
        for (int i = 0; i < 60; i++) {
            minuteBitCounts[i] = Integer.bitCount(i);
        }

        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (hourBitCounts[h] + minuteBitCounts[m] == turnedOn) times.add("%d:%02d".formatted(h,m));
            }
        }

        return times;
    }
}