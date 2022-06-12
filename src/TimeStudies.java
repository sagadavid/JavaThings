import java.time.LocalDateTime;

public class TimeStudies
{
    public static void main(String[] args)
    {
        var now = LocalDateTime.now();
        var monthNo = now.getMonthValue();
        var monthName = now.getMonth();
        System.out.println(now + " monthNo: " + monthNo + " monthName: " + monthName);
        System.out.println(monthNo);

// if there is no break switch proceeds cases
// and you may not get your wanted result
        switch (monthNo) {
            case 3:
                System.out.println("hei");
                break;
            case 4:
                System.out.println("no break here");
            case 5:
                System.out.println("no break here");
            case 6:
                System.out.println("haziran");
                break;
            default:
                System.out.println("no problem");
        }
    }
}
