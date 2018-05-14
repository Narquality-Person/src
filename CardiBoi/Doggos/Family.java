package Doggos;

public class Family {
	private String familyName;
	private Kiddo[] kiddoList;
	
	public Family()
	{
		familyName = "";
		kiddoList = new Kiddo[0];
	}
	
	public Family(String fName, int kCount)
	{
		familyName = fName;
		kiddoList = new Kiddo[kCount];
	}
	
	public void addKiddo(int kNum, Kiddo k)
	{
		kiddoList[kNum] = k;
	}
	
	public String getFamilyName()
	{
		return familyName;
	}
	
	public String getKiddoName(int kNum)
	{
		return kiddoList[kNum].getName();
	}
	
	
	public String toString()
	{
		String output = "" + getFamilyName() + "\n";
		for (Kiddo k : kiddoList)
		{
			output += k + "\t" + k.toString();
		}
		
		return output;
	}
}
