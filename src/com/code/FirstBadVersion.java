package com.code;

public class FirstBadVersion {
	public int firstBadVersion(int n) {
        if(n==0) return 0;
        
        int start=1, end=n;
        
        while(start+1<end){
            int mid=start+(end-start)/2;
            
            if(isBadVersion(mid)&& !isBadVersion(mid-1)){
                return mid;
            }
            if(!isBadVersion(mid)){
                start=mid;
            }else{
                end=mid;
            }
        }
        
        if(isBadVersion(start)){
            return start;
        }
        
        if(isBadVersion(end)){
            return end;
        }
        
        return 0;
    }
	
	public boolean isBadVersion(int n){
		if(n>=7) return true;
		else return false;
	}
}
