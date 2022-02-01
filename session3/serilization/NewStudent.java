package serialization;

import java.io.Serializable;

public class NewStudent {
  
	public class Student implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int id;
		private String fname;
		private String lname;
		private transient String email;//avoid serialization
		
		public Student() {
			// TODO Auto-generated constructor stub
		}

		public Student(int id, String fname, String lname, String email) {
			this.setId(id);
			this.setFname(fname);
			this.setLname(lname);
			this.setEmail(email);
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	}
}
