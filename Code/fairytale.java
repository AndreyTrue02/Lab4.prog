public class fairytale {
    public static void main(String[] args) {
        System.out.println();
        Place House = new Place("Дом");
        Place courtyard = new Place("Двор");
        Place East = new Place(" Восток ");
        Place Bridge = new Place("Мост");
        Place River = new Place("Река");
        Place Longaway = new Place("Далеко-Далеко ");
        Time sleep = new Time(" Сто дней и ночей ");
        Time awake = new Time(" Долго ");
        Bird cuckoo = new Bird(" Кукушка");
        Moomintroll Moomintroll = new Moomintroll("коротенькие", courtyard);
        Think Ofcourse = new Think(" Ну конечно! Шляпы тоже нигде не видать");
        Think aga = new Think(": Ага, Снусмумрик воспользовался веревочной лестницей.");
        Aspeech Wow = new Aspeech(" - Это надо же!");
        Aspeech Hay = new Aspeech(" - Привет, ");
        Human Snusnumbric = new Human("Снусмумрик", House) {
        };
        Decor.Bed Bed = new Decor.Bed();
        Decor window = new Decor();
        Decor Stairs = new Decor();
        Decor DampEarth = new Decor();
        Decor Sill = new Decor();
        Decor nothing = new Decor();
        Decor rail = new Decor();
        Decor Ceiling =new Decor();
        Music harmonice = new Music();
        Music.Song Hey_animals = new Music.Song();
        AHat Hat = new AHat("Старую");
        Think kuv = new Think(": Это он от радости. А вот тут он перекувырнулся, уж это точно. ");
        track sled  = new track();
        Moomintroll.sleep(Bed,sleep );
        Snusnumbric.wake_up(Bed);
        Snusnumbric.walk(courtyard);
        Snusnumbric.somersault(courtyard);
        Snusnumbric.Footprint(sled, DampEarth);
        Snusnumbric.walk(Bridge);
        Snusnumbric.sit(rail,Bridge,Hat);
        Snusnumbric.sing(harmonice,Hey_animals);
        cuckoo.fly(East);
        Moomintroll.wake_up(Bed,awake,Ceiling);
        Moomintroll.lookon(Bed,Snusnumbric);
        Moomintroll.thinking(Ofcourse,Snusnumbric);
        Moomintroll.speech(Wow);
        Moomintroll.look(window, House, courtyard);
        Moomintroll.thinking(aga, Snusnumbric);
        Moomintroll.Windowsill(Sill);
        Moomintroll.climbed(Stairs);
        Moomintroll.walk(courtyard);
        Moomintroll.drewattention(Snusnumbric, sled, courtyard);
        Moomintroll.thinking(kuv, Snusnumbric);
        Moomintroll.hear(Snusnumbric,Longaway,harmonice,Hey_animals);
        Moomintroll.walk(River);
        Moomintroll.watch(nothing,Snusnumbric);
        Moomintroll.speech(Hay);
        Moomintroll.sit(Snusnumbric,rail);
    }
}
