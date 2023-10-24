import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.*;
import ru.gbhw.*;


public class VehicleTest {

    Car car;
    Motorcycle moto;

    @BeforeEach
    void setUp(){
        car = new Car("Nissan", "Silvia", 2002);
        moto = new Motorcycle("Yamaha", "R1", 2006);
    }

    @Test
    void instanceOf() {
        assertThat(car instanceof Vehicle);
    }

    @Test
    void WheelsCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void MotorcycleWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    @Test
    void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void testDriveMotorcycle() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    @Test
    void parkCar() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void parkMotorcycle() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}