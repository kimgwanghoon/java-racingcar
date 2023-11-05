package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.CarFactory;
import racingcar.strategy.MoveStrategy;
import racingcar.strategy.RandomMoveStrategy;
import racingcar.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class RaceController {

    private static final MoveStrategy MOVE_STRATEGY = new RandomMoveStrategy();

    public void startRace(String carNumber, int moveNumber) {
        CarFactory carFactory = new CarFactory();
        OutputView outputView = new OutputView();
        carFactory.participants(carNumber);
        List<Car> cars = carFactory.carsInfo();

        for (int i = 0; i < moveNumber; i++) {
            moveCars(cars);
            outputView.print(cars.stream().map(Car::toString).collect(Collectors.toList()));
        }
    }

    public void moveCars(List<Car> cars) {
        for (Car car : cars) {
            car.move(MOVE_STRATEGY.move());
        }
    }
}
