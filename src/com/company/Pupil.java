package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pupil
{
   private String fio;

   public Pupil (String name)
   {
       this.fio = name;
   }

   private class Diary
   {
       ArrayList <Integer> physical_training = new ArrayList<>();
       ArrayList <Integer> physics = new ArrayList<>();
       ArrayList <Integer> literature =new ArrayList<>();
       ArrayList <Integer> mathematics = new ArrayList<>();

       public ArrayList DiaryLiterature (int rating)
       {
            this.literature.add(rating) ;
            return this.literature;
       }
       public ArrayList DiaryPhysical_training (int rating)
       {
           this.physical_training.add(rating) ;
           return this.physical_training;
       }
       public ArrayList DiaryPhysics (int rating)
       {
           this.physics.add(rating) ;
           return this.physics;
       }
       public ArrayList DiaryMathematics (int rating)
       {
           this.mathematics.add(rating) ;
           return this.mathematics;
       }

        public int Max_in_literature (ArrayList arr)
        {
            int max;
            max = (int) Collections.max(arr);
            return max;
        }

        public int Min_in_literature (ArrayList arr)
        {
            int min;
            min = (int) Collections.min(arr);
            return min;
        }

       public int Max_in_mathematics (ArrayList arr)
       {
           int max;
           max = (int) Collections.max(arr);
           return max;
       }

       public int Min_in_mathematics (ArrayList arr)
       {
           int min;
           min = (int) Collections.min(arr);
           return min;
       }

       public int Max_in_physical_training (ArrayList arr)
       {
           int max;
           max = (int) Collections.max(arr);
           return max;
       }

       public int Min_in_physical_training (ArrayList arr)
       {
           int min;
           min = (int) Collections.min(arr);
           return min;
       }

       public int Max_in_physics (ArrayList arr)
       {
           int max;
           max = (int) Collections.max(arr);
           return max;
       }

       public int Min_in_physics (ArrayList arr)
       {
           int min;
           min = (int) Collections.min(arr);
           return min;
       }

       public double Average_physics (ArrayList arr)
       {
           double sum = 0;
           for (int i = 0; i < arr.size(); i++)
           {
               sum = sum + (int) arr.get(i);
           }
           return sum / arr.size();
       }
   }


}
