class manipulate
{
    public int sumOfXOROfSubsets(int[] nums) {
        return answer(nums, 0, 0);
    }
    
    
    
    public int answer(int[] nums, int pos, int XOR) {
        if(pos == nums.length) {
            return XOR;
        }
        int xor1 = answer(nums, pos+1, XOR^nums[pos]);
        int xor2 = answer(nums, pos+1, XOR);
        return xor1 + xor2;
    }
    
    
    
	public static void main(String[] args)
	{
		manipulate x = new manipulate();
		int[] nums = {5,1,6};
	    int s = x.sumOfXOROfSubsets(nums);
		System.out.println(s + " is the sum of xor of subsets of array");
	}
}
