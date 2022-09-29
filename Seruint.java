interface search
{
    int searchL(int a[],int key,int size);
    int searchB(int b[],int key, int size);
}
class Searching implements search
{
    public int searchL(int a[],int k,int size)
    {
        for(int i=0;i<size-1;i++)
        {
            if (k==a[i])
            {
                System.out.println("Element is found at:"+i);
            }
        }
        
        return 0;
    }
    public int searchB(int a[],int k,int size)
    {
        int h=size-1;
        int l=0;
        int i;
        for( i=0;i<size-1;i++)
        {
            int m=(l+h)/2;
            if (k>a[m]) l=m+1;
            else if (k<a[m]) h=m-1;
            else return m;
        }
        return 0;
    }
}