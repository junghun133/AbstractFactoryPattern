package mobilefactory.mobileComponent;

import mobilefactory.ModelInformation;

public class IOSModelDetailInformation extends ModelDetailInformation{
    private ModelInformation.IOSModel iosModel;

    public IOSModelDetailInformation(String producer, String releaseDate, ModelInformation.IOSModel iosModel){
        this.producer = producer;
        this.releaseDate = releaseDate;
        this.iosModel = iosModel;
    }

    public ModelInformation.IOSModel getIosModel(){
        return iosModel;
    }
}
