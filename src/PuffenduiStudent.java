public class PuffenduiStudent extends HogwartsStudent {
    private int diligance;
    private int loyality;
    private int honesty;


    public PuffenduiStudent(String name, int powerMagic, int trancgression, int diligance, int loyality, int honesty) {
        super(name, powerMagic, trancgression);
        this.diligance = diligance;
        this.loyality = loyality;
        this.honesty = honesty;
    }


    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getDiligance() {
        return diligance;
    }

    public void setDiligance(int diligance) {
        this.diligance = diligance;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int allPoints() {
        return diligance + loyality + honesty;

    }

    public void compareTo(PuffenduiStudent puffenduiStudent) {
        int allPoints1 = allPoints();
        int allPoints2 = puffenduiStudent.allPoints();
        //int allPoints3 = allPoints();
        if (allPoints1 > allPoints2) {
            System.out.println("Студент %s лучше студента %s(%d vs %d)".formatted(
                    this.getName(),
                    puffenduiStudent.getName(),
                    allPoints1,
                    allPoints2));
        } else if (allPoints1 < allPoints2) {
            System.out.println("Студент %s лучше студента %s(%d vs %d)".formatted(
                    puffenduiStudent.getName(),
                    this.getName(),
                    allPoints2,
                    allPoints1));
        } else {
            System.out.println("Студентs %s и %s одинаковые(%d vs %d)".formatted(
                    this.getName(),
                    puffenduiStudent.getName(),
                    allPoints1,
                    allPoints2));
        }
    }

    @Override
    public String toString() {
        return super.toString()+"трудолюбие:%d,верность:%d,честность:%d".formatted(diligance,loyality,honesty);
    }
}

