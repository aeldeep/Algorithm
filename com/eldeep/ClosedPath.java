package com.eldeep;

public class ClosedPath {

    public static int closedPaths(int number) {
        
    // Write your code here
    int path[]={4,6,9};
    int num = 0;
    while (number>0)
    {
        int n = number%10;
        number/=10;
        for (int i = 0;i<path.length;i++)
        {
            if (n==path[i]||n==0)
            {
                num+=1;
                break;
            }
            else if(n%path[i]==0)
            {
                num+=n/path[i];
            }
        }
    }
        return num;
    }

}
