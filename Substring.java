class Substring 
{
	public static void main(String[] args) 
	{
		String s1 = "malayalam";
		String s2 = "mohanam";
		String s3 = "malay";
		System.out.println("Substring found ="+s1.toUpperCase().contains(s3.toUpperCase()));
		System.out.println("Substring not found ="+s2.toUpperCase().contains(s3.toUpperCase()));
	}
}

