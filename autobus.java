public class autobus
{
    private String kennzeichen;
    private int sitzplatze;
    private boolean anhanger;
    
    public autobus (String neuKennzeichen, int neuSitzplatze, boolean neuAnhanger)
    {
        kennzeichen = (neuKennzeichen);
        sitzplatze = (neuSitzplatze);
        anhanger = (neuAnhanger);
    }
    public autobus ()
    {
        kennzeichen = ("W-1234A");
        sitzplatze = (29);
        anhanger = (false);
    }
    public String getKennzeichen()
    {
     return kennzeichen;  
    }
    public int getSitzplatze()
    {
        return sitzplatze;
    }
    public boolean getAnhanger()
    {
        return anhanger;
    }
    public void setKennzeichen(String neuKennzeichen)
    {
        kennzeichen = neuKennzeichen;
        
    }
    public void setStizplatze(int neuSitzplatze)
    {
        sitzplatze = neuSitzplatze;
    }
    public void setAnhanger(boolean neuAnhanger)
    {
        anhanger = neuAnhanger;
    }
    
}