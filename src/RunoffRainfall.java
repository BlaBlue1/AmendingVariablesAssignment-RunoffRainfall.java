public class RunoffRainfall {
    public static void main(String[] args)
    {
        float runoff = 0;
        float runoffPerGallons = 0;
        int roofDimension1 = 50;
        int roofDimension2 = 20;
        int numberOfInches = 12;
        runoff = ((roofDimension1 * numberOfInches) *  (roofDimension2 * numberOfInches));
        runoffPerGallons = (runoff/231 );

        System.out.println("Runoff per inches is " + runoff);
        System.out.println("Runoff per gallon is " + runoffPerGallons);

    }
}
