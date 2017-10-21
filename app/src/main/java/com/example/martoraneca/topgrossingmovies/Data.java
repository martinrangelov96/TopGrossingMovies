package com.example.martoraneca.topgrossingmovies;

class Data {

    private static String[] moviesNames = new String[] {
            "Beauty and the Beast", "Frozen", "Harry Potter and the Deathly Hallows: Part II",
            "Avengers: Age of Ultron", "Furious 7", "The Avengers", "Jurassic World",
            "Star Wars Ep. VII: The Force Awakens", "Titanic", "Avatar"

    };

    private static String[] moviesYears = new String[]{
            "(2017)",
            "(2013)", "(2011)",
            "(2015)", "(2015)", "(2012)", "(2015)",
            "(2015)", "(1997)", "(2009)"
    };

    private static String[] moviesBoxOffices = new String[]{
            "$1,260,914,165",
            "$1,274,234,980",
            "$1,341,511,219",
            "$1,408,218,722",
            "$1,516,748,684",
            "$1,519,479,547",
            "$1,671,640,593",
            "$2,058,662,225",
            "$2,207,615,668",
            "$2,783,918,982"

    };
    private static int[] moviesPosters = new int[] {
            R.drawable.m10, R.drawable.m9, R.drawable.m8, R.drawable.m7, R.drawable.m6,
            R.drawable.m5, R.drawable.m4, R.drawable.m3, R.drawable.m2, R.drawable.m1
    };

    private static String[] place = new String[] {
            "#10", "#9", "#8", "#7", "#6", "#5",
            "#4", "#3", "#2", "#1"
    };

    private static String[] imdbLinks = new String[] {
            "http://www.imdb.com/title/tt2771200/", "http://www.imdb.com/title/tt2294629/?ref_=nv_sr_1",
            "http://www.imdb.com/title/tt1201607/?ref_=nv_sr_2", "http://www.imdb.com/title/tt2395427/?ref_=nv_sr_1",
            "http://www.imdb.com/title/tt2820852/?ref_=nv_sr_1", "http://www.imdb.com/title/tt0848228/?ref_=nv_sr_1",
            "http://www.imdb.com/title/tt0369610/?ref_=nv_sr_2", "http://www.imdb.com/title/tt2488496/?ref_=nv_sr_3",
            "http://www.imdb.com/title/tt0120338/?ref_=nv_sr_1", "http://www.imdb.com/title/tt0499549/?ref_=nv_sr_2"
    };

    static String[] getMoviesNames() {
        return moviesNames;
    }

    static String[] getMoviesYears() {
        return moviesYears;
    }

    static String[] getMoviesBoxOffices() {
        return moviesBoxOffices;
    }

    static int[] getMoviesPosters() {
        return moviesPosters;
    }

    static String[] getPlace() {
        return place;
    }

    static String[] getImdbLinks() {
        return imdbLinks;
    }
}