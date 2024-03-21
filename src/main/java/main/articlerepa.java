package main;
import java.util.ArrayList;
import main.butil;
public class articlerepa {
    ArrayList<article> articleList = new ArrayList<>();
    butil butil = new butil();
    int latestarticleid = 4;

    public articlerepa() {
        TestData();
    }

    public void TestData() {
        article a1 = new article(1, "안녕하세요 반갑습니다. 자바 공부중이에요.", "자바 공부중", 0, butil.getCurrentTime());
        article a2 = new article(2, "자바 질문좀 할게요~", "자바 질문좀 함", 0, butil.getCurrentTime());
        article a3 = new article(3, "정처기 따야되나요?", "자격증 따야댐?", 0, butil.getCurrentTime());
        articleList.add(a1);
        articleList.add(a2);
        articleList.add(a3);
    }

    public ArrayList<article> findarticlekeyword(String keyword) {
        ArrayList<article> searchedList = new ArrayList<>();

        for (int i = 0; i < articleList.size(); i++) {
            article article = articleList.get(i);
            if(article.gettitle().contains(keyword)) {
                searchedList.add(article);
            }

        }
        return searchedList;
    }


    public article findarticleid(int id) {
        for (int i = 0; i < articleList.size(); i++) {
            article article = articleList.get(i);
            if (article.getId() == id) {
                   return article;
            }
        }
        return null;
    }

    public void deletearticle(article article) {articleList.remove(article);}

    public void updatearticle(article article, String newtitle, String newbody) {
        article.settitle(newtitle);
        article.setbody(newbody);
    }

    public ArrayList<article> findall() {return articleList;}

    public article savearticle(String title, String body) {
        article article = new article(latestarticleid, title, body, 0, butil.getCurrentTime());
        articleList.add(article);
        latestarticleid++;

        return article;
    }
}

