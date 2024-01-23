

public class Service {

    public double doHardWork (String workType, int someIntValue) {
        switch (workType) {
            case "work1":
                someIntValue = 1 * someIntValue;
                System.out.println("result is: " + someIntValue);
                return someIntValue;
            case "work2":
                someIntValue = 2 * someIntValue;
                System.out.println("result is: " + someIntValue);
                return someIntValue;
            case "work3":
                someIntValue = 3 * someIntValue;
                System.out.println("result is: " + someIntValue);
                return someIntValue;
        }
        return someIntValue;
    }
}
