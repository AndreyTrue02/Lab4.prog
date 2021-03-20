public class Bird implements ABird {
    private String Name;
    APlace places;
    Bird(String n) {
        Name = n;
    }
    public void fly(APlace h){
        places = h;
        System.out.println(Name + " Полетела на " + places.getPlace());
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
}
