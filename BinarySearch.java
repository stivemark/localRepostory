class BinaraySearch 
{
	public static int binarySearch(int a[],int target)
	{
		int left=0;
		int right=a.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(a[mid]==target)
			{
				return mid;
			}
			else if(a[mid]<target)
			{
				left=mid+1;
			}
			else if(a[mid]>target)
			{
				right=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int a[]={77,71,4,2,6};
		int target=77;
		int result=binarySearch(a,target);
		if (result!=-1)
		{
			System.out.println("the target ement prasent in the index of:"+result);
		}
		else
		{
			System.out.println("the target element is not prasent in the given array");
		}
	}
}
