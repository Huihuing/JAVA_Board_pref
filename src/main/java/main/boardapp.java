package main;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;


public class boardapp {
    articlecontroller articlecontroller = new articlecontroller();
    public void running() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("명령어: ");
            String menu = scan.nextLine();
            if (menu.equals("exit")) {
                System.out.println("종료합니다");
                break;
            } else if (menu.equals("add")) {
                while (true) {
                    articlecontroller.add();
                    System.out.print("다시 등록하시겠습니까? yes/no : ");
                    String yn = scan.nextLine();

                    if (yn.equalsIgnoreCase("no")) {
                        break;
                    }
                }
            }
            else if (menu.equals("list")) {
                articlecontroller.list();
            }
            else if (menu.equals("delete")) {
                articlecontroller.delete();
            }
            else if (menu.equals("update")) {
                articlecontroller.update();
            }
            else if (menu.equals("detail")) {
                articlecontroller.detail();
            }
            else if (menu.equals("search")) {
                articlecontroller.search();
            }
            else {
                System.out.println("다시 입력해주세요");
            }
        }
    }
}
