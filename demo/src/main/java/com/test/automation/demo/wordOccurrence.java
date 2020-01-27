/**
 * 
 */
package com.test.automation.demo;

import java.util.HashMap;
import java.util.Map;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

/**
 * @author nagarjuna
 *
 */
public class wordOccurrence {

	public static void wordOccurance(String inputString) {

		String[] str = inputString.split(" ");

		Map<String, Integer> count = new HashMap<String, Integer>();

		for (String c : str) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c) + 1);
			} else {
				count.put(c, 1);
			}
		}
		System.out.println(count);
	}

	public static void main(String args[]) {
		wordOccurance("Java Java is is a a object object oriented oriented programming language language");
	}

}