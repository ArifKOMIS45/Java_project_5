package GameGuess;

import static GameGuess.GuessGame.LetsGuess;
import static GameGuess.GuessGame.randomGenerator;

public class MainClas {

    /*
     In the main method

     First get the random number from the randomGenerator method

     Then call the LetsGuess method . randomGenerator num is parameter of the LetsGuess method

      */

    /*

        Main methodunda

     İlk olarak randomGenerator method undan random sayıyı alın

     Sonra LetsGuess method unu çağırın. randomGenerator num LetsGuess method unun parametresidir

     */


    public static void main(String[] args) {

      LetsGuess(randomGenerator());

    }


}
