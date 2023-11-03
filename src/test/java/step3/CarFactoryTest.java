package step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step3.domain.Car;
import step3.domain.CarFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarFactoryTest {
    private CarFactory carFactory;

    public void setUp() {
        this.carFactory = new CarFactory();
    }

    @DisplayName("입력2만큼 자동차만들기")
    @Test
    public void 입력수만큼차량생성() {
        //given
        setUp();
        int create = 2;
        //when
        carFactory.participants(create);
        List<Car> cars = carFactory.carsInfo();
        //then
        assertThat(cars.size()).isEqualTo(create);
    }

    @DisplayName("입력0으로 자동차생성된 자동차 없음")
    @Test
    public void 자동차생성실패() {
        //given
        setUp();
        int create = 0;
        //when
        carFactory.participants(create);
        List<Car> cars = carFactory.carsInfo();
        assertThat(cars.size()).isEqualTo(create);
    }

    @DisplayName("입력3만큼 횟수만들기")
    @Test
    public void 입력만큼_횟수생성() {
        //given
        setUp();
        int create = 3;
        //when
        carFactory.attempts(create);
        //then
        assertThat(carFactory.tryCount()).isEqualTo(create);
    }
}