package entity;
// Generated 2011-11-29 21:53:09 by Hibernate Tools 3.2.1.GA



/**
 * Teacher generated by hbm2java
 */
public class Teacher  implements java.io.Serializable {


     private Integer tid;
     private Integer age;
     private String email;
     private String tel;
     private String teaId;
     private String tpassword;
     private String tname;
     private String sex;
     private String department;
     private String jiguan;

    public Teacher() {
    }

	
    public Teacher(String tel, String teaId, String tpassword, String tname) {
        this.tel = tel;
        this.teaId = teaId;
        this.tpassword = tpassword;
        this.tname = tname;
    }
    public Teacher(Integer age, String email, String tel, String teaId, String tpassword, String tname) {
       this.age = age;
       this.email = email;
       this.tel = tel;
       this.teaId = teaId;
       this.tpassword = tpassword;
       this.tname = tname;
    }
   
    public Teacher(Integer tid, Integer age, String email, String tel,
			String teaId, String tpassword, String tname, String sex,
			String department, String jiguan) {
		super();
		this.tid = tid;
		this.age = age;
		this.email = email;
		this.tel = tel;
		this.teaId = teaId;
		this.tpassword = tpassword;
		this.tname = tname;
		this.sex = sex;
		this.department = department;
		this.jiguan = jiguan;
	}


	public Integer getTid() {
		return tid;
	}


	public void setTid(Integer tid) {
		this.tid = tid;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getTeaId() {
		return teaId;
	}


	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}


	public String getTpassword() {
		return tpassword;
	}


	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getJiguan() {
		return jiguan;
	}


	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}


}


