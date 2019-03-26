package Test;

public class StudentDemo {
	public int Grade;
	public String Major;
	public String Cclass;
	public int Id;
	public String Name;
	public String Sex;
	public int Num;
	public String student_Id;
	public String getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(String student_Id) {
		this.student_Id = student_Id;
	}
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
	public String getCclass() {
		return Cclass;
	}
	public void setCclass(String class1) {
		Cclass = class1;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public StudentDemo(int grade,String major,String c,int id,String name,String sex,int num,String sd) {
		this.Grade=grade;
		this.Major=major;
		this.Cclass=c;
		this.Id=id;
		this.Name=name;
		this.Sex=sex;
		this.Num=num;
		this.student_Id=sd;
	}
	public StudentDemo() {
	}

}
