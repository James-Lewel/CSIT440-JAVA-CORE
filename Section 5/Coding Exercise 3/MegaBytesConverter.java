public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0) {
            System.out.print("Invalid Value");
        }
        else {
            int mb = Math.round(kiloBytes / 1024);
            int kb = kiloBytes % 1024;
            System.out.print(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }
}