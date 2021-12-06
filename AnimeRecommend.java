// ISO 8859-15 Encoding

import java.util.Scanner;

class AnimeRecommend
{
    public static void main(String [] args)
    {
        // Scanner Creation
        Scanner scanner = new Scanner(System.in);
        
        // Variables
        String ActionRec = "Hunter x Hunter 2011";
        String AdventureRec = "Made in Abyss (\u30e1\u30a4\u30c9\u30a4\u30f3\u30a2\u30d3\u30b9)";
        String ComedyRec = "Haven't You Heard? I'm Sakamoto (\u5742\u672c\u3067\u3059\u304c\uff1f)";
        String DramaRec = "I Want to Eat Your Pancreas (\u541b\u306e\u81b5\u81d3\u3092\u305f\u3079\u305f\u3044)"; // The name only makes sense if you watch it.
        String FantasyRec = "Fate Series";
        String HorrorRec = "Higurashi: When They Cry (\u3072\u3050\u3089\u3057\u306e\u306a\u304f\u9803\u306b)";
        String MysteryRec = "Hyouka (\u6c37\u83d3)";
        String PsycologicalRec = "Classroom of the Elite (\u3088\u3046\u3053\u305d\u5b9f\u529b\u81f3\u4e0a\u4e3b\u7fa9\u306e\u6559\u5ba4\u3078)";
        String RomanceRec = "Clannad & Clannad: After Story";
        String ScienceFictionRec = "Steins;Gate";
        String SliceOfLifeRec = "Barakamon (\u3070\u3089\u304b\u3082\u3093)";
        String SupernaturalRec = "Rascal Does Not Dream of Bunny Girl Senpai (\u9752\u6625\u30d6\u30bf\u91ce\u90ce\u306f\u30d0\u30cb\u30fc\u30ac\u30fc\u30eb\u5148\u8f29\u306e\u5922\u3092\u898b\u306a\u3044)"; // This is very deceptively named.
        String ThrillerRec = "Re:ZERO -Starting Life in Another World- (\u0052\u0065\u003a\u30bc\u30ed\u304b\u3089\u59cb\u3081\u308b\u7570\u4e16\u754c\u751f\u6d3b)";


        String hasWatchedAnimeQuestion;
        boolean hasWatchedAnimeStatus = false;
        String genreRecFor;

        String anotherRecQuestion;
        boolean anotherRecStatus = true;

        System.out.println("Genre Options Are (Verbatim): Action, Adventure, Comedy, Drama, Fantasy, Horror, Mystery, Psycological, Romance, Sci-Fi, Slice Of Life, Supernatural, Thriller.");

        System.out.println("Have you watched anime before? (y/n)");
        hasWatchedAnimeQuestion = scanner.nextLine();
        if (hasWatchedAnimeQuestion.equals("y"))
        {
            hasWatchedAnimeStatus = true;
        }
        else if (hasWatchedAnimeQuestion.equals("n"))
        {
            hasWatchedAnimeStatus = false;
        }
        else // Default Case.
        {
            System.out.println("Error");
        }

        if (hasWatchedAnimeStatus == true)
        {
            System.out.println("How many anime seasons/movies have you watched?");
            double numberOfAnimeWatched = scanner.nextInt();
            double percentError = Math.abs(numberOfAnimeWatched-500) / 500;
            if (percentError < 0)
            {
                System.out.println("You have watched less anime than me, keep going.");
            }
            else if (percentError == 0)
            {
                System.out.println("You have watched the same amount of anime as me, wow, that's a lot.");
            }
            else if (percentError > 0)
            {
                System.out.println("You have watched more anime than me, that's impresive.");
            }
            // https://anilist.co/user/Phoenski/
        }
        else if (hasWatchedAnimeStatus == false)
        {
            System.out.println("I recommend setting up an account on anilist.co or simmilar sites if you plan to watch anime seriously.");
        }

        do
        {
            System.out.println("What genre do you want a recomendation for?");
            genreRecFor = scanner.nextLine(); //I'm not sure why, but every time you enter "y" for hasWatchedAnimeStatus, genreRecFor is set to " ".

            if (genreRecFor.equals("Action"))
            {
                System.out.println("I recommend " + ActionRec + " for an Action anime.");
            }
            else if (genreRecFor.equals("Adventure"))
            {
                System.out.println("I recommend " + AdventureRec + " for an Adventure anime.");
            }
            else if (genreRecFor.equals("Comedy"))
            {
                System.out.println("I recommend " + ComedyRec + " for a Comedy anime.");
            }
            else if (genreRecFor.equals("Drama"))
            {
                System.out.println("I recommend " + DramaRec + " for a Drama anime.");
            }
            else if (genreRecFor.equals("Fantasy"))
            {
                System.out.println("I recommend " + FantasyRec + " for a Fantasy anime.");
            }
            else if (genreRecFor.equals("Horror"))
            {
                System.out.println("I recommend " + HorrorRec + " for a Horror anime.");
            }
            else if (genreRecFor.equals("Mystery"))
            {
                System.out.println("I recommend " + MysteryRec + " for a Mystery anime.");
            }
            else if (genreRecFor.equals("Psycological"))
            {
                System.out.println("I recommend " + PsycologicalRec + " for a Psycological anime.");
            }
            else if (genreRecFor.equals("Romance"))
            {
                System.out.println("I recommend " + RomanceRec + " for a Romance anime.");
            }
            else if (genreRecFor.equals("Sci-Fi"))
            {
                System.out.println("I recommend " + ScienceFictionRec + " for a Sci-Fi anime.");
            }
            else if (genreRecFor.equals("Slice Of Life"))
            {
                System.out.println("I recommend " + SliceOfLifeRec + " for a Slice Of Life anime.");
            }
            else if (genreRecFor.equals("Supernatural"))
            {
                System.out.println("I recommend " + SupernaturalRec + " for a Supernatural anime.");
            }
            else if (genreRecFor.equals("Thriller"))
            {
                System.out.println("I recommend " + ThrillerRec + " for a Thriller anime.");
            }
            else // Default Case.
            {
                System.out.println("Error");
            }

            System.out.println("Do you want another recomendation? (y/n)");
            anotherRecQuestion = scanner.nextLine();
            if (anotherRecQuestion.equals("y"))
            {
                anotherRecStatus = true;
            }
            else if (anotherRecQuestion.equals("n"))
            {
                anotherRecStatus = false;
            }
        } while (anotherRecStatus == true);
        

    } 
}