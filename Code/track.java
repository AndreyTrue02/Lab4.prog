public class track {
   private String Tracks ;
   private boolean Opportunity;
    public enum kinds {
        Запутанные,
        Куриные,
        Длинные,
        Перекрещивающиеся;
    }
    public boolean getOpportunity(){
        return false;
    }
    public String getTracks() {
       kinds[] all = kinds.values();
       Tracks = "";
       for (kinds kinds : all) {
           Tracks += kinds + " ";
       }
       return Tracks;
   }
}
