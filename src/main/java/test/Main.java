package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		boolean isArm = false;
		List<String> list = new ArrayList<String>();
		
		// 判断是否为ARM
		for (String tag : list) {
			if ("ARM".equals(tag)) {
				isArm = true;
			}
		}
		
		// 执行逻辑
		if (isArm) {
			
		}else {
			
		}
	}
}
