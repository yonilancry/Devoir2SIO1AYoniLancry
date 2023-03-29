package Tests;

import Entities.Exo2.Formation;
import Entities.Exo2.Participant;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class FormationTest
{
    private Formation formation;
    private Participant participant1;
    private Participant participant2;
    private Participant participant3;
    private Participant participant4;
    private Participant participant5;
    @BeforeEach
    void setUp()
    {
        formation = new Formation(1,"Excel", 150);
        participant1 = new Participant(1,"Gand", false, 45);
        participant2 = new Participant(2,"Alison", true, 90);
        participant3 = new Participant(3,"Muller", true, 111);
        participant4 = new Participant(4,"Fortin", false, 17);
        participant5 = new Participant(5,"Cousinot", true, 34);
    }

    @org.junit.jupiter.api.Test
    void getNombreDePresents()
    {

        // Cas n°1 : On ajoute les 2 premiers participants à la formation

        formation.AjouterParticipant(participant1);
        formation.AjouterParticipant(participant2);
        int actual = 1;
        int expected=formation.GetNombreDePresents();

        assertEquals(actual,expected);

        // Cas n°2 : on ajoute le reste des participants

        formation.AjouterParticipant(participant3);
        formation.AjouterParticipant(participant4);
        formation.AjouterParticipant(participant5);
        actual=3;
        expected=formation.GetNombreDePresents();
        assertEquals(actual,expected);



    }

    @org.junit.jupiter.api.Test
    void calculerFraisRemboursementKilometriques()
    {
        // Cas n°1 : On ajoute les 3 premiers participants à la formation
        formation.AjouterParticipant(participant1);
        formation.AjouterParticipant(participant2);
        formation.AjouterParticipant(participant3);
        double actual=;
        double expected=formation.CalculerFraisRemboursementKilometriques();
        assertEquals(actual, expected);


        // Cas n°2 : on ajoute le reste des participants
        formation.AjouterParticipant(participant4);
        formation.AjouterParticipant(participant5);
         actual=;
         expected=formation.CalculerFraisRemboursementKilometriques();
        assertEquals(actual, expected);

    }

    @org.junit.jupiter.api.Test
    void tauxDePresence()
    {
        // Cas n°1 : On ajoute les 2 premiers participants à la formation

        formation.AjouterParticipant(participant1);
        formation.AjouterParticipant(participant2);
        double actual =50;
        double expected=formation.TauxDePresence();

        assertEquals(actual,expected);


        // Cas n°2 : on ajoute le reste des participants

        formation.AjouterParticipant(participant3);
        formation.AjouterParticipant(participant4);
        formation.AjouterParticipant(participant5);
        actual=66.66;
        expected=formation.TauxDePresence();
        assertEquals(actual,expected);

    }

    @org.junit.jupiter.api.Test
    void beneficeFormation()
    {
        // Cas n°1 : On ajoute les 2 premiers participants à la formation

        formation.AjouterParticipant(participant1);
        formation.AjouterParticipant(participant2);
        double actual =;
        double expected=formation.BeneficeFormation();

        assertEquals(actual,expected);

        // Cas n°2 : on ajoute le reste des participants

        formation.AjouterParticipant(participant3);
        formation.AjouterParticipant(participant4);
        formation.AjouterParticipant(participant5);
        actual=;
        expected=formation.BeneficeFormation();
        assertEquals(actual,expected);

    }
}