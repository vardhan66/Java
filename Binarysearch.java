//Creating class Binary search
public class Binarysearch {
    //instance variables of integer type
    int low,high,mid;
    //method to perform binary search
    int bSearch(int a[],int k,int s){//passing the arguments:an array,a key value and size of array
        low=0;//low is assigned with zero
        high=s-1;//high is assigned with last element of array 
        for(int i=0;i<s;i++){
            mid=(low+high)/2;// caluculating the mid value
            if (k==a[mid]) return mid;
            else if (k>a[mid]) low=mid +1;
            else high=mid-1;
        }
        return 0;
    }
} 