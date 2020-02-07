package mobilefactory;

import mobilefactory.mobileComponent.Antenna;
import mobilefactory.mobileComponent.Battery;
import mobilefactory.mobileComponent.Camera;
import mobilefactory.mobileComponent.OSSoftware;
import mobilefactory.outSourcing.*;
import mobilefactory.production.ios.IOSAntenna;
import mobilefactory.production.ios.IOSBattery;
import mobilefactory.production.ios.IOSCamera;

public class IOSMobileFactory implements MobilePhoneFactory{
    @Override
    public Camera createCamera() {
        return new IOSCamera();
    }

    @Override
    public Battery createBattery() {
        return new IOSBattery();
    }

    @Override
    public OSSoftware[] createOSSoftware() {
        OSSoftware[] osSoftwares = {
                new TelephoneCallSoftware(),
                new MessageSoftware(),
                new MemoSoftware(),
                new KakaoSoftware(),
                new AppStore()
        };
        return osSoftwares;
    }

    @Override
    public Antenna createAntenna() {
        return new IOSAntenna();
    }
}
