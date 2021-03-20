public class Moomintroll extends Human {
    private String leglength;
    APlace place;

    Moomintroll(String y,APlace p) {
        super(y, p);
        leglength = y;
    }

    public void thinking(AThink t, IHuman s) {
        System.out.println("Муми-тролль подумал про: " + s.getName()+"а"+":" + t.getType());
    }
    public void speech(Aspeech t) {
        System.out.println( t.getType() + " - сказал муми-тролль ");
    }
    public void walk(APlace h) {
        place = h;
        System.out.println("Муми-тролль пошагал на место: " + place.getPlace());
    }

    public void climbed(Decor d) {
        System.out.println("Муми-тролль спустился по : " + d.getStairs() + " ,переступая ногами размера: " + leglength);
    }
    public void Windowsill(Decor p) {
        System.out.println("Муми-тролль перебрался через: " + p.getSill());
    }

    public void look(Decor w, APlace s, APlace l) {
        place = s;
        places = l;
        System.out.println("Муми-тролль выглянул в :" + w.getWindow() + " из " + place.getPlace() + " на: " + places.getPlace());
    }

    public void drewattention(IHuman n, track t, APlace v) {
        if (t.getOpportunity() == true) {
            System.out.println("Муми-тролль увидел " + t.getTracks() + " Следы " + n.getName()+"a" + " и он возможно направился: " + v.getPlace());
        }
        else {
            System.out.println("Муми-тролль увидел " + t.getTracks() + " Следы " + n.getName()+"a" + " и не было никакой возможности определить, куда он направился.");
        }
    }
    public void watch(Decor w, IHuman s) {
        System.out.println("Муми-тролль посмотрел на :" + s.getName()+"а");
    }
    public void lookon(Decor.Bed w, IHuman n) {
            try {
                if (w.getEngaged() == false) {
                    throw new StoryException( " Нет продолжения сюжета.");
                }
            } catch(StoryException e){
                System.out.println(" Нет продолжения сюжета.");

            }
            System.out.println(w.getBeds() + n.getName()+"а" + " была пуста и сон как рукой сняло. ");
            System.out.println(" Муми-троль так и подскочил с" + w.getBeds());
    }
    public void sleep(Decor.Bed w, Atime s) {
        System.out.println("Муми-тролль лег на: " + w.getBeds() + " на " + s.getType() );
    }
    public void wake_up(Decor.Bed f, Atime p, Decor c) {
        System.out.println("Муми-тролль проснулся в: " + f.getBeds().replace('ь', 'и') + p.getType() + " смотрел в " + c.getCeiling() + ", не хотя расставаться со сном.");
    }
    public void hear(IHuman a, APlace b, Music c) {
       place = b;
        Music l = new Music();
        Music.Musical_instrument  Harmonic = l.new Musical_instrument();
        Music.Song  Hey_animals = l.new Song();
        System.out.println("Муми-тролль услышал, как " +  place.getPlace() + a.getName() + " Играл на музыкальном инструменте " + Harmonic.Harmonic() + " : " + Hey_animals.Hey_animal());
    }
    public void sit(IHuman a, Decor b ) {
        System.out.println("Муми-тролль сел рядом с : " + a.getName()+"ом" + " на " + b.rail());
    }
}



