public class Human implements IHuman, IStandardFunc {
    private String Name;
    APlace places;
    Human(String n, APlace h) {
        Name = n;
        places = h;
    }
    public void walk(APlace h){
        places = h;
        try{
            if (h == null) {
                throw new NameException();
            }
        }
        catch (NameException e){
            e.printStackTrace();
        }
        System.out.println(Name + " пошагал на место: " + places.getPlace());
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+Name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean comp = obj.hashCode()== this.hashCode() ? true : false;
        return comp;
    }
    public void somersault(APlace h){
        places = h;
        System.out.println(Name + " сделал кувырок на локации: " + places.getPlace());
    }
    public void Footprint(track k, Decor l){
        System.out.println(Name + " оставил " + k.getTracks() + " Следы на" + l.getDampEarth());
    }
    public void sing(Music k, Music.Song m){
        System.out.println(Name + " Начал играть на музыкальном инструменте" + k.getHarmonice() + " песню: " + m.getHey_animals());
    }
    public void wake_up(Decor.Bed f) {
        System.out.println(Name +" проснулся и встал с" + f.getBeds().replace('ь', 'и'));
    }
    public void sit(Decor f, APlace c,AHat a) {
      System.out.println(Name +" присел на " + f.rail() + c.getPlace()+"а" + " и нахлобучив " + a.getHat() + " на лоб, болтал ногами." );
    }
}

