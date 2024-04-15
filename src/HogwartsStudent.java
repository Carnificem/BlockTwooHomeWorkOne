public abstract class HogwartsStudent {
    private String name;
    private int powerMagic;
    private int trancgression;

    public HogwartsStudent(String name, int powerMagic, int trancgression) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.trancgression = trancgression;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTrancgression() {
        return trancgression;
    }

    public void setTrancgression(int trancgression) {
        this.trancgression = trancgression;
    }

    private int allPoints() {
        return powerMagic + trancgression;

    }

    public void compareTo(HogwartsStudent hogwartsStudent) {
        int allPoints1 = allPoints();
        int allPoints2 = hogwartsStudent.allPoints();
        //int allPoints3 = allPoints();
        if (allPoints1 > allPoints2) {
            System.out.println("Студент %s лучше студента %s(%d vs %d)".formatted(
                    this.getName(),
                    hogwartsStudent.getName(),
                    allPoints1,
                    allPoints2));
        } else if (allPoints1 < allPoints2) {
            System.out.println("Студент %s лучше студента %s(%d vs %d)".formatted(
                    hogwartsStudent.getName(),
                    this.getName(),
                    allPoints2,
                    allPoints1));
        }
        else {
            System.out.println("Студентs %s и %s одинаковые(%d vs %d)".formatted(
                    this.getName(),
                    hogwartsStudent.getName(),
                    allPoints1,
                    allPoints2));
        }
    }

    @Override
    public String toString() {
        return "%s - сила магии: %d, сила трансгресии: %d".formatted(name,powerMagic,trancgression);
    }
    public void print(){
        System.out.println(this);
    }
}



