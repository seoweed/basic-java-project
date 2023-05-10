package fc.java.course1.model;

public class MovieVO {
    private String title;
    private String date;
    private String actor;
    private String jang;
    private int runningTime;
    private int grade;

    public MovieVO(String title, String date, String actor, String jang, int runningTime, int grade) {
        this.title = title;
        this.date = date;
        this.actor = actor;
        this.jang = jang;
        this.runningTime = runningTime;
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getJang() {
        return jang;
    }

    public void setJang(String jang) {
        this.jang = jang;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", actor='" + actor + '\'' +
                ", jang='" + jang + '\'' +
                ", runningTime=" + runningTime +
                ", grade=" + grade +
                '}';
    }
}
