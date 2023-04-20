package TopInterviewQuestions;

public class p45JumpGameII {
    public static void main(String[] args) {

    }

    public static int jump(int[] nums) {
        int sc = 0;
        int e = 0;
        int max = 0;
        for(int i=0; i<nums.length-1; i++) {
            max = Math.max(max, i+nums[i]);
            if( i == e ) {
                sc++;
                e = max;
            }
        }
        return sc;
    }

    public static int jump2(int[] nums) {
        final int size = nums.length;

        // destination is last index
        int destination = size-1;

        int curCoverage = 0, lastJumpIdx = 0;

        // counter of jump
        int timesOfJump = 0;

        // Quick response if start index == destination index == 0
        if( size == 1 ){
            return 0;
        }


        // Greedy stragegy: extend coverage as long as possible with lazp jump
        for( int i = 0 ; i < size ; i++){

            // extend coverage
            curCoverage = Math.max(curCoverage, i + nums[i] );

            // forced to jump (by lazy jump) to extend coverage
            if( i == lastJumpIdx ){

                lastJumpIdx = curCoverage;

                timesOfJump++;

                // check if we reached destination already
                if( curCoverage >= destination){
                    return timesOfJump;
                }
            }
        }

        return timesOfJump;
    }
}
