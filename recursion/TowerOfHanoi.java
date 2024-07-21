public class TowerOfHanoi {
    private static void HanoiTower(int n ,  String src , String helper , String dest){
        if(n==1){
            System.out.println("transfer disk "+n+"from "+src+" to "+dest);
            return;
        }

    //helper is destination so we can
        HanoiTower(n-1, src ,dest, helper);

    // transfer one remaining disk to the destination from src 
    System.out.println("transfer disk "+n+" "+"from "+src+" to "+dest);

    //transfer remaining disk to the destination from helper here helper is source and source will be helper

    HanoiTower(n-1,helper,src,dest);

    }

    public static void main(String[] args) {
        int n = 3;
        HanoiTower(n, "A", "B", "C");
    }
}
