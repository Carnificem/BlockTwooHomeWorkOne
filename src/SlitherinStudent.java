public class SlitherinStudent extends HogwartsStudent{
    private int trickness;
    private int resoluteness;
    private int ambitiousness;
    private int resourcefulness;
    private int thirstPower;

    public SlitherinStudent(String name, int powerMagic, int trancgression, int trickness,
                            int resoluteness, int ambitiousness, int resourcefulness, int thirstPower) {
        super(name, powerMagic, trancgression);
        this.trickness = trickness;
        this.resoluteness = resoluteness;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getTrickness() {
        return trickness;
    }

    public void setTrickness(int trickness) {
        this.trickness = trickness;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void setThirstPower(int thirstPower) {
        this.thirstPower = thirstPower;
    }
    private int allPoints() {
        return trickness+resoluteness+ambitiousness+resourcefulness+thirstPower;

    }

    public void compareTo(SlitherinStudent slitherinStudent) {
        int allPoints1 = allPoints();
        int allPoints2 = slitherinStudent.allPoints();
        //int allPoints3 = allPoints();
        if (allPoints1 > allPoints2) {
            System.out.println("Студент %s лучше студента %s(%d vs %d)".formatted(
                    this.getName(),
                    slitherinStudent.getName(),
                    allPoints1,
                    allPoints2));
        } else if (allPoints1 < allPoints2) {
            System.out.println("Студент %s лучше студента %s(%d vs %d)".formatted(
                    slitherinStudent.getName(),
                    this.getName(),
                    allPoints2,
                    allPoints1));
        } else {
            System.out.println("Студентs %s и %s одинаковые(%d vs %d)".formatted(
                    this.getName(),
                    slitherinStudent.getName(),
                    allPoints1,
                    allPoints2));
        }
    }

    @Override
    public String toString() {
        return super.toString()+"хитрость:%d,решительность:%d,амбициозность:%d,находчивость:%d,жажда власти:%d".formatted
                (trickness,resoluteness,ambitiousness,resourcefulness,thirstPower);
    }
}

