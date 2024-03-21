package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class articleview {
    public void printlist(ArrayList<article> boardList) {
        System.out.println("================");
        for (int i=0; i< boardList.size(); i++) { // 게시글 있는만큼 가져오는것 해서 반복문 사용
            article article = boardList.get(i);

            System.out.println("번호: " + article.getId());
            System.out.printf("제목: %s\n", article.gettitle());
            System.out.println("================");
        }
    }
    public void printdetaillist(article article) {
        System.out.println("================");
        System.out.println("번호: " + article.getId());
        System.out.println("제목: " + article.gettitle());
        System.out.println("내용: " + article.getbody());
        System.out.println("등록날: " + article.getdate());
        System.out.println("조회수: " + article.getviewpoint());
        System.out.println("================");
    }
}
