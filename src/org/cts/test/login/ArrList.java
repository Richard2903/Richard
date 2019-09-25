package org.cts.test.login;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrList {
public static void main(String[] args) {
	List <Integer> li = new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(90);
	li.add(10);
	li.add(10);
	li.add(40);
	li.add(50);
	System.out.println(li);
	int s = li.size();
	System.out.println(s);
	List <Integer> lii = new LinkedList<>();
	lii.add(100);
	lii.add(200);
	lii.add(300);
	lii.add(400);
	lii.add(500);
	lii.add(600);
	lii.add(700);
	System.out.println(lii);
	int i = lii.size();
	System.out.println(i);
	for (int k=0; k<lii.size(); k++) {
		System.out.println(lii.get(k));
	}
	List <Integer> vi = new Vector<> ();
	vi.add(105);
	vi.add(205);
	vi.add(305);
	vi.add(405);
	vi.add(505);
	vi.add(605);
	vi.add(705);
	System.out.println(vi);
	int j = vi.size();
	System.out.println(j);
	
	}
}
