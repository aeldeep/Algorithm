package com.eldeep;

import java.util.List;

public class Alladin {
	/*int[] gas = {2,4,5,2};
    int[] dist = {4,3,1,3};
    int gasSize = gas.length;
    
    
    for(int i = 0; i < gasSize; i++){
        int totalGas = 0;
        
        int steps = 0;
        while(steps < gasSize){
            int stop = steps + i;
            if(stop >= gasSize){
                stop -= gasSize;
            }
            totalGas += gas[stop];
            totalGas -= dist[stop];
            
            if(totalGas < 0){
                break;
            }
            
            steps += 1;
        }
        if(totalGas >= 0){
            System.out.println(i);
        }
        
    }*/
    
    ////////////////////////
    public static int optimalPoint(List<Integer> magic, List<Integer> dist)
    {
        int magicSize = magic.size();

        for (int i = 0; i < magicSize; i++)
        {
            int magicSource = 0;
            int steps = 0;

            while (steps < magicSize)
            {
                int stop = steps + i;
                if(stop >= magicSize)
                {
                    stop -= magicSize;
                }

                magicSource += magic.get(stop);
                magicSource -= dist.get(stop);

                if(magicSource < 0)
                {
                    break;
                }

                steps += 1;
            }

            if (magicSource >= 0)
            {
                return i;
            }
        }

        return -1;
    }


}



