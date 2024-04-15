public class GriffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GriffindorStudent(String name, int powerMagic, int trancgression, int nobility, int honor, int bravery) {
        super(name, powerMagic, trancgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int allPointsg() {
        return bravery + honor + nobility;

    }

    public void compareTo(GriffindorStudent griffindorStudent) {
        int allPoints1 = allPointsg();
        int allPoints2 = griffindorStudent.allPointsg();
        //int allPoints3 = allPoints();
        if (allPoints1 > allPoints2) {
            System.out.println("Студент %s лучше студента %s(%d vs %d)".formatted(
                    this.getName(),
                    griffindorStudent.getName(),
                    allPoints1,
                    allPoints2));
        } else if (allPoints1 < allPoints2) {
            System.out.println("Студент %s лучше студента %s(%d vs %d)".formatted(
                    griffindorStudent.getName(),
                    this.getName(),
                    allPoints2,
                    allPoints1));
        } else {
            System.out.println("Студентs %s и %s одинаковые(%d vs %d)".formatted(
                    this.getName(),
                    griffindorStudent.getName(),
                    allPoints1,
                    allPoints2));
        }
    }

    @Override
    public String toString() {
        return super.toString()+",благородство:%d,честь:%d,храбрость:%d".formatted(nobility,honor,bravery);
    }
}
