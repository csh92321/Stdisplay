package stdisplay;

import java.util.*;

import stdisplay_delete_hjm.StdDelete;

import stdisplay_registration_joohui.Registration_joohui;

import stdisplay_grade_soyoung.Grade;

public class Stdisplay {

	private static ArrayList<StudentInfo> std = new ArrayList<>();

	public ArrayList<StudentInfo> getaddr() {
		return std;
	}

	public static void main(String[] args) {
		ArrayList<StudentInfo> std = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		StdDelete hjm = new StdDelete();

		Registration_joohui re = new Registration_joohui();

		Grade grade = new Grade();

		while (true) {
			System.out.println("==== 학생 관리 프로그램====");
			System.out.println("1.학생 등록 2.학생 확인 3.학생 수정 ");
			System.out.println("4.학생 삭제 5.성적 관리");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				re.display();
				break;
			case 2:
				break;
			case 3:
				break;
			// 학생 수정 / 성환님
			case 4:
				hjm.print();
				break;
			case 5:
				grade.display();
				break;

			}

		}

	}

}