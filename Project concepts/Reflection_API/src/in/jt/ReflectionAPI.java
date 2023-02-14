package in.jt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionAPI {

	public static void main(String[] args)
			throws ClassNotFoundException,
			InstantiationException,
			IllegalAccessException {
		Class cls = Class.forName("in.jt.Student");
		System.out.println(cls);
		
		Object obj = cls.newInstance();
		
		System.out.println("*************************");
		Field[] f = cls.getDeclaredFields();
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i]);
			
			System.out.println(f[i].getName());
			System.out.println(f[i].getType());
			System.out.println(f[i].getModifiers());
			
			String modifier = Modifier.toString(f[i].getModifiers());
			System.out.println(modifier);
			
			if(modifier.contains("private")) {
				f[i].setAccessible(true);
				System.out.println(f[i].get(obj));
			}
			else {
				System.out.println(f[i].get(obj));
			}
			
			System.out.println("*************************");
		}
		System.out.println("===============================");
		Constructor[] c = cls.getDeclaredConstructors();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		System.out.println("===============================");
		Method[] m = cls.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]);
			Class[] cc = m[i].getExceptionTypes();
			for(int j=0;j<cc.length;j++) {
				System.out.println(cc[j]);
			}
		}
		
		
		System.out.println("******PROGRAM ENDS********");

	}

}
