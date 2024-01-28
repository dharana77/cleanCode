package me.jinyoung.meaningfulName;

import java.util.ArrayList;
import java.util.List;

public class MeaningfulName {
    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for(Cell cell: gameBoard){
            if(cell.isFlagged()){
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }


}
