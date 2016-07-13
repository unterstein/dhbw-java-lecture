package ba.java.uebungen;

import ba.java.auto.AudiQFuenf;
import ba.java.auto.OpelAstra;
import ba.java.auto.Pkw;
import ba.java.auto.VwPassat;

import java.util.ArrayList;
import java.util.List;

public class LateBindingUebung {

    public static void main(String[] args) {
        // initialize
        List<Pkw> fuhrpark = new ArrayList<>();
        fuhrpark.add(new AudiQFuenf());
        fuhrpark.add(new OpelAstra());
        fuhrpark.add(new VwPassat());
        fuhrpark.add(new VwPassat());


        // trigger `Wartung`
        for (Pkw pkw : fuhrpark) {
            if (pkw.brauchtWartung()) { // <<-- LateBinding!
                // schick den halt zur Wartung
                System.out.println(pkw.getClass().getSimpleName() + " braucht wartung");
            }
        }
    }
}
