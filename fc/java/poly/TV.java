package fc.java.poly;

public class TV implements RemoCon {

    private int currentCh = 10;


    @Override
    public void chUp() {
        currentCh++;
        System.out.println("TV 채널 업@ 현재 채널 : " + currentCh);
        if (currentCh > RemoCon.MAXCH) {
            currentCh = 0;
        }

    }

    @Override
    public void chDown() {
        currentCh--;
        System.out.println("TV 채널 다운 @ 현재채널 : " + currentCh);
        if (currentCh < MINCH) {
            currentCh = 101;
        }
    }

    @Override
    public void volUp() {
        System.out.println("TV 볼륨 업");
    }

    @Override
    public void volDown() {
        System.out.println("TV 볼룸 다운");
    }

    @Override
    public void internet() {
        System.out.println("tv에서는 인터넷이 지원이 된다");
    }
}
