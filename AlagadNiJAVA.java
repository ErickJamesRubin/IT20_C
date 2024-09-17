public class AlagadNiJAVA {
    public static void main(String[] args) {
        String [][] motor = {
            {"XRM","DUCATTI","SNIPER 150"},
            {"HONDA","RAIDER","RUSI 1000"},
            {"BAJAJ","SKY GO","AEROX"},
        };
        
        for (int i = 0;i<motor.length;i++){
            for (int j = 0;j<motor[i].length;j++){
                System.out.print(motor[i][j] + " ");
            }
            System.out.println();
        }
    }
}