package com.green.day16.ch7;

public interface PlayingCard {
    //public static final
    //인터페이스 명과 어울리는 데이터들이 들어있어야 함. ex) PlayingCard인데 car, wheel, handle etc...

    int CLOVER = 1;

    //public abstract 자동으로 붙음
    String getCardNumber();

}

interface DeepPlayingCard extends PlayingCard{
    String getCardKind();
}

class PlayCard implements DeepPlayingCard {
// implements 사용 시 메소드를 전부 override 해줘야함.
    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}

class PlayCardTest {
    public static void main(String[] args) {
        PlayingCard pc = new PlayCard(); // PlayingCard가 알고있는 메소드만 사용 가능하다.
                                         // 다형성
                                         // 나 자신의 객체주소값도 담을 수 있지만, 자식객체도 담을 수 있다.
                                            // 나를 implements 한 주소값도 담을 수 있다.
        pc.getCardNumber();
        DeepPlayingCard dpc = (DeepPlayingCard) pc; // getCardKind는 DeepPlayingCard에 있으므로 dpc로 형변환. (타입 맞춰서)
        dpc.getCardKind();
        dpc.getCardNumber();
        System.out.println("---------끝--------");
    }
}