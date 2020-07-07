package Generic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class lab652 {

	public static void main(String[] args) {
	ArrayList<String> email=new ArrayList<String>();
	email.add("sameer");
	email.add("nazia");
	email.add("Faiza");
	ArrayList<Long> num=new ArrayList<Long>();
	num.add(989876868l);
	num.add(8976765659l);
	num.add(7657643367l);
	LinkedHashMap<String,Long> ref=new LinkedHashMap<String,Long>();
	ref.put("nazia", 995189l);
	ref.put("sam", 970375l);
	ref.put("anira", 889979899l);
	cstudent stu=new cstudent(99,"laal",email,num,ref);
	ArrayList<cstudent> stlist=new ArrayList<cstudent>();
	stlist.add(stu);stlist.add(stu);stlist.add(stu);
	System.out.println(stlist);
	}

}
class cstudent{
	int sid;
	String sname;
	List<String> email;
	List<Long> phone;
	Map<String,Long> refs;
	public cstudent(int sid,String sname,List<String> email,List<Long> phone,Map<String,Long>ref) {
	this.sid=sid;
	this.sname=sname;
	this.email=email;
	this.phone=phone;
	this.refs=ref;
	}
	public String toString() {
		return
				"\n"+sid+"\t"+sname+"\t"+email+"\t"+phone+"\t"+refs+"\n";
	}
}