import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GriffindorStudent harry = generateGriffindorStudent("Гарри Поттер");
        GriffindorStudent ron= generateGriffindorStudent("Рон Уизли");
        GriffindorStudent germiona = generateGriffindorStudent("Гермиона Грейнджер");

        System.out.println("Факультет Грифиндор");
        harry.compareTo(ron);
        harry.compareTo(germiona);
        System.out.println();
        harry.print();
        ron.print();
        germiona.print();

        PuffenduiStudent zahariya=generatePuffenduiStudent("Захария Смит");
        PuffenduiStudent sedrik=generatePuffenduiStudent("Седрик Диггори");
        PuffenduiStudent jastin =generatePuffenduiStudent("Джастин Финч-Флетчли");

        System.out.println("\nФакультет Пуфендуй");
        zahariya.compareTo(sedrik);
        zahariya.compareTo(jastin);
        System.out.println();
        zahariya.print();
        sedrik.print();
        jastin.print();

        KogtevranStudent jou= generateKogtevranStudent("Чжоу Чанг");
        KogtevranStudent padma= generateKogtevranStudent("Падма Патил");
        KogtevranStudent markus= generateKogtevranStudent("Маркус Белби");

        System.out.println("\nФакультет Когтевран");
        jou.compareTo(padma);
        jou.compareTo(markus);
        System.out.println();
        jou.print();
        padma.print();
        markus.print();

        SlitherinStudent malfoy= generateSlitherinStudent("Драко Малфой");
        SlitherinStudent greham= generateSlitherinStudent("Грэхэм Монтегю");
        SlitherinStudent gregory= generateSlitherinStudent("Грегори Гойл");

        System.out.println("\nФакультет Слизерин");
        malfoy.compareTo(greham);
        malfoy.compareTo(gregory);
        System.out.println();
        malfoy.print();
        greham.print();
        gregory.print();
        System.out.println("\nCравнение увеников Хогвартса");

        malfoy.compareTo(harry);
        malfoy.compareTo(ron);
    }
    private static GriffindorStudent generateGriffindorStudent(String name){
        return new GriffindorStudent(name,
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100));
    }
    private static PuffenduiStudent generatePuffenduiStudent(String name){
        return new PuffenduiStudent(name,
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100));
    }

    private static KogtevranStudent generateKogtevranStudent(String name){
        return new KogtevranStudent(name,
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100));
    }
    private static SlitherinStudent generateSlitherinStudent(String name){
        return new SlitherinStudent(name,
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100),
                ThreadLocalRandom.current().nextInt(0,100));
    }
}

