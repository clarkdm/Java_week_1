import java.text.DecimalFormat;
import java.util.ArrayList;

import static java.lang.Double.MAX_VALUE;

/**
 * Created by dmclark on 18/07/17.
 */
public class Paint_Wizard {
    ArrayList<Paint> bobs;

    public Paint_Wizard() {
        bobs = new ArrayList<Paint>();


    }

    private void sort() {

    }

    public void add_Paint(Paint p) {
        bobs.add(p);

    }

    public String get_least_wastes(int a) {
        String return_S = "";
        if (!bobs.isEmpty()) {
            int best = 0;
            double best_Wastes = MAX_VALUE;
            int[] best_s = new int[2];

            for (int i = 0; i < bobs.size(); i++) {
                double cuverie = bobs.get(i).get_totel_cuverie();
//                while (cuverie < a) {
//                    cuverie = cuverie + bobs.get(i).get_totel_cuverie();
//                }
                cuverie = bobs.get(i).num_Tins(a) * bobs.get(i).get_cuverie();
               // System.out.println(" "+bobs.get(i).num_Tins(a) + " ### "+ bobs.get(i).get_cuverie());
//                System.out.println(" "+cuverie + " "+ a + " ~~~~ "+"@@@@ "+(cuverie - a)+" @@@ "+ best_Wastes + " ~~~~ " + (cuverie - a));

                if (cuverie - a < best_Wastes) {
//                    System.out.println(" "+cuverie + " "+ a + " ~~~~ "+"@@@@ "+(cuverie - a)+" @@@ "+ best_Wastes + " ~~~~ " + (cuverie - a));
                    best = i;
                    best_s = new int[1];
                    best_s[0] = i;
                    best_Wastes = (cuverie - a);
                } else if (cuverie - a == best_Wastes) {
                    int x = best_s.length;
                    best_s = new int[x + 1];
                    best_s[x] = i;
                }
//                System.out.println("hi  " + best);

            }
            for (int i = 0; i < best_s.length; i++) {
                int can = bobs.get(i).num_Tins(a);
                //DecimalFormat d = new DecimalFormat("0.##");

                DecimalFormat df = new DecimalFormat("0.00");


                if (i == 0) {

                    return_S = bobs.get(best_s[i]).getName() + " cans " + can + " £" + df.format(can * bobs.get(best_s[i]).getCost());
                } else {
                    return_S = return_S + "\n" + bobs.get(best_s[i]).getName() + " cans " + can + " £" + df.format(can * bobs.get(best_s[i]).getCost());
                }
            }

            return_S = return_S + "\n" + best_Wastes/bobs.get(best).getCover() + " Litres wastes";

        }
        return return_S;
    }

    public String get_Cheapest(int a) {
        String return_S = "";
        if (!bobs.isEmpty()) {
            int best = 0;
            double Cheapest = MAX_VALUE;


            int[] best_s = new int[2];

            for (int i = 0; i < bobs.size(); i++) {
                double cuverie = bobs.get(i).get_totel_cuverie();
//                while (cuverie < a) {
//                    cuverie = cuverie + bobs.get(i).get_totel_cuverie();
//                }
                cuverie = bobs.get(i).num_Tins(a) * bobs.get(i).getCost();
                //cuverie = bobs.get(i).num_Tins(a)*bobs.get(i).get_cuverie();

                if (cuverie < Cheapest) {
                    best = i;
                    best_s = new int[1];
                    best_s[0] = i;
                    Cheapest = (cuverie);
                } else if (cuverie== Cheapest) {
                    int x = best_s.length;
                    best_s = new int[x + 1];
                    best_s[x] = i;
                }

            }
            for (int i = 0; i < best_s.length; i++) {
                int can = bobs.get(i).num_Tins(a);
                //DecimalFormat d = new DecimalFormat("0.##");

                DecimalFormat df = new DecimalFormat("0.00");


                if (i == 0) {

                    return_S = bobs.get(best_s[i]).getName() + " cans " + can + " £" + df.format(can * bobs.get(best_s[i]).getCost());
                } else {
                    return_S = return_S + "\n" + bobs.get(best_s[i]).getName() + " cans " + can + " £" + df.format(can * bobs.get(best_s[i]).getCost());
                }
            }

            // return_S = return_S + "\n" + Cheapest  + " Litres wastes";

        }
        return return_S;
    }
}



