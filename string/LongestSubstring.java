package string;

public class LongestSubstring {

		public static void main(String[] args) {
			String s1="GeeksforGeeks";
			String s2="GeeksQuiz";
			String s3="";
			
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						int x=i;
						int y=j;
						String s4="";
						while(y<s2.length() && x<s1.length())
						{
							if(s1.charAt(x)==s2.charAt(y))
							{
								s4+=s2.charAt(y);
							}
							else
							{
								break;         // if it will go to infinite loop
							}
							x++;
							y++;
						}
						
						if(s4.length()>s3.length())
							s3=s4;
					}
				}
			}
			// common string is printed with his length
			System.out.println("New SubString : "+s3+"\nSize of substring : "+s3.length());

		}

	}
	