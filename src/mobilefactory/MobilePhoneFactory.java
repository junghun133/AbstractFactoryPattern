package mobilefactory;

import mobilefactory.mobileComponent.Antenna;
import mobilefactory.mobileComponent.Battery;
import mobilefactory.mobileComponent.Camera;
import mobilefactory.mobileComponent.OSSoftware;

public interface MobilePhoneFactory {
    public Camera createCamera();
    public Battery createBattery();
    public OSSoftware[] createOSSoftware();
    public Antenna createAntenna();
}
