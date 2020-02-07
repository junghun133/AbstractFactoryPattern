package mobilefactory.production.ios;

import mobilefactory.MobilePhone;
import mobilefactory.MobilePhoneFactory;
import mobilefactory.ModelInformation;
import mobilefactory.mobileComponent.IOSModelDetailInformation;

public class IOSIPhone11 extends MobilePhone {
    MobilePhoneFactory mobilePhoneFactory;

    public IOSIPhone11(MobilePhoneFactory mobilePhoneFactory){
        this.mobilePhoneFactory = mobilePhoneFactory;
    }

    @Override
    public void producing() {
        modelInformation = new IOSModelDetailInformation("pjh", "201901010000", ModelInformation.IOSModel.IPhone11);
        camera = mobilePhoneFactory.createCamera();
        antenna = mobilePhoneFactory.createAntenna();
        battery = mobilePhoneFactory.createBattery();
        osSoftwares = mobilePhoneFactory.createOSSoftware();
    }
}
