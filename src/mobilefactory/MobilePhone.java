package mobilefactory;

import mobilefactory.mobileComponent.*;

public abstract class MobilePhone  {
    public ModelDetailInformation modelInformation;
    public Camera camera;
    public Antenna antenna;
    public Battery battery;
    public OSSoftware[] osSoftwares;

    public abstract void producing();
}
