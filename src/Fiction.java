public class Fiction extends Book{
    
    private String genreId;

    public Fiction () {

        super();
        genreId = "";
    }

    public Fiction (String tt, String gid, Customer cust) {

        super(tt, cust);
        genreId = gid;
    }

    public void setGenreID (String gid) { genreId = gid; }
    public String getGenreId () { return genreId; }

    public String getSubGenre () {

        String subGenre = "";

        if (genreId.equalsIgnoreCase("A"))
            subGenre = "HORROR";
        else if (genreId.equalsIgnoreCase("B"))
            subGenre = "FANTASY";
        else if (genreId.equalsIgnoreCase("C"))
            subGenre = "ROMANCE";
        
        return subGenre;
    }

    public String toString () {

        return super.toString() + "\n Genre : " + getSubGenre();
    }


}
