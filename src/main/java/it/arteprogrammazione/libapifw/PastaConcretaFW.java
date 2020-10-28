package it.arteprogrammazione.libapifw;

import it.arteprogrammazione.tocook.framework.PastaAstrattaFW;

public class PastaConcretaFW extends PastaAstrattaFW {


    public PastaConcretaFW(String nome, String descrizione, boolean fresca, long tempoCotturaMs) {
        super(nome, descrizione, fresca, tempoCotturaMs);
    }

    @Override
    public void cuoci() {
        System.out.println("Metodo cuoci di PastaConcretaFW");
        System.out.println("Nome : " + getNome());
        System.out.println("Descrizione : " + getDescrizione());
        System.out.println("Fresca : " + isFresca());
        System.out.println("Tempo Cottura (ms) : " + getTempoCotturaMs());
    }
}
