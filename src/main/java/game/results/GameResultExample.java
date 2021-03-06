package game.results;

import java.time.Duration;

public class GameResultExample {

    public static void main(String[] args) {
        GameResultDao gameResultDao = GameResultDao.getInstance();
        GameResult gameResult = GameResult.builder()
                .player("orszaghlev")
                .solved(true)
                .steps(92)
                .pushes(30)
                .duration(Duration.ofMinutes(3))
                .build();
        gameResultDao.persist(gameResult);
        System.out.println(gameResult);
        System.out.println(gameResultDao.findBest(5));
    }

}
