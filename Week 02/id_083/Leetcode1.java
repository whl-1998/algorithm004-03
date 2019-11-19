
/*
1����֮��
����һ���������� nums?��һ��Ŀ��ֵ target��
�����ڸ��������ҳ���ΪĿ��ֵ��������������
���������ǵ������±ꡣ


����Լ���ÿ������ֻ���Ӧһ���𰸡�
���ǣ��㲻���ظ��������������ͬ����Ԫ�ء�


ʾ��:


���� nums = [2, 7, 11, 15], target = 9


��Ϊ nums[0] + nums[1] = 2 + 7 = 9

���Է��� [0, 1]


*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}