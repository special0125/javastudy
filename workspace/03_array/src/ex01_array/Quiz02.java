package ex01_array;

import java.util.Scanner;

/*
 * String[] friendList = {"타요","짱구","스폰지밥"};
 * 새로 사귄 친구의 수를 입력 받아서 
 * 그만큼 friendList 배열의 길이를 늘이기
 */
public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] friendList = { "타요", "짱구", "스폰지밥"};
		
		System.out.print("새로 사귄 친구의 수 입력 : ");
		int newFriend = sc.nextInt();
		
		String[] newFriendList = new String[friendList.length+newFriend];
		
		for(int i = 0; i < friendList.length; i++) {
			newFriendList[i] = friendList[i];
		}
		
		for(int i = friendList.length; i < newFriendList.length; i++) {
			System.out.print("친구 입력 : ");
			newFriendList[i] = sc.next();
		}
		
		
		friendList = newFriendList;
		
		for(String i : friendList) {
			System.out.println(i);
		}
	}
}
