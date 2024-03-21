package main;

public class article {
    private int id;
    private String title;
    private String body;
    private int viewpoint;
    private String date;
    public article(int id, String title, String body, int viewpoint, String date) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.viewpoint = viewpoint;
        this.date = date;
    }
    public void risingviewpoint() {this.viewpoint++;}

    public int getviewpoint() {return viewpoint;}
    public void setviewpoint(int viewpoint) {this.viewpoint = viewpoint;}

    public int getId() {return id;}
    public void setid(int id) {this.id = id;}

    public String gettitle() {return title;}
    public void settitle(String title) {this.title = title;}

    public String getbody() {return body;}
    public void setbody(String body) {this.body = body;}

    public String getdate() {return date;}
    public void setdate(String date) {this.date = date;}
}
