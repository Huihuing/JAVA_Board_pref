package main;
import java.util.Scanner;
import java.util.ArrayList;
import main.butil;

public class articlecontroller {
    butil butil = new butil();
    articleview articleview = new articleview();
    articlerepa articlerepa = new articlerepa();

    Scanner scan = new Scanner(System.in);
    int wrong_value = -1;

    public void search() {
        System.out.println("검색할 단어를 입력해주세요: ");
        String keyword = scan.nextLine();
        ArrayList<article> searchedList = articlerepa.findarticlekeyword(keyword);

        articleview.printlist(searchedList);
    }
    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요: ");

        int inputId = errorm(scan.nextLine(), wrong_value);
        if(inputId == wrong_value) {
            return;
        }

        article article = articlerepa.findarticleid(inputId);
        if (article == null) {
            System.out.println("없는 게시물입니다.");
            return;

        }

        article.risingviewpoint();
        articleview.printdetaillist(article);

        System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로): ");
        String input = scan.nextLine();
        int comm = Integer.parseInt(input);
        switch(comm) {
            case 1:
                System.out.println("댓글기능");
                break;
            case 2:
                System.out.println("추천기능");
                break;
            case 3:
                System.out.println("수정기능");
                break;
            case 4:
                System.out.println("삭제기능");
                break;
            case 5:
                System.out.println("목록으로");
                break;
            default:
                System.out.println("잘못 입력하셨습니다");
                break;
        }
    }
    public void delete() {
        System.out.println("삭제할 게시물 번호를 입력해주세요: ");

        int inputId = errorm(scan.nextLine(), wrong_value);
        if(inputId == wrong_value) {
            return;
        }
        article article = articlerepa.findarticleid(inputId);
        if (article == null) {
            System.out.println("없는 게시물입니다.");
            return;

        }
        articlerepa.deletearticle(article);
        System.out.printf("%d 게시물이 삭제되었씁니다.\n", inputId);

    }
    public void list() {
        ArrayList<article> articleList = articlerepa.findall();
        articleview.printlist(articleList);
    }
    public void update() {
        System.out.println("수정할 게시물 번호를 입력해주세요: ");
        int inputId = errorm(scan.nextLine(), wrong_value);
        if(inputId == wrong_value) {
            return;
        }
        article article = articlerepa.findarticleid(inputId);
        if (article == null) {
            System.out.println("없는 게시물입니다.");
            return;

        }

        System.out.println("새로운 제목을 입력해주세요: ");
        String newtitle = scan.nextLine();

        System.out.println("새로운 내용을 입력해주세요: ");
        String newbody = scan.nextLine();

        articlerepa.updatearticle(article, newtitle, newbody);
        System.out.printf("%d 게시물이 수정되었습니다.\n", inputId);

    }
    public void add() {

        System.out.print("제목을 입력하세요: ");
        String title = scan.nextLine();

        System.out.print("내용을 입력하세요: ");
        String body = scan.nextLine();

        articlerepa.savearticle(title, body);
        System.out.println("게시물이 등록되었습니다.");
    }
    private int errorm(String error, int defalutValue) {
        try {
            return Integer.parseInt(error);
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요.");
            return defalutValue;
        }
    }
}
