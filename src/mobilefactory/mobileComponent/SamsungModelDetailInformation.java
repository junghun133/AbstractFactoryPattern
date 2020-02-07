package mobilefactory.mobileComponent;

import mobilefactory.ModelInformation;

public class SamsungModelDetailInformation extends ModelDetailInformation{
    private ModelInformation.SamsungModel samsungModel;

    public SamsungModelDetailInformation(String producer, String releaseDate, ModelInformation.SamsungModel samsungModel){
        this.producer = producer;
        this.releaseDate = releaseDate;
        this.samsungModel = samsungModel;
    }

    public ModelInformation.SamsungModel getSamsungModel(){
        return samsungModel;
    }

}
