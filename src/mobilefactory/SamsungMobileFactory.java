package mobilefactory;

import mobilefactory.mobileComponent.Antenna;
import mobilefactory.mobileComponent.Battery;
import mobilefactory.mobileComponent.Camera;
import mobilefactory.mobileComponent.OSSoftware;
import mobilefactory.outSourcing.*;
import mobilefactory.production.samsung.SamsungAntenna;
import mobilefactory.production.samsung.SamsungBattery;
import mobilefactory.production.samsung.SamsungCamera;

public class SamsungMobileFactory implements MobilePhoneFactory{
    @Override
    public Camera createCamera() {
        return new SamsungCamera();
    }

    @Override
    public Battery createBattery() {
        return new SamsungBattery();
    }

    @Override
    public OSSoftware[] createOSSoftware() {
        OSSoftware[] osSoftwares = {
                new TelephoneCallSoftware(),
                new MessageSoftware(),
                new MemoSoftware(),
                new KakaoSoftware(),
                new PlayStore()
        };
        return osSoftwares;
    }

    @Override
    public Antenna createAntenna() {
        return new SamsungAntenna();
    }
}
