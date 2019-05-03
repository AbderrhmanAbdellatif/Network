
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class Test {

    
    public static void main(String[] args) throws InterruptedException {

        // create gpio controller
        final GpioController gpio = GpioFactory.getInstance();

        final GpioPinDigitalOutput out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, PinState.LOW);
        final GpioPinDigitalOutput out1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, PinState.LOW);

	
		out.high();
		System.out.println("1");
		Thread.sleep(1750);
		System.out.println("2");
		out.low();
		
		

	
    }
}
