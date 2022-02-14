package fr.zanzucchi;

import java.util.*;

public class Exercice2 {

    public void exo2() {

        Scanner scan = new Scanner(System.in);
        int[] tableNotes = new int[0];
        int valeur;
        int repetitionMin = 0, repetitionMax=0;
        int min=21;
        int max=-1;

        do{

            int[] temporaireTables =new int[tableNotes.length];

            ///methode qui copier table note a l'indice 0 vers le temporaire table note a l'indice 0
            System.arraycopy(tableNotes,0,temporaireTables,0,temporaireTables.length);

            System.out.println("Saisisez vos note");
            valeur = scan.nextInt();

            if(valeur>1 || valeur<20)
            {
                tableNotes = new int[temporaireTables.length+1];
                System.arraycopy(temporaireTables,0,tableNotes,0,temporaireTables.length);
                tableNotes[tableNotes.length]=valeur;
            }
            else
                System.out.println("Saisisez une note entre 0 et 20");

            }while(valeur>=0 && valeur<=20);

            for(int i=0;i<tableNotes.length;i++)
            {
                if(tableNotes[i]>max)
                {
                   max=tableNotes[i]=max;
                   repetitionMax=1;
                }else if(tableNotes[i]==max)
                {
                    repetitionMax++;
                }
                if(tableNotes[i]<min)
                {
                    min=tableNotes[i]=min;
                    repetitionMin=1;
                }else if(tableNotes[i]==min)
                {
                    repetitionMin++;
                }
            }

        System.out.println("votre note max est "+max+"avec "+repetitionMax+"repetition");
        System.out.println("votre note min est "+min+"avec "+repetitionMin+"repetition");

        }


    }






