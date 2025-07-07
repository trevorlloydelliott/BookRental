public class Fiction extends Book{
    
    private String genreId;
    private String additionalFee;

    public Fiction () {

        super();
        genreId = "";
        additionalFee = "";
    }

    public Fiction (String title, String genreId, String additionalFee, Customer cust) {

        super(title, cust);
        this.genreId = genreId;
        this.additionalFee = additionalFee;
    }

    public void setGenreId (String genreId) { this.genreId = genreId; }
    public void setadditionalFee (String additionalFee) {this.additionalFee = additionalFee;}
    public String getGenreId () { return genreId; }
    public String getadditionalFee () {return additionalFee;}

    public double calcAdditionalFee () {

        double addFee = 0.0;
            
        if (additionalFee.equalsIgnoreCase("Y"))
            addFee = (super.getBookDayOfRenting() - 5) * 2;
        else if (additionalFee.equalsIgnoreCase("N"))
            addFee = 0;

        return addFee;
    }

    public double calcTotalFiction () {

        double totalFiction = 0.0;

        totalFiction = super.calcTotal() + calcAdditionalFee();

        return totalFiction;
    }
    public String SubGenre () {

        String subGenre = "";

        if (genreId.equalsIgnoreCase("H"))
            subGenre = "HORROR";
        else if (genreId.equalsIgnoreCase("F"))
            subGenre = "FANTASY";
        else if (genreId.equalsIgnoreCase("R"))
            subGenre = "ROMANCE";
        
        return subGenre;
    }

    public String toString () {

        return super.toString() + "\n Additional fee : RM" + calcAdditionalFee() + "\n Grand Total : RM" +calcTotalFiction()+ "\n Genre : " + SubGenre();
    }


}
