package fc.java.course1.poly;

public class Radio implements RemoCon {
    // chUp, chDown, volUp, volDown
    @Override
    public void chUp() {
        System.out.println("Radio 채널 업");
    }

    @Override
    public void chDown() {
        System.out.println("Radio 채널 다운");
    }

    @Override
    public void volUp() {
        System.out.println("Radio 볼륨 업");
    }

    @Override
    public void volDown() {
        System.out.println("Radio 볼룸 다운");
    }

    @Override
    public void internet() {
        System.out.println("라디오는 인터넷을 지원하지 않습니다");
    }
}
