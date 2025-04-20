public class Rooms {
    private int roomNumber;
    private String roomType;
    private int totalSystems;
    private int totalChairs;
    private int totalTable;
    private int totalSofa;
    private int totalDustbin;
    private int totalCctv;
    private int totalWaterdispenser;
    private int totalFireextinguisher;
    private int totalPrinter;
    private int totalProjector;
    private int totalTv;
    private int totalBoard;


    public Rooms(int roomNumber, String roomType, int totalSystems, int totalChairs,
                 int totalTable, int totalSofa, int totalDustbin, int totalCctv, int totalWaterdispenser,
                 int totalFireextinguisher, int totalPrinter, int totalProjector, int totalTv, int totalBoard)

    {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.totalSystems = totalSystems;
        this.totalChairs = totalChairs;
        this.totalTable = totalTable;
        this.totalSofa = totalSofa;
        this.totalDustbin = totalDustbin;
        this.totalCctv = totalCctv;
        this.totalWaterdispenser = totalWaterdispenser;
        this.totalFireextinguisher = totalFireextinguisher;
        this.totalPrinter = totalPrinter;
        this.totalProjector = totalProjector;
        this.totalTv = totalTv;
        this.totalBoard = totalBoard;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getTotalSystems() {
        return totalSystems;
    }

    public int getTotalChairs() {
        return totalChairs;
    }

    public int getTotalTable() {
        return totalTable;
    }

    public int getTotalSofa() {
        return totalSofa;
    }

    public int getTotalDustbin(){
        return totalDustbin;
    }

    public int getTotalCctv(){
        return totalCctv;
    }

    public int getTotalWaterdispenser(){
        return totalWaterdispenser;
    }

    public int getTotalFireextinguisher(){
        return totalFireextinguisher;
    }

    public int getTotalPrinter() {
        return totalPrinter;
    }

    public int getTotalProjector() {
        return totalProjector;
    }

    public int getTotalTv(){
        return totalTv;
    }

    public int getTotalBoard(){
        return totalBoard;
    }


    @Override
    public String toString() {
        return  "\n" + "ROOM NO: " + roomNumber + "\n" +
                "TYPE: " + roomType + "\n" +
                "Systems: " + totalSystems + "\n" +
                "Chairs: " + totalChairs + "\n" +
                "Table: " + totalTable + "\n" +
                "Sofa: " + totalSofa + "\n" +
                "Dustbin: " + totalDustbin + "\n" +
                "Cctv: " + totalCctv + "\n" +
                "WaterDispenser: " + totalWaterdispenser + "\n" +
                "FireExtinguisher: " + totalFireextinguisher + "\n" +
                "Printer: " + totalPrinter + "\n" +
                "Projector: " + totalProjector + "\n" +
                "Tv: " + totalTv + "\n" +
                "Board: " + totalBoard ;

    }
}
