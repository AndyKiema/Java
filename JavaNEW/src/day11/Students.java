package day11;

public class Students {
  int sid;
  String sname;
  char grade;
  
  void printStudentDetails() {
	  //System.out.println(sid+" "+sname+" "+grade);
  }
  void setStudentDetails(int id, String name, char grad) {
	  sid= id;
	  sname= name;
	  grade= grad;
  }
  Students(int id,String name,char grad){
	  sid=id;
	  sname=name;
	  grade=grad;
  }
  
}

