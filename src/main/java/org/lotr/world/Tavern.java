package org.lotr.world;

public class Tavern extends AbstractBuilding{
    public Tavern(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println("Tavern recruits heroes.");
        // Logika rekrutacji postaci
    }
}
