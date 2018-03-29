
class SalaryType {
    public static final int YEARLYSALARYTOTAL11000 = 11000;
    public static final int YEARLYSALARYTOTAL27000 = 27000;
    public static final int YEARLYSALARYTOTAL97000 = 97000;
    public static final int TAXRATEFOR11000 = 15/100;
    public static final int TAXRATEFOR27000 = 20/100;
    public static final int TAXRATEFOR97000 = 27/100;
    public static final int TAXRATEFORMORETHAN97000 = 27/100;
    public static final int TAXFOR27000 = 1650;
    public static final int TAXFOR97000 = 4850;
    public static final int TAXFORMORE97000 = 23750;
    
    enum DownloadType { YEARLYSALARYTOTAL11000, YEARLYSALARYTOTAL27000, YEARLYSALARYTOTAL97000 ,
    		TAXRATEFOR11000,TAXRATEFOR27000,TAXRATEFOR97000,TAXRATEFORMORETHAN97000,TAXFOR27000 ,TAXFOR97000,TAXFORMORE97000}
}