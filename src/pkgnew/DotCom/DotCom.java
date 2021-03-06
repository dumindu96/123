package pkgnew.DotCom;

import java.util.*;

public class DotCom
{
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs)
    {
        locationCells = locs;
    }

    public void setName(final String n)
    {
        name = n;
    }

    public String checkYourself(String userInput)
    {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if(index >= 0)
        {
            locationCells.remove(index);
            if(locationCells.isEmpty())
            {
                result = "kill";
                System.out.println("Ouch! you sunk "+name+" : ( ");
            }
            else
                result = "hit";
        }
        return result;
    }
}