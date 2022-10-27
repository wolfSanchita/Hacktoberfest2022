// Java program to implement
// the above approach
import java.util.*;
class GFG
{

// Function to print the maximum
// non-empty subsequence sum
static int MaxNonEmpSubSeq(int a[], int n)
{

	// Stores the maximum non-empty
	// subsequence sum in an array
	int sum = 0;

	// Stores the largest element
	// in the array
	int max = a[0];
	for(int i = 1; i < n; i++)
	{
	if(max < a[i])
	{
		max = a[i];
	}
	}

	if (max <= 0)
	{	
	return max;
	}

	// Traverse the array
	for (int i = 0; i < n; i++)
	{

	// If a[i] is greater than 0
	if (a[i] > 0)
	{

		// Update sum
		sum += a[i];
	}
	}
	return sum;
}

// Driver code
public static void main(String[] args)
{
	int arr[] = { -2, 11, -4, 2, -3, -10 };
	int N = arr.length;

	System.out.println(MaxNonEmpSubSeq(arr, N));
}
}

// This code is contributed by divyesh072019
