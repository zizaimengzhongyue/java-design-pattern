public class Mac {
    private Application steam;
    private Application battleNet;
    private Application intellliJ;

    public Mac(Application steam, Application battleNet, Application intellliJ) {
        this.steam = steam;
        this.battleNet = battleNet;
        this.intellliJ = intellliJ;
    }

    public void work() {
        System.out.println("进入工作模式");
        this.steam.off();
        this.battleNet.off();
        this.intellliJ.on();
    }

    public void rest() {
        System.out.println("进入休闲模式");
        this.intellliJ.off();
        this.battleNet.on();
        this.steam.on();
    }
}