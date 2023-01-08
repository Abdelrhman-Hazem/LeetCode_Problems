class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp=new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            if(mp.get(nums1[i]) == null)mp.put(nums1[i],1);
            else {
                mp.replace(nums1[i],mp.get(nums1[i]).intValue()+1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(mp.get(nums2[i]) != null){
                if(mp.get(nums2[i])==1){
                    result.add(nums2[i]);
                    mp.remove(nums2[i]);
                }else{
                    result.add(nums2[i]);
                    mp.replace(nums2[i],mp.get(nums2[i]).intValue()-1);
                }
            }
        }
        //result.stream().forEach(System.out::println);
        return result.stream().mapToInt(i->i).toArray();


    }
}
