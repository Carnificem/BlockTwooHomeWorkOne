public class KogtevranStudent extends HogwartsStudent {
    private int intelect;
    private int wisdom;
    private int wit;
    private int creativity;


    public KogtevranStudent(String name, int powerMagic, int trancgression, int intelect, int wisdom, int wit, int creativity) {
        super(name, powerMagic, trancgression);
        this.intelect = intelect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }


    public int getIntelect() {
        return intelect;
    }

    public void setIntelect(int intelect) {
        this.intelect = intelect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    private int allPoints() {
        return intelect + wisdom + wit + creativity;

    }

    public void compareTo(KogtevranStudent kogtevranStudent) {
        int allPoints1 = allPoints();
        int allPoints2 = kogtevranStudent.allPoints();
        //int allPoints3 = allPoints();
        if (allPoints1 > allPoints2) {
            System.out.println("Студент %s лучше студента %s(%d vs %d)".formatted(
                    this.getName(),
                    kogtevranStudent.getName(),
                    allPoints1,
                    allPoints2));
        } else if (allPoints1 < allPoints2) {
            System.out.println("Студент %s лучше студента %s(%d vs %d)".formatted(
                    kogtevranStudent.getName(),
                    this.getName(),
                    allPoints2,
                    allPoints1));
        } else {
            System.out.println("Студентs %s и %s одинаковые(%d vs %d)".formatted(
                    this.getName(),
                    kogtevranStudent.getName(),
                    allPoints1,
                    allPoints2));
        }
    }

    @Override
    public String toString() {
        return super.toString()+"ум:%d,мудрость:%d,остроумие:%d,творчество:%d".formatted(intelect,wisdom,wit,creativity);
    }
}
