class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int ceil=Integer.MAX_VALUE;
        int floor=Integer.MIN_VALUE;
        if(arr[0]>x){
            floor=-1;
        }
        if(arr[arr.length-1]<x){
            ceil=-1;
        }
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(x==arr[mid]){
                ceil=Math.min(ceil,arr[mid]);
                floor=Math.max(floor,arr[mid]);
            }
            if(x>arr[mid]){
                floor=Math.max(floor,arr[mid]);
                low=mid+1;
            }   
            if(x<arr[mid]){
                ceil=Math.min(ceil,arr[mid]);
                high=mid-1;
            }
        }
        int[]d=new int[2];
        d[0]=floor;
        d[1]=ceil;
        return d;
    }
}
