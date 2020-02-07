package mobilefactory;

import mobilefactory.mobileComponent.IOSModelDetailInformation;
import mobilefactory.mobileComponent.ModelDetailInformation;
import mobilefactory.mobileComponent.SamsungModelDetailInformation;
import mobilefactory.production.ios.IOSIPhone11;
import mobilefactory.production.ios.IOSIPhone11Pro;
import mobilefactory.production.samsung.SamsungNote10;
import mobilefactory.production.samsung.SamsungNote8;
import mobilefactory.production.samsung.SamsungNote9;

public class VietnamFactory {

    MobilePhone createMobilePhone(ModelDetailInformation modelDetailInformation){

        if(modelDetailInformation instanceof SamsungModelDetailInformation)
            return SamsungVietnamFactory((SamsungModelDetailInformation)modelDetailInformation);

        else if(modelDetailInformation instanceof IOSModelDetailInformation)
            return AppleVietnamFactory((IOSModelDetailInformation)modelDetailInformation);

        return null;
    }

    private MobilePhone SamsungVietnamFactory(SamsungModelDetailInformation samsungModelDetailInformation){
        SamsungMobileFactory samsungMobileFactory = new SamsungMobileFactory();

        MobilePhone mobilePhone = null;

        switch (samsungModelDetailInformation.getSamsungModel()){
            case Note8:
                mobilePhone = new SamsungNote8(samsungMobileFactory);
                break;

            case Note9:
                mobilePhone = new SamsungNote9(samsungMobileFactory);
                break;

            case Note10:
                mobilePhone = new SamsungNote10(samsungMobileFactory);
                break;
        }
        return mobilePhone;
    }

    private MobilePhone AppleVietnamFactory(IOSModelDetailInformation iosModelDetailInformation){
        IOSMobileFactory iosMobileFactory = new IOSMobileFactory();

        MobilePhone mobilePhone = null;
        switch (iosModelDetailInformation.getIosModel()){
            case IPhone11:
                mobilePhone = new IOSIPhone11(iosMobileFactory);
                break;

            case IPhone11Pro:
                mobilePhone = new IOSIPhone11Pro(iosMobileFactory);
                break;
        }

        return mobilePhone;
    }
}
