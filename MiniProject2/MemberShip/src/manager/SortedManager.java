package manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import member.Member;

public class SortedManager {
	
	private TreeSet<Member> treeSet;
	//To-do 회원을 정렬하여 관리하기 위해 TreeSet을 활용합니다.
	
	public SortedManager() {
		treeSet = new TreeSet<Member>();
	}
	
	//To-do 회원을 추가하는 메서드를 만듭니다.
	public void addMember(Member member) {
		treeSet.add(member);
	}	
	
	//To-do 회원을 삭제하는 메서드를 만듭니다.
	public void removeMember(Member member) {
		treeSet.remove(member);
	}
	
	//To-do 모든 회원을 보여주는 메서드를 구현 합니다.
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member.showMemberInfo());
		}
		System.out.println();
	}
	
//	To-do 회원정보를 가져오는 getter를 제공합니다.
	public TreeSet getMemberList() {
		return treeSet;
	
	}
	
}
