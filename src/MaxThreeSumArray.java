public int FindMaxsum(int[] arr)
{

    int max1 = max2 = max3 = INTEGER.MIN_VALUE;
    int min1 = min2 = INTEGER.MAX_VALUE;
    
    for(int i=0; i< arr.length -1 ; i++)
    {
        if(arr[i] > max1)
        {
            max3 = max2;
            max2 = max1;
            max1 = arr[i];
        }
        else if(arr[i] > max2 && arr[i] < max1)
        {
            max2 = max1;
            max1 = arr[i];
        }
        else if(arr[i] > max3 && arr[i] < max1 && arr[i] < max2)
        {
            max1 = arr[i];
        }
        
        if(arr[i] < min1)
        {
            min2 = min1;
            min1 = arr[i];
        }
        else if(arr[i] < min2 && arr[i] > min1)
        {
            min2 = arr[i];
        }   
    }
    
    return max1 * Math.max((max2 * max3),(min1 * min2));

}
