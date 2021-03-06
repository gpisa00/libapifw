package it.arteprogrammazione.libapifw;

import it.arteprogrammazione.tocook.framework.Framework;
import it.arteprogrammazione.tocook.oop.CucinaConcreta;
import it.arteprogrammazione.tocook.oop.CucinaInterfaccia;
import it.arteprogrammazione.tocook.oop.SezioneEnum;
import it.arteprogrammazione.tocook.topdown.Utility;

public class Main {

    private static CucinaInterfaccia cucina;

    public static void main(String[] args) throws Exception {

        System.out.println("\n###### CUCINA TOP-DOWN (LIBRERIA) ##########");

        cuociProcedurale();

        System.out.println("\n-------------------------------------------------");

        System.out.println("\n###### CUCINA OOP (API) ##########");

        cuociOOP();

        System.out.println("\n-------------------------------------------------");

        System.out.println("\n###### CUCINA FRAMEWORK (FRAMEWORK) ##########");

        Framework.startFramework(new PastaConcretaFW("Rigatoni", "Rigatoni pasta corta",false, 15000L));
    }

    private static void cuociProcedurale() {
        Utility.cucinaPasta("Sugo");
    }

    private static void cuociOOP() {

       // PastaLunga l = new PastaLunga();
        cucina = new CucinaConcreta();

        cucina.cuociPastaLunga("Spaghetti",
                "pasta ottima con il tonno",
                false,
                3000,
                SezioneEnum.TONDA,
                25);

        cucina.cuociPastaCorta("Gnocchi",
                "pasta ottima con il sugo",
                true,
                1000,
                false);
    }


}
