package in.jt;

import java.lang.reflect.Field;

public class ReflectionAPI {

	public static void main(String[] args)throws ClassNotFoundException,
	InstantiationException,		IllegalAccessException {
		
		
		Address addr = new Address();
		addr.setCityName("Vizag");
		addr.setStateName("Andhara");
		
		System.out.println(addr);
		Class cls = Class.forName("in.jt.Student");
		Student std = new Student(); //sid:0 sname:null address:null
		System.out.println(std);
		Field[] f = cls.getDeclaredFields();
		for(int i=0;i<f.length;i++) {
			//System.out.println(f[i]);
			//System.out.println(f[i].getName());
			f[i].setAccessible(true);
			if(f[i].getName().equalsIgnoreCase("sid")) {
				f[i].set(std, 12345);
			}
			else
				if(f[i].getName().equalsIgnoreCase("sname")) {
					f[i].set(std, "Priyanka");
				}
				else if(f[i].getName().equalsIgnoreCase("address")) {
					f[i].set(std, addr);
				}
		}
		System.out.println(std);
	}

}
