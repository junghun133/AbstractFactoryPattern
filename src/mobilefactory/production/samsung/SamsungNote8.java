package mobilefactory.production.samsung;

import mobilefactory.MobilePhone;
import mobilefactory.MobilePhoneFactory;
import mobilefactory.ModelInformation;
import mobilefactory.mobileComponent.SamsungModelDetailInformation;

public class SamsungNote8 extends MobilePhone {
    private MobilePhoneFactory mobilePhoneFactory;

    public SamsungNote8(MobilePhoneFactory mobilePhoneFactory){
        this.mobilePhoneFactory = mobilePhoneFactory;
    }

    @Override
    public void producing() {
        modelInformation = new SamsungModelDetailInformation("pjh", "201901010000", ModelInformation.SamsungModel.Note8);
        camera = mobilePhoneFactory.createCamera();
        antenna = mobilePhoneFactory.createAntenna();
        battery = mobilePhoneFactory.createBattery();
        osSoftwares = mobilePhoneFactory.createOSSoftware();
    }
}
