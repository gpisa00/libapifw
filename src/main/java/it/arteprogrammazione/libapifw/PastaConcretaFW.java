package it.arteprogrammazione.libapifw;

import it.arteprogrammazione.tocook.framework.PastaAstrattaFW;

public class PastaConcretaFW extends PastaAstrattaFW {

    public PastaConcretaFW() {
    }

    public PastaConcretaFW(String nome, String descrizione, boolean fresca, long tempoCotturaMs) {
        super(nome, descrizione, fresca, tempoCotturaMs);
    }

    @Override
    public void cuoci() {
        System.out.println("Cuoci da PastaConcretaFW");
    }
}
