package org.lotr.main;

import org.lotr.team.Team;
import org.lotr.Trip.Trip;
import org.lotr.entities.characters.Elf;
import org.lotr.entities.characters.Hobbit;
import org.lotr.world.*;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        //tworzymy świat
        BasicWorld middleEarth = BasicWorld.getInstance();

        //Tworzę regiony

        Region shire = new Region("Shire");
        Region lonelyMountain = new Region("LonelyMountain");

        //Dodawanie regionów do świata

        middleEarth.addRegion(shire);
        middleEarth.addRegion(lonelyMountain);

        //Dodawanie miast do regionów

        City hobbiton = new City("Hobbiton",shire, -4, 5);
        City erebor = new City("Erebor",lonelyMountain, 2,2);

        //dodanie miast do regionów
        shire.addCity(hobbiton);
        lonelyMountain.addCity(erebor);

        //Dodanie budynków

        hobbiton.addBuilding(new FishingHut("GounlyFishingHut"));
        hobbiton.addBuilding(new Bakery("BallyBakery"));
        hobbiton.addBuilding(new Tavern("TurryTavern"));

        erebor.addBuilding(new Tavern("GrimmlyTavern"));
        erebor.addBuilding(new Mine("MithrilMine"));

        //wyswietlanie swiata
        PrintStream printf = System.out.printf(middleEarth.toString());

        //tworzenie druzyny

        Team team = Team.getInstance("Drużyna pierścienia",hobbiton);

        //tworzenie postaci

        Hobbit hobbit = new Hobbit("Frodo",50,20,10,15,5,10,20, 20);
        Elf elf = new Elf("Legolas",50,20,10,15,5,10,20);

        team.showTeamStatus();

        team.addMember(hobbit);
        team.addMember(elf);

        team.showTeamStatus();

       team.getMembers().forEach(member -> {
           System.out.println(member.getName());
       });
        System.out.println(team.getCurrentCity().getName());
        System.out.println("/////");
        Trip trip = new Trip(team, erebor);
        Thread tripThread = new Thread(trip);
        tripThread.start();
        System.out.println("/////");
        System.out.println(team.getCurrentCity().getName());



    }
}