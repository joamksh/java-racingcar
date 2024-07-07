
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = scanner.nextLine();
        System.out.println("시도할 회수는 몇회인가요?");
        int rounds = scanner.nextInt();

        RacingGameController controller = new RacingGameController();
        controller.initializeGame(carNames, rounds);
        System.out.println("실행 결과");

        for (int i = 0; i < rounds; i++) {
            controller.playRound();
            controller.getResults().forEach(System.out::println);
            System.out.println();
        }

        System.out.println(String.join(", ", controller.getWinners()) + "가 최종 우승했습니다.");
    }
}
