package task1;

public class Main {
    public static void main(String[] args) {
       Player player = new Player();
       player.play();
       player.pause();
       player.record();
       player.stop();


    }
}


class Player implements Playable, Recodable {

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void record() {
        System.out.println("Запись");
    }

    @Override
    public void pause() {
        System.out.println("Пауза");
    }

    @Override
    public void stop() {
        System.out.println("Стоп");
    }

}

