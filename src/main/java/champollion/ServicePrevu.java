package champollion;

class SuperPrevu {
    private int volumeCM;
    private int volumeTD;
    private int volumeTP;

    public SuperPrevu() {
        this.volumeCM = 0;
        this.volumeTD = 0;
        this.volumeTP = 0;
    }

    public void ajouteEnseignement(int cm, int td, int tp) {
        this.volumeCM += cm;
        this.volumeTD += td;
        this.volumeTP += tp;
    }
    public int getVolumeCM() {
        return volumeCM;
    }

    public int getVolumeTD() {
        return volumeTD;
    }

    public int getVolumeTP() {
        return volumeTP;
    }

}