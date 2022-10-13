//c++ code for palindrome finding
#include <bits/stdc++.h>
using namespace std;
void printSubStr(string str, int low, int high)
{
	for (int i = low; i <= high; ++i)
		cout << str[i];
}

int longestPalSubstr(string str)
{
	
	int n = str.size();

	int maxLength = 1, start = 0;
	for (int i = 0; i < str.length(); i++) {
		for (int j = i; j < str.length(); j++) {
			int flag = 1;

		
			for (int k = 0; k < (j - i + 1) / 2; k++)
				if (str[i + k] != str[j - k])
					flag = 0;

			// Palindrome
			if (flag && (j - i + 1) > maxLength) {
				start = i;
				maxLength = j - i + 1;
			}
		}
	}

	printSubStr(str, start, start + maxLength - 1);
cout<<endl;
	// return length of LPS
	return maxLength;
}

// Driver Code
int main()
{
	string str;
    cin>>str;
	cout
		<< longestPalSubstr(str);
	return 0;
}
