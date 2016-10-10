package fr.p10.miage.rps.model;

import org.omg.CORBA.Object;
import org.testng.annotations.DataProvider;

/**
 * Created by mouna on 03/10/2016.
 */
public class RockPaperScissors {

    public RockPaperScissors(){
    }


    public Result playL(RPSEnum p1, RPSEnum p2){
        return Result.LOST;
    }


    public Result playW(RPSEnum p1, RPSEnum p2){
        return Result.WIN;
    }

    public Result playT(RPSEnum p1, RPSEnum p2){
        return Result.TIE;
    }
}
