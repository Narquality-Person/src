package UnitEleven;

public class Class {
	
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;

		for (Student s : studentList)
		{
			classAverage += s.getAverage();
		}
		return classAverage / studentList.length;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for (Student s : studentList)
		{
			if (s.getName().equals(stuName))
			{
				return s.getAverage();
			}	
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String highName ="";

		for (Student s : studentList)
		{
			if (s.getAverage() > high)
			{
				highName = s.getName();
				high = s.getAverage();
			}
		}
		return highName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String lowName ="";		

		for (Student s : studentList)
		{
			if (s.getAverage() < low)
			{
				lowName = s.getName();
				low = s.getAverage();
			}
		}
		return lowName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";

		for (Student s : studentList)
		{
			if (s.getAverage() <= failingGrade)
			{
				output += s.getName() + " ";
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";

		for (Student s : studentList)
		{
			output += s + "\t" + s.getAverage() + "\n";
		}
		return output;
	}  	
	
}
